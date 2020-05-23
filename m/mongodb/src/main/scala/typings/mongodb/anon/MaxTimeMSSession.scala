package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxTimeMSSession extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object MaxTimeMSSession {
  @scala.inline
  def apply(maxTimeMS: js.UndefOr[Double] = js.undefined, session: ClientSession = null): MaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTimeMSSession]
  }
}

