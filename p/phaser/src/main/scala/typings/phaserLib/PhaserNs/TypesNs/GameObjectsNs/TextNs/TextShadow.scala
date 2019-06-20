package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.TextNs

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
  var blur: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the shadow, given as a CSS string value.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Apply the shadow to the fill effect on the Text object?
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The horizontal offset of the shadow.
    */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical offset of the shadow.
    */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Apply the shadow to the stroke effect on the Text object?
    */
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
}

object TextShadow {
  @scala.inline
  def apply(
    blur: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    stroke: js.UndefOr[scala.Boolean] = js.undefined
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

