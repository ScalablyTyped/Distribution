package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import typings.mongodb.mongodbMod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadPreference extends js.Object {
  var readPreference: ReadPreferenceOrMode
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_ReadPreference {
  @scala.inline
  def apply(readPreference: ReadPreferenceOrMode, session: ClientSession = null): Anon_ReadPreference = {
    val __obj = js.Dynamic.literal(readPreference = readPreference)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_ReadPreference]
  }
}

