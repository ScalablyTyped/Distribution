package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SizeLimit extends js.Object {
  var sizeLimit: js.UndefOr[Double | String] = js.undefined
}

object Anon_SizeLimit {
  @scala.inline
  def apply(sizeLimit: Double | String = null): Anon_SizeLimit = {
    val __obj = js.Dynamic.literal()
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SizeLimit]
  }
}

