package typings.mongodb

import typings.mongodb.mongodbMod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
}

object Anon_Full {
  @scala.inline
  def apply(full: js.UndefOr[Boolean] = js.undefined, readPreference: ReadPreferenceOrMode = null): Anon_Full = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    __obj.asInstanceOf[Anon_Full]
  }
}

