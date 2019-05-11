package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics line style (or stroke style) settings.
  */
trait LineStyle extends js.Object {
  /**
    * The stroke alpha.
    */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke color.
    */
  var color: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke width.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    color: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

