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
    anchorColor: Int | Double = null,
    anchorSize: Int | Double = null,
    anchors: js.UndefOr[Boolean] = js.undefined,
    lineColor: Int | Double = null,
    lineOpacity: Int | Double = null,
    lineThickness: Int | Double = null,
    pinSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MatterConstraintRenderConfig = {
    val __obj = js.Dynamic.literal()
    if (anchorColor != null) __obj.updateDynamic("anchorColor")(anchorColor.asInstanceOf[js.Any])
    if (anchorSize != null) __obj.updateDynamic("anchorSize")(anchorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(anchors)) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineOpacity != null) __obj.updateDynamic("lineOpacity")(lineOpacity.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (pinSize != null) __obj.updateDynamic("pinSize")(pinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterConstraintRenderConfig]
  }
}

