package typings.openui5.anon

import typings.openui5.sapMWizardStepMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /**
    * The newly selected step.
    */
  var step: js.UndefOr[default] = js.undefined
}
object Step {
  
  inline def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setStep(value: default): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
