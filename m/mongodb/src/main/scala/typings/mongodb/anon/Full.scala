package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
}

object Full {
  @scala.inline
  def apply(full: js.UndefOr[Boolean] = js.undefined, readPreference: ReadPreferenceOrMode = null): Full = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

