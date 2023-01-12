package typings.nouislider.mod

import typings.nouislider.nouisliderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearByStep extends StObject {
  
  var highestStep: Double
  
  var startValue: Double
  
  var step: Double | `false`
}
object NearByStep {
  
  inline def apply(highestStep: Double, startValue: Double, step: Double | `false`): NearByStep = {
    val __obj = js.Dynamic.literal(highestStep = highestStep.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearByStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NearByStep] (val x: Self) extends AnyVal {
    
    inline def setHighestStep(value: Double): Self = StObject.set(x, "highestStep", value.asInstanceOf[js.Any])
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double | `false`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
