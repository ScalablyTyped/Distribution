package typings.ol.mouseWheelZoomMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Mode extends js.Object
@JSImport("ol/interaction/MouseWheelZoom", "Mode")
@js.native
object Mode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Mode with String] = js.native
  
  @js.native
  sealed trait TRACKPAD extends Mode
  /* "trackpad" */ @js.native
  object TRACKPAD extends TopLevel[TRACKPAD with String]
  
  @js.native
  sealed trait WHEEL extends Mode
  /* "wheel" */ @js.native
  object WHEEL extends TopLevel[WHEEL with String]
}
