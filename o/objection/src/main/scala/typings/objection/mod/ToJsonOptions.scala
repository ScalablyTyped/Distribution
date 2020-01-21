package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJsonOptions extends CloneOptions {
  var virtuals: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object ToJsonOptions {
  @scala.inline
  def apply(shallow: js.UndefOr[Boolean] = js.undefined, virtuals: Boolean | js.Array[String] = null): ToJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    if (virtuals != null) __obj.updateDynamic("virtuals")(virtuals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToJsonOptions]
  }
}

