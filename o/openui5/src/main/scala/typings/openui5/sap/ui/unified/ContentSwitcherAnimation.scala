package typings.openui5.sap.ui.unified

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
  
}

