package typings.openfin.windowOptionMod

import typings.openfin.AnonCrossOriginInjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var iframe: js.UndefOr[AnonCrossOriginInjection] = js.undefined
}

object Api {
  @scala.inline
  def apply(iframe: AnonCrossOriginInjection = null): Api = {
    val __obj = js.Dynamic.literal()
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

