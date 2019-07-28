package typings.openui5.sapNs.uiNs.unifiedNs

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
  
  /* 0 */ val Fade: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.Fade with Double = js.native
  /* 1 */ val None: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.None with Double = js.native
  /* 2 */ val Rotate: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.Rotate with Double = js.native
  /* 3 */ val SlideOver: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.SlideOver with Double = js.native
  /* 4 */ val SlideRight: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.SlideRight with Double = js.native
  /* 5 */ val ZoomIn: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.ZoomIn with Double = js.native
  /* 6 */ val ZoomOut: typings.openui5.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation.ZoomOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentSwitcherAnimation with Double] = js.native
}

