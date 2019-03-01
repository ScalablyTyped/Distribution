package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadPreferenceString extends js.Object {
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
}

object Anon_ReadPreferenceString {
  @scala.inline
  def apply(readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null): Anon_ReadPreferenceString = {
    val __obj = js.Dynamic.literal()
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReadPreferenceString]
  }
}

