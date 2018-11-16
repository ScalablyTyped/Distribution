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
  
  val Fade: Fade with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Rotate: Rotate with java.lang.String = js.native
  val SlideOver: SlideOver with java.lang.String = js.native
  val SlideRight: SlideRight with java.lang.String = js.native
  val ZoomIn: ZoomIn with java.lang.String = js.native
  val ZoomOut: ZoomOut with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.unifiedNs.ContentSwitcherAnimation with java.lang.String] = js.native
}

