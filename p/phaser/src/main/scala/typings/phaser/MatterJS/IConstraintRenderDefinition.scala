package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraintRenderDefinition extends js.Object {
  /**
    * A hex color value that defines the color to use when rendering the anchors.
    *
    * @property anchorColor
    * @type number
    */
  var anchorColor: js.UndefOr[Double] = js.undefined
  /**
    * The size of the anchors during rendering.
    *
    * @property anchorSize
    * @type number
    */
  var anchorSize: js.UndefOr[Double] = js.undefined
  /**
    * A flag that indicates if the constraint anchors should be rendered.
    *
    * @property anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.undefined
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * The size of the pins during rendering.
    *
    * @property pinSize
    * @type number
    */
  var pinSize: js.UndefOr[Double] = js.undefined
  /**
    * The type of constraint.
    *
    * @property type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IConstraintRenderDefinition {
  @scala.inline
  def apply(
    anchorColor: Int | Double = null,
    anchorSize: Int | Double = null,
    anchors: js.UndefOr[Boolean] = js.undefined,
    lineColor: Int | Double = null,
    lineOpacity: Int | Double = null,
    lineThickness: Int | Double = null,
    pinSize: Int | Double = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    if (anchorColor != null) __obj.updateDynamic("anchorColor")(anchorColor.asInstanceOf[js.Any])
    if (anchorSize != null) __obj.updateDynamic("anchorSize")(anchorSize.asInstanceOf[js.Any])
    if (!js.isUndefined(anchors)) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineOpacity != null) __obj.updateDynamic("lineOpacity")(lineOpacity.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (pinSize != null) __obj.updateDynamic("pinSize")(pinSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
}

