package typings.ngI18next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object i18next {
    
    trait I18nextProvider extends StObject {
      
      var options: Any
    }
    object I18nextProvider {
      
      inline def apply(options: Any): I18nextProvider = {
        val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[I18nextProvider]
      }
      
      extension [Self <: I18nextProvider](x: Self) {
        
        inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
  }
}
