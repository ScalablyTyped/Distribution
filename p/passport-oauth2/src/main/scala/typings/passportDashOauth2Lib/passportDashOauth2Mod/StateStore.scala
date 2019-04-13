package typings
package passportDashOauth2Lib.passportDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStore extends js.Object {
  def store(req: expressLib.expressMod.Request, callback: StateStoreStoreCallback): scala.Unit = js.native
  def store(req: expressLib.expressMod.Request, meta: Metadata, callback: StateStoreStoreCallback): scala.Unit = js.native
  def verify(req: expressLib.expressMod.Request, state: java.lang.String, callback: StateStoreVerifyCallback): scala.Unit = js.native
  def verify(
    req: expressLib.expressMod.Request,
    state: java.lang.String,
    meta: Metadata,
    callback: StateStoreVerifyCallback
  ): scala.Unit = js.native
}

