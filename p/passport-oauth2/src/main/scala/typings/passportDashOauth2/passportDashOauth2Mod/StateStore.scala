package typings.passportDashOauth2.passportDashOauth2Mod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStore extends js.Object {
  def store(req: Request, callback: StateStoreStoreCallback): Unit = js.native
  def store(req: Request, meta: Metadata, callback: StateStoreStoreCallback): Unit = js.native
  def verify(req: Request, state: String, callback: StateStoreVerifyCallback): Unit = js.native
  def verify(req: Request, state: String, meta: Metadata, callback: StateStoreVerifyCallback): Unit = js.native
}

