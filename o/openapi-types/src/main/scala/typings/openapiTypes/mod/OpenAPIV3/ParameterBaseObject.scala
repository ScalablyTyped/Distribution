package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterBaseObject extends StObject {
  
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
  
  var allowReserved: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.native
  
  var deprecated: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var example: js.UndefOr[js.Any] = js.native
  
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.native
  
  var explode: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var schema: js.UndefOr[ReferenceObject | SchemaObject] = js.native
  
  var style: js.UndefOr[String] = js.native
}
object ParameterBaseObject {
  
  @scala.inline
  def apply(): ParameterBaseObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterBaseObject]
  }
  
  @scala.inline
  implicit class ParameterBaseObjectMutableBuilder[Self <: ParameterBaseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
    
    @scala.inline
    def setAllowReserved(value: Boolean): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
    
    @scala.inline
    def setContent(value: StringDictionary[MediaTypeObject]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSchema(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
