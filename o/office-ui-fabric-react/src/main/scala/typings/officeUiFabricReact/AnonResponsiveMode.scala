package typings.officeUiFabricReact

import typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponsiveMode extends js.Object {
  var responsiveMode: js.UndefOr[ResponsiveMode] = js.undefined
}

object AnonResponsiveMode {
  @scala.inline
  def apply(responsiveMode: ResponsiveMode = null): AnonResponsiveMode = {
    val __obj = js.Dynamic.literal()
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponsiveMode]
  }
}

