package typings.mongodb

import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxTimeMS extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
}

object AnonMaxTimeMS {
  @scala.inline
  def apply(maxTimeMS: Int | Double = null, readPreference: ReadPreferenceOrMode = null): AnonMaxTimeMS = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxTimeMS]
  }
}

