package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmployeeExperience extends StObject {
  
  // A collection of learning providers.
  var learningProviders: js.UndefOr[NullableOption[js.Array[LearningProvider]]] = js.undefined
}
object EmployeeExperience {
  
  inline def apply(): EmployeeExperience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmployeeExperience]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmployeeExperience] (val x: Self) extends AnyVal {
    
    inline def setLearningProviders(value: NullableOption[js.Array[LearningProvider]]): Self = StObject.set(x, "learningProviders", value.asInstanceOf[js.Any])
    
    inline def setLearningProvidersNull: Self = StObject.set(x, "learningProviders", null)
    
    inline def setLearningProvidersUndefined: Self = StObject.set(x, "learningProviders", js.undefined)
    
    inline def setLearningProvidersVarargs(value: LearningProvider*): Self = StObject.set(x, "learningProviders", js.Array(value*))
  }
}
