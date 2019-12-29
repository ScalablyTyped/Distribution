package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentSwitcherAnimation extends js.Object

/**
  * Predefined animations for the ContentSwitcher
  */
@JSGlobal("sap.ui.unified.ContentSwitcherAnimation")
@js.native
object ContentSwitcherAnimation extends js.Object {
  @js.native
  sealed trait Fade extends ContentSwitcherAnimation
  
  @js.native
  sealed trait None extends ContentSwitcherAnimation
  
  @js.native
  sealed trait Rotate extends ContentSwitcherAnimation
  
  @js.native
  sealed trait SlideOver extends ContentSwitcherAnimation
  
  @js.native
  sealed trait SlideRight extends ContentSwitcherAnimation
  
  @js.native
  sealed trait ZoomIn extends ContentSwitcherAnimation
  
  @js.native
  sealed trait ZoomOut extends ContentSwitcherAnimation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentSwitcherAnimation with Double] = js.native
  /* 0 */ @js.native
  object Fade extends TopLevel[Fade with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Rotate extends TopLevel[Rotate with Double]
  
  /* 3 */ @js.native
  object SlideOver extends TopLevel[SlideOver with Double]
  
  /* 4 */ @js.native
  object SlideRight extends TopLevel[SlideRight with Double]
  
  /* 5 */ @js.native
  object ZoomIn extends TopLevel[ZoomIn with Double]
  
  /* 6 */ @js.native
  object ZoomOut extends TopLevel[ZoomOut with Double]
  
}

