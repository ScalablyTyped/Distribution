package typings.mongodb

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadPreference extends js.Object {
  var readPreference: ReadPreferenceOrMode
  var session: js.UndefOr[ClientSession] = js.undefined
}

object AnonReadPreference {
  @scala.inline
  def apply(readPreference: ReadPreferenceOrMode, session: ClientSession = null): AnonReadPreference = {
    val __obj = js.Dynamic.literal(readPreference = readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadPreference]
  }
}

