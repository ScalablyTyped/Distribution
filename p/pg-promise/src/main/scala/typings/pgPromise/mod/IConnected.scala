package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import typings.spex.mod.ISpexBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database object in connected state;
// API: https://vitaly-t.github.io/pg-promise/Database.html#connect
@js.native
trait IConnected[Ext, C /* <: IClient */]
  extends IBaseProtocol[Ext]
     with ISpexBase {
  
  val client: C = js.native
  
  def done(): Unit = js.native
  def done(kill: Boolean): Unit = js.native
}
