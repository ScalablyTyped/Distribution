package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTemplateOption extends StObject {
  
  /**
    * Indicates whether search display layouts are enabled. If enabled, the user will get the result template to render the
    * search results content in the resultTemplates property of the response. The result template is based on Adaptive Cards.
    * Optional.
    */
  var enableResultTemplate: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ResultTemplateOption {
  
  inline def apply(): ResultTemplateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultTemplateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultTemplateOption] (val x: Self) extends AnyVal {
    
    inline def setEnableResultTemplate(value: NullableOption[Boolean]): Self = StObject.set(x, "enableResultTemplate", value.asInstanceOf[js.Any])
    
    inline def setEnableResultTemplateNull: Self = StObject.set(x, "enableResultTemplate", null)
    
    inline def setEnableResultTemplateUndefined: Self = StObject.set(x, "enableResultTemplate", js.undefined)
  }
}
