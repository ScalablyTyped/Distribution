package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeLimit extends js.Object {
  var sizeLimit: js.UndefOr[Double | String] = js.undefined
}

object SizeLimit {
  @scala.inline
  def apply(sizeLimit: Double | String = null): SizeLimit = {
    val __obj = js.Dynamic.literal()
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeLimit]
  }
}

