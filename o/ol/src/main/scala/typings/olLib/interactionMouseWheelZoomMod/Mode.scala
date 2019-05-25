package typings
package olLib.interactionMouseWheelZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSImport("ol/interaction/MouseWheelZoom", "Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait TRACKPAD
    extends olLib.interactionMouseWheelZoomMod.Mode
  
  @js.native
  sealed trait WHEEL
    extends olLib.interactionMouseWheelZoomMod.Mode
  
  /* "trackpad" */ val TRACKPAD: TRACKPAD with java.lang.String = js.native
  /* "wheel" */ val WHEEL: WHEEL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.interactionMouseWheelZoomMod.Mode with java.lang.String] = js.native
}

