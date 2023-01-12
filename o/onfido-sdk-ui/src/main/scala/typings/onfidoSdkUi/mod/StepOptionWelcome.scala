package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionWelcome extends StObject {
  
  var descriptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var nextButton: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object StepOptionWelcome {
  
  inline def apply(): StepOptionWelcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionWelcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionWelcome] (val x: Self) extends AnyVal {
    
    inline def setDescriptions(value: js.Array[String]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setDescriptionsVarargs(value: String*): Self = StObject.set(x, "descriptions", js.Array(value*))
    
    inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
