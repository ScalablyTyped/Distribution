package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadPreference extends js.Object {
  var readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_ReadPreference {
  @scala.inline
  def apply(
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String,
    session: mongodbLib.mongodbMod.ClientSession = null
  ): Anon_ReadPreference = {
    val __obj = js.Dynamic.literal(readPreference = readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_ReadPreference]
  }
}

