package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenX extends js.Object {
  var screenX: Double
  var screenY: Double
}

object ScreenX {
  @scala.inline
  def apply(screenX: Double, screenY: Double): ScreenX = {
    val __obj = js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenX]
  }
}

