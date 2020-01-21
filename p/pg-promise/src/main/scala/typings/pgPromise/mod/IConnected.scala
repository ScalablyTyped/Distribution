package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import typings.spex.mod.ISpexBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Database object in connected state;
@js.native
trait IConnected[Ext, C /* <: IClient */]
  extends IBaseProtocol[Ext]
     with ISpexBase {
  val client: C = js.native
  def done(): Unit = js.native
}

