package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs

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
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The stroke color.
    */
  var color: js.UndefOr[Double] = js.undefined
  /**
    * The stroke width.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(alpha: Int | Double = null, color: Int | Double = null, width: Int | Double = null): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

