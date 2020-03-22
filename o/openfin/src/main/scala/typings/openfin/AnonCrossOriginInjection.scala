package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrossOriginInjection extends js.Object {
  var crossOriginInjection: js.UndefOr[Boolean] = js.undefined
  var sameOriginInjection: js.UndefOr[Boolean] = js.undefined
}

object AnonCrossOriginInjection {
  @scala.inline
  def apply(
    crossOriginInjection: js.UndefOr[Boolean] = js.undefined,
    sameOriginInjection: js.UndefOr[Boolean] = js.undefined
  ): AnonCrossOriginInjection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crossOriginInjection)) __obj.updateDynamic("crossOriginInjection")(crossOriginInjection.asInstanceOf[js.Any])
    if (!js.isUndefined(sameOriginInjection)) __obj.updateDynamic("sameOriginInjection")(sameOriginInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrossOriginInjection]
  }
}

