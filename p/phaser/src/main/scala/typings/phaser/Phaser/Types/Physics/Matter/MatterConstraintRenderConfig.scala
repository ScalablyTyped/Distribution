package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterConstraintRenderConfig extends js.Object {
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.undefined
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.undefined
  /**
    * If this constraint has anchors, should they be rendered? Pin constraints never have anchors.
    */
  var anchors: js.UndefOr[Boolean] = js.undefined
  /**
    * The color value of the line stroke when rendering this constraint.
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the line when rendering this constraint, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.undefined
  /**
    * Should this constraint be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MatterConstraintRenderConfig {
  @scala.inline
  def apply(
    anchorColor: js.UndefOr[Double] = js.undefined,
    anchorSize: js.UndefOr[Double] = js.undefined,
    anchors: js.UndefOr[Boolean] = js.undefined,
    lineColor: js.UndefOr[Double] = js.undefined,
    lineOpacity: js.UndefOr[Double] = js.undefined,
    lineThickness: js.UndefOr[Double] = js.undefined,
    pinSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MatterConstraintRenderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorColor)) __obj.updateDynamic("anchorColor")(anchorColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorSize)) __obj.updateDynamic("anchorSize")(anchorSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchors)) __obj.updateDynamic("anchors")(anchors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineColor)) __obj.updateDynamic("lineColor")(lineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOpacity)) __obj.updateDynamic("lineOpacity")(lineOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineThickness)) __obj.updateDynamic("lineThickness")(lineThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinSize)) __obj.updateDynamic("pinSize")(pinSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterConstraintRenderConfig]
  }
}

