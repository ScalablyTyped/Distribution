package typings.officeUiFabricReact.positioningTypesMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.std.Element
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
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
    beakWidth: js.UndefOr[Double] = js.undefined,
    bounds: IRectangle = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    gapSpace: js.UndefOr[Double] = js.undefined,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    target: Element | MouseEvent | IPoint = null
  ): ICalloutPositionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(beakWidth)) __obj.updateDynamic("beakWidth")(beakWidth.get.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.get.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.get.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(gapSpace)) __obj.updateDynamic("gapSpace")(gapSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutPositionProps]
  }
}

