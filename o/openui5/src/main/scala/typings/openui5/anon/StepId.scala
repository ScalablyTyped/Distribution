package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepId extends StObject {
  
  /**
    * ID of the selected step
    */
  var stepId: js.UndefOr[String] = js.undefined
}
object StepId {
  
  inline def apply(): StepId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepId]
  }
  
  extension [Self <: StepId](x: Self) {
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
