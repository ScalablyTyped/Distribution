package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxTimeMS extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
}

object MaxTimeMS {
  @scala.inline
  def apply(maxTimeMS: js.UndefOr[Double] = js.undefined, readPreference: ReadPreferenceOrMode = null): MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTimeMS]
  }
}

