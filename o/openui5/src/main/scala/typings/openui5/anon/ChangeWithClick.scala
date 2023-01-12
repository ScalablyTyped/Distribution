package typings.openui5.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeWithClick extends StObject {
  
  /**
    * The step change occurs due to user's click or 'Enter'/'Space' key press on step within the navigation.
    */
  var changeWithClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The previous step.
    */
  var previousStep: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The new step.
    */
  var step: js.UndefOr[HTMLElement] = js.undefined
}
object ChangeWithClick {
  
  inline def apply(): ChangeWithClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeWithClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeWithClick] (val x: Self) extends AnyVal {
    
    inline def setChangeWithClick(value: Boolean): Self = StObject.set(x, "changeWithClick", value.asInstanceOf[js.Any])
    
    inline def setChangeWithClickUndefined: Self = StObject.set(x, "changeWithClick", js.undefined)
    
    inline def setPreviousStep(value: HTMLElement): Self = StObject.set(x, "previousStep", value.asInstanceOf[js.Any])
    
    inline def setPreviousStepUndefined: Self = StObject.set(x, "previousStep", js.undefined)
    
    inline def setStep(value: HTMLElement): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
