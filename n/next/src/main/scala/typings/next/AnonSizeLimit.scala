package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeLimit extends js.Object {
  var sizeLimit: js.UndefOr[Double | String] = js.undefined
}

object AnonSizeLimit {
  @scala.inline
  def apply(sizeLimit: Double | String = null): AnonSizeLimit = {
    val __obj = js.Dynamic.literal()
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeLimit]
  }
}

