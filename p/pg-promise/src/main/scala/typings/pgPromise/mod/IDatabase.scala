package typings.pgPromise.mod

import typings.pgPromise.typescriptPgSubsetMod.IClient
import typings.pgPromise.typescriptPgSubsetMod.IConnectionParameters
import typings.pgPromise.typescriptPgSubsetMod.IPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database full protocol;
// API: http://vitaly-t.github.io/pg-promise/Database.html
//
// We export this interface only to be able to help IntelliSense cast extension types correctly,
// which doesn't always work, depending on the version of IntelliSense being used.
@js.native
trait IDatabase[Ext, C /* <: IClient */]
  extends StObject
     with IBaseProtocol[Ext] {
  
  @JSName("$cn")
  val $cn: String | IConnectionParameters[C] = js.native
  
  /////////////////////////////////////////////////////////////////////////////
  // Hidden, read-only properties, for integrating with third-party libraries:
  @JSName("$config")
  val $config: ILibConfig[Ext, C] = js.native
  
  @JSName("$dc")
  val $dc: Any = js.native
  
  @JSName("$pool")
  val $pool: IPool = js.native
  
  def connect(): js.Promise[IConnected[Ext, C]] = js.native
  def connect(options: IConnectionOptions[C]): js.Promise[IConnected[Ext, C]] = js.native
}
