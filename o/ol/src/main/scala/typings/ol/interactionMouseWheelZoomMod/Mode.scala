package typings.ol.interactionMouseWheelZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSImport("ol/interaction/MouseWheelZoom", "Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait TRACKPAD extends Mode
  
  @js.native
  sealed trait WHEEL extends Mode
  
  /* "trackpad" */ val TRACKPAD: typings.ol.interactionMouseWheelZoomMod.Mode.TRACKPAD with String = js.native
  /* "wheel" */ val WHEEL: typings.ol.interactionMouseWheelZoomMod.Mode.WHEEL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Mode with String] = js.native
}

