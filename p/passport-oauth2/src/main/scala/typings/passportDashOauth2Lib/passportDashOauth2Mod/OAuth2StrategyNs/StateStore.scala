package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStore extends js.Object {
  def store(req: expressLib.expressMod.eNs.Request, callback: StateStoreStoreCallback): scala.Unit = js.native
  def store(req: expressLib.expressMod.eNs.Request, meta: Metadata, callback: StateStoreStoreCallback): scala.Unit = js.native
  def verify(
    req: expressLib.expressMod.eNs.Request,
    state: java.lang.String,
    callback: StateStoreVerifyCallback
  ): scala.Unit = js.native
  def verify(
    req: expressLib.expressMod.eNs.Request,
    state: java.lang.String,
    meta: Metadata,
    callback: StateStoreVerifyCallback
  ): scala.Unit = js.native
}

