package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMSReadPreference extends js.Object {
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_MaxTimeMSReadPreference {
  @scala.inline
  def apply(
    maxTimeMS: scala.Int | scala.Double = null,
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null,
    session: mongodbLib.mongodbMod.ClientSession = null
  ): Anon_MaxTimeMSReadPreference = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_MaxTimeMSReadPreference]
  }
}

