package typings.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearBySteps extends StObject {
  
  var stepAfter: NearByStep
  
  var stepBefore: NearByStep
  
  var thisStep: NearByStep
}
object NearBySteps {
  
  inline def apply(stepAfter: NearByStep, stepBefore: NearByStep, thisStep: NearByStep): NearBySteps = {
    val __obj = js.Dynamic.literal(stepAfter = stepAfter.asInstanceOf[js.Any], stepBefore = stepBefore.asInstanceOf[js.Any], thisStep = thisStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearBySteps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NearBySteps] (val x: Self) extends AnyVal {
    
    inline def setStepAfter(value: NearByStep): Self = StObject.set(x, "stepAfter", value.asInstanceOf[js.Any])
    
    inline def setStepBefore(value: NearByStep): Self = StObject.set(x, "stepBefore", value.asInstanceOf[js.Any])
    
    inline def setThisStep(value: NearByStep): Self = StObject.set(x, "thisStep", value.asInstanceOf[js.Any])
  }
}
