package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayRotationMode extends js.Object

@JSImport("openseadragon", "OverlayRotationMode")
@js.native
object OverlayRotationMode extends js.Object {
  @js.native
  sealed trait BOUNDING_BOX extends OverlayRotationMode
  
  @js.native
  sealed trait EXACT extends OverlayRotationMode
  
  @js.native
  sealed trait NO_ROTATION extends OverlayRotationMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayRotationMode with Double] = js.native
  /* 2 */ @js.native
  object BOUNDING_BOX extends TopLevel[BOUNDING_BOX with Double]
  
  /* 1 */ @js.native
  object EXACT extends TopLevel[EXACT with Double]
  
  /* 0 */ @js.native
  object NO_ROTATION extends TopLevel[NO_ROTATION with Double]
  
}

