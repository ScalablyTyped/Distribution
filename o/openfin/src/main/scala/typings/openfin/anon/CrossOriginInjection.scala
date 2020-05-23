package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossOriginInjection extends js.Object {
  var crossOriginInjection: js.UndefOr[Boolean] = js.undefined
  var sameOriginInjection: js.UndefOr[Boolean] = js.undefined
}

object CrossOriginInjection {
  @scala.inline
  def apply(
    crossOriginInjection: js.UndefOr[Boolean] = js.undefined,
    sameOriginInjection: js.UndefOr[Boolean] = js.undefined
  ): CrossOriginInjection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crossOriginInjection)) __obj.updateDynamic("crossOriginInjection")(crossOriginInjection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sameOriginInjection)) __obj.updateDynamic("sameOriginInjection")(sameOriginInjection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOriginInjection]
  }
}

