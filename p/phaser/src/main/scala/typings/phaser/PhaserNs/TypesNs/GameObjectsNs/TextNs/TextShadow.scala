package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Shadow configuration object as used by the Text Style.
  */
trait TextShadow extends js.Object {
  /**
    * The amount of blur applied to the shadow. Leave as zero for a hard shadow.
    */
  var blur: js.UndefOr[Double] = js.undefined
  /**
    * The color of the shadow, given as a CSS string value.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Apply the shadow to the fill effect on the Text object?
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * The horizontal offset of the shadow.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * The vertical offset of the shadow.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * Apply the shadow to the stroke effect on the Text object?
    */
  var stroke: js.UndefOr[Boolean] = js.undefined
}

object TextShadow {
  @scala.inline
  def apply(
    blur: Int | Double = null,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    stroke: js.UndefOr[Boolean] = js.undefined
  ): TextShadow = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[TextShadow]
  }
}

