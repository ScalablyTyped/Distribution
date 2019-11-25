package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import typings.mongodb.mongodbMod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadPreferenceSession extends js.Object {
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_ReadPreferenceSession {
  @scala.inline
  def apply(readPreference: ReadPreferenceOrMode = null, session: ClientSession = null): Anon_ReadPreferenceSession = {
    val __obj = js.Dynamic.literal()
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReadPreferenceSession]
  }
}

