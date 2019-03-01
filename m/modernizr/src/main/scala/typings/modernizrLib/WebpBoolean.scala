package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpBoolean
  extends stdLib.Boolean {
  var alpha: scala.Boolean
  var animation: scala.Boolean
  var lossless: scala.Boolean
}

object WebpBoolean {
  @scala.inline
  def apply(alpha: scala.Boolean, animation: scala.Boolean, lossless: scala.Boolean): WebpBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("animation")(animation)
    __obj.updateDynamic("lossless")(lossless)
    __obj.asInstanceOf[WebpBoolean]
  }
}

