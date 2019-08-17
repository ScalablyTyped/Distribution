package typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutContentDotBaseMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutState extends js.Object {
  var calloutElementRect: js.UndefOr[ClientRect] = js.undefined
  var heightOffset: js.UndefOr[Double] = js.undefined
  var positions: js.UndefOr[ICalloutPositionedInfo] = js.undefined
  var slideDirectionalClassName: js.UndefOr[String] = js.undefined
}

object ICalloutState {
  @scala.inline
  def apply(
    calloutElementRect: ClientRect = null,
    heightOffset: Int | Double = null,
    positions: ICalloutPositionedInfo = null,
    slideDirectionalClassName: String = null
  ): ICalloutState = {
    val __obj = js.Dynamic.literal()
    if (calloutElementRect != null) __obj.updateDynamic("calloutElementRect")(calloutElementRect)
    if (heightOffset != null) __obj.updateDynamic("heightOffset")(heightOffset.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (slideDirectionalClassName != null) __obj.updateDynamic("slideDirectionalClassName")(slideDirectionalClassName)
    __obj.asInstanceOf[ICalloutState]
  }
}

