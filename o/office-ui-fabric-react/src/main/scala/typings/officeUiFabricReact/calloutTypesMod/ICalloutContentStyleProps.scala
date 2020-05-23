package typings.officeUiFabricReact.calloutTypesMod

import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.uifabricStyling.ithemeMod.ITheme
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
    beakWidth: js.UndefOr[Double] = js.undefined,
    calloutMaxWidth: js.UndefOr[Double] = js.undefined,
    calloutWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    overflowYHidden: js.UndefOr[Boolean] = js.undefined,
    positions: ICalloutPositionedInfo = null
  ): ICalloutContentStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(beakWidth)) __obj.updateDynamic("beakWidth")(beakWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutMaxWidth)) __obj.updateDynamic("calloutMaxWidth")(calloutMaxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutWidth)) __obj.updateDynamic("calloutWidth")(calloutWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowYHidden)) __obj.updateDynamic("overflowYHidden")(overflowYHidden.get.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutContentStyleProps]
  }
}

