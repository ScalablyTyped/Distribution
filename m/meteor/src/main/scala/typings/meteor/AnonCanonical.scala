package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanonical extends js.Object {
  var canonical: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Boolean | Double | String] = js.undefined
}

object AnonCanonical {
  @scala.inline
  def apply(canonical: js.UndefOr[Boolean] = js.undefined, indent: Boolean | Double | String = null): AnonCanonical = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanonical]
  }
}

