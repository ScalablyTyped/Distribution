package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipStyleProps extends js.Object {
  /**
    * The width of the Callout's beak
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Delay before tooltip appears.
    * @deprecated Delay logic moved to TooltipHost vs relying on animation delay.
    */
  var delay: js.UndefOr[TooltipDelay] = js.undefined
  /**
    * The gap between the Callout and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.undefined
  /**
    * Maximum width of tooltip.
    */
  var maxWidth: js.UndefOr[String] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object ITooltipStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    beakWidth: Int | Double = null,
    className: String = null,
    delay: TooltipDelay = null,
    gapSpace: Int | Double = null,
    maxWidth: String = null
  ): ITooltipStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    __obj.asInstanceOf[ITooltipStyleProps]
  }
}

