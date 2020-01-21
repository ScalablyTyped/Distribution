package typings.mongodb

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxTimeMSSession extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object AnonMaxTimeMSSession {
  @scala.inline
  def apply(maxTimeMS: Int | Double = null, session: ClientSession = null): AnonMaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxTimeMSSession]
  }
}

