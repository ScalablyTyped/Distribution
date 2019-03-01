package typings
package mergeDashImagesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Opacity extends js.Object {
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var src: java.lang.String
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Opacity {
  @scala.inline
  def apply(
    src: java.lang.String,
    opacity: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_Opacity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Opacity]
  }
}

