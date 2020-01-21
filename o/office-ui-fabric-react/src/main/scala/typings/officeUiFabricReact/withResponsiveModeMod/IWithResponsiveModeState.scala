package typings.officeUiFabricReact.withResponsiveModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWithResponsiveModeState extends js.Object {
  var responsiveMode: js.UndefOr[ResponsiveMode] = js.undefined
}

object IWithResponsiveModeState {
  @scala.inline
  def apply(responsiveMode: ResponsiveMode = null): IWithResponsiveModeState = {
    val __obj = js.Dynamic.literal()
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWithResponsiveModeState]
  }
}

