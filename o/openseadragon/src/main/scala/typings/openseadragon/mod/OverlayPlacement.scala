package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayPlacement extends js.Object

@JSImport("openseadragon", "OverlayPlacement")
@js.native
object OverlayPlacement extends js.Object {
  @js.native
  sealed trait BOTTOM extends OverlayPlacement
  
  @js.native
  sealed trait BOTTOM_LEFT extends OverlayPlacement
  
  @js.native
  sealed trait BOTTOM_RIGHT extends OverlayPlacement
  
  @js.native
  sealed trait CENTER extends OverlayPlacement
  
  @js.native
  sealed trait LEFT extends OverlayPlacement
  
  @js.native
  sealed trait RIGHT extends OverlayPlacement
  
  @js.native
  sealed trait TOP extends OverlayPlacement
  
  @js.native
  sealed trait TOP_LEFT extends OverlayPlacement
  
  @js.native
  sealed trait TOP_RIGHT extends OverlayPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayPlacement with Double] = js.native
  /* 6 */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with Double]
  
  /* 7 */ @js.native
  object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
  
  /* 5 */ @js.native
  object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
  
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 8 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 4 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  /* 2 */ @js.native
  object TOP extends TopLevel[TOP with Double]
  
  /* 1 */ @js.native
  object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
  
  /* 3 */ @js.native
  object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
  
}

