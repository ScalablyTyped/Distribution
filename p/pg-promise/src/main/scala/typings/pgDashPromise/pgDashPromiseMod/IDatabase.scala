package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.XPromise
import typings.pgDashPromise.typescriptPgDashSubsetMod.IConnectionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Database full protocol;
// API: http://vitaly-t.github.io/pg-promise/Database.html
//
// We export this interface only to be able to help IntelliSense cast extension types correctly,
// which doesn't always work, depending on the version of IntelliSense being used.
@js.native
trait IDatabase[Ext] extends IBaseProtocol[Ext] {
  @JSName("$cn")
  val $cn: String | IConnectionParameters = js.native
  /////////////////////////////////////////////////////////////////////////////
  // Hidden, read-only properties, for integrating with third-party libraries:
  @JSName("$config")
  val $config: ILibConfig[Ext] = js.native
  @JSName("$dc")
  val $dc: js.Any = js.native
  @JSName("$pool")
  val $pool: js.Any = js.native
  def connect(): XPromise[IConnected[Ext]] = js.native
  def connect(options: IConnectionOptions): XPromise[IConnected[Ext]] = js.native
}

