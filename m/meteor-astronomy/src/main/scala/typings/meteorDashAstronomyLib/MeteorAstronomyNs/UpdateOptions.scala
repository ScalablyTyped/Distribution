package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends UpsertOptions {
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(multi: js.UndefOr[scala.Boolean] = js.undefined, upsert: js.UndefOr[scala.Boolean] = js.undefined): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[UpdateOptions]
  }
}

