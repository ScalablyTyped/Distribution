package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Session {
  @scala.inline
  def apply(readPreference: ReadPreferenceOrMode = null, session: ClientSession = null): Session = {
    val __obj = js.Dynamic.literal()
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

