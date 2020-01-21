package typings.ol.mouseWheelZoomMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Mode with String] = js.native
  /* "trackpad" */ @js.native
  object TRACKPAD extends TopLevel[TRACKPAD with String]
  
  /* "wheel" */ @js.native
  object WHEEL extends TopLevel[WHEEL with String]
  
}

