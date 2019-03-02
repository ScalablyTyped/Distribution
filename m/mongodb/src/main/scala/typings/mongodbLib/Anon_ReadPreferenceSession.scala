package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadPreferenceSession extends js.Object {
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_ReadPreferenceSession {
  @scala.inline
  def apply(
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null,
    session: mongodbLib.mongodbMod.ClientSession = null
  ): Anon_ReadPreferenceSession = {
    val __obj = js.Dynamic.literal()
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_ReadPreferenceSession]
  }
}

