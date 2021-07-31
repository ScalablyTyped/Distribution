package typings.ngI18next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object i18next {
    
    trait I18nextProvider extends StObject {
      
      var options: js.Any
    }
    object I18nextProvider {
      
      @scala.inline
      def apply(options: js.Any): I18nextProvider = {
        val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
        __obj.asInstanceOf[I18nextProvider]
      }
      
      @scala.inline
      implicit class I18nextProviderMutableBuilder[Self <: I18nextProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      }
    }
  }
}
