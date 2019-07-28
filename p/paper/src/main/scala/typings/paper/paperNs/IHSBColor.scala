package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHSBColor extends js.Object {
  /**
    * the alpha of the color as a value between 0 and 1
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * the brightness of the color as a value between 0 and 1
    */
  var brightness: js.UndefOr[Double] = js.undefined
  /**
    * the hue of the color as a value in degrees between 0 and 360
    */
  var hue: js.UndefOr[Double] = js.undefined
  /**
    * the saturation of the color as a value between 0 and 1
    */
  var saturation: js.UndefOr[Double] = js.undefined
}

object IHSBColor {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    brightness: Int | Double = null,
    hue: Int | Double = null,
    saturation: Int | Double = null
  ): IHSBColor = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHSBColor]
  }
}

