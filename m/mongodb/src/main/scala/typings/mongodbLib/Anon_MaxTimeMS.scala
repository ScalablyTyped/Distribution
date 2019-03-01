package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMS extends js.Object {
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
}

object Anon_MaxTimeMS {
  @scala.inline
  def apply(
    maxTimeMS: scala.Int | scala.Double = null,
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null
  ): Anon_MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxTimeMS]
  }
}

