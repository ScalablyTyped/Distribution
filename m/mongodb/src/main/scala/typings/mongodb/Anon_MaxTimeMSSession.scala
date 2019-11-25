package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMSSession extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_MaxTimeMSSession {
  @scala.inline
  def apply(maxTimeMS: Int | Double = null, session: ClientSession = null): Anon_MaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxTimeMSSession]
  }
}

