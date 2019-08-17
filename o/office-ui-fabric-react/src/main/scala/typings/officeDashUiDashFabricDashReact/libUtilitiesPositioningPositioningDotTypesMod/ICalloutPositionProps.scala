package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutPositionProps extends IPositionProps {
  /**
    * The width of the beak.
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not the beak is visible
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.undefined
}

object ICalloutPositionProps {
  @scala.inline
  def apply(
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    beakWidth: Int | Double = null,
    bounds: IRectangle = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    gapSpace: Int | Double = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    target: Element | MouseEvent | IPoint = null
  ): ICalloutPositionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge)
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget)
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed)
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL)
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutPositionProps]
  }
}

