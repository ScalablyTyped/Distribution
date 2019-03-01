package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[mongodbLib.mongodbMod.ReadPreference | java.lang.String] = js.undefined
}

object Anon_Full {
  @scala.inline
  def apply(
    full: js.UndefOr[scala.Boolean] = js.undefined,
    readPreference: mongodbLib.mongodbMod.ReadPreference | java.lang.String = null
  ): Anon_Full = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Full]
  }
}

