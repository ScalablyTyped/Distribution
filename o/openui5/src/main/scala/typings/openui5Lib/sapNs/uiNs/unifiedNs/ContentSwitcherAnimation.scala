package typings
package openui5Lib.sapNs.uiNs.unifiedNs

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
  sealed trait Fade
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  @js.native
  sealed trait Rotate
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  @js.native
  sealed trait SlideOver
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  @js.native
  sealed trait SlideRight
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  @js.native
  sealed trait ZoomIn
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  @js.native
  sealed trait ZoomOut
    extends openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation
  
  /* 0 */ val Fade: Fade with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 2 */ val Rotate: Rotate with scala.Double = js.native
  /* 3 */ val SlideOver: SlideOver with scala.Double = js.native
  /* 4 */ val SlideRight: SlideRight with scala.Double = js.native
  /* 5 */ val ZoomIn: ZoomIn with scala.Double = js.native
  /* 6 */ val ZoomOut: ZoomOut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation with scala.Double] = js.native
}

