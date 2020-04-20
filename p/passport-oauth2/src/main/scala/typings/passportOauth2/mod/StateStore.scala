package typings.passportOauth2.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStore extends js.Object {
  def store(req: Request_[ParamsDictionary, _, _, Query], callback: StateStoreStoreCallback): Unit = js.native
  def store(req: Request_[ParamsDictionary, _, _, Query], meta: Metadata, callback: StateStoreStoreCallback): Unit = js.native
  def verify(req: Request_[ParamsDictionary, _, _, Query], state: String, callback: StateStoreVerifyCallback): Unit = js.native
  def verify(
    req: Request_[ParamsDictionary, _, _, Query],
    state: String,
    meta: Metadata,
    callback: StateStoreVerifyCallback
  ): Unit = js.native
}

