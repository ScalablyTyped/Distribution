package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends UpsertOptions {
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined, upsert: js.UndefOr[Boolean] = js.undefined): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

