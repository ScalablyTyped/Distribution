package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentSwitcherAnimation extends StObject
/**
  * Predefined animations for the ContentSwitcher
  */
@JSGlobal("sap.ui.unified.ContentSwitcherAnimation")
@js.native
object ContentSwitcherAnimation extends StObject {
  
  @js.native
  sealed trait Fade
    extends StObject
       with ContentSwitcherAnimation
  
  @js.native
  sealed trait None
    extends StObject
       with ContentSwitcherAnimation
  
  @js.native
  sealed trait Rotate
    extends StObject
       with ContentSwitcherAnimation
  
  @js.native
  sealed trait SlideOver
    extends StObject
       with ContentSwitcherAnimation
  
  @js.native
  sealed trait SlideRight
    extends StObject
       with ContentSwitcherAnimation
  
  @js.native
  sealed trait ZoomIn
    extends StObject
       with ContentSwitcherAnimation
  
  @js.native
  sealed trait ZoomOut
    extends StObject
       with ContentSwitcherAnimation
}
