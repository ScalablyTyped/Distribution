package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionProps extends js.Object {
  /**
    * If true the positioning logic will prefer flipping edges over nudging the rectangle to fit within bounds,
    * thus making sure the element align perfectly with target.
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
  /**
    * The bounding rectangle for which  the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.undefined
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    */
  var coverTarget: js.UndefOr[Boolean] = js.undefined
  /** how the element should be positioned */
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * If true the position will not change edges in an attempt to fit the rectangle within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
  /** The gap between the callout and the target */
  var gapSpace: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[Element | MouseEvent | IPoint] = js.undefined
}

object IPositionProps {
  @scala.inline
  def apply(
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    bounds: IRectangle = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    gapSpace: Int | Double = null,
    target: Element | MouseEvent | IPoint = null
  ): IPositionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionProps]
  }
}

