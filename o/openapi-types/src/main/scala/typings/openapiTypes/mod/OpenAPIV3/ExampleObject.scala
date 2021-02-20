package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExampleObject extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var externalValue: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ExampleObject {
  
  @scala.inline
  def apply(): ExampleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExampleObject]
  }
  
  @scala.inline
  implicit class ExampleObjectMutableBuilder[Self <: ExampleObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExternalValue(value: String): Self = StObject.set(x, "externalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalValueUndefined: Self = StObject.set(x, "externalValue", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
