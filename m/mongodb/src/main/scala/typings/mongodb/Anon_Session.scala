package typings.mongodb

import typings.bson.bsonMod.Timestamp
import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Session extends js.Object {
  var session: js.UndefOr[ClientSession] = js.undefined
  var startAtOperationTime: js.UndefOr[Timestamp] = js.undefined
}

object Anon_Session {
  @scala.inline
  def apply(session: ClientSession = null, startAtOperationTime: Timestamp = null): Anon_Session = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    if (startAtOperationTime != null) __obj.updateDynamic("startAtOperationTime")(startAtOperationTime)
    __obj.asInstanceOf[Anon_Session]
  }
}

