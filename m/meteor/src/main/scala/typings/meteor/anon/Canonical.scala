package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canonical extends js.Object {
  var canonical: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Boolean | Double | String] = js.undefined
}

object Canonical {
  @scala.inline
  def apply(canonical: js.UndefOr[Boolean] = js.undefined, indent: Boolean | Double | String = null): Canonical = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical.get.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canonical]
  }
}

