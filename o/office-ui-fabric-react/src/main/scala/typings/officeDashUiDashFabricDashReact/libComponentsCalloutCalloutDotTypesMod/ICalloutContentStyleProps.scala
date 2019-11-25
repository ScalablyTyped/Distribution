package typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutContentStyleProps extends js.Object {
  /**
    * Background color for the beak and callout.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Width of Callout beak
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * Max width for callout including borders.
    */
  var calloutMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Width for callout including borders.
    */
  var calloutWidth: js.UndefOr[Double] = js.undefined
  /**
    * CSS class to apply to the callout.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether or not to clip content of the callout,
    * if it overflows vertically.
    */
  var overflowYHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Callout positioning data
    */
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.undefined
  /**
    * Theme to apply to the calloutContent.
    */
  var theme: ITheme
}

object ICalloutContentStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    backgroundColor: String = null,
    beakWidth: Int | Double = null,
    calloutMaxWidth: Int | Double = null,
    calloutWidth: Int | Double = null,
    className: String = null,
    overflowYHidden: js.UndefOr[Boolean] = js.undefined,
    positions: ICalloutPositionedInfo = null
  ): ICalloutContentStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (calloutMaxWidth != null) __obj.updateDynamic("calloutMaxWidth")(calloutMaxWidth.asInstanceOf[js.Any])
    if (calloutWidth != null) __obj.updateDynamic("calloutWidth")(calloutWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowYHidden)) __obj.updateDynamic("overflowYHidden")(overflowYHidden.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutContentStyleProps]
  }
}

