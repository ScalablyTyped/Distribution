package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterBaseObject extends js.Object {
  
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
  implicit class ParameterBaseObjectOps[Self <: ParameterBaseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowEmptyValue(value: Boolean): Self = this.set("allowEmptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmptyValue: Self = this.set("allowEmptyValue", js.undefined)
    
    @scala.inline
    def setAllowReserved(value: Boolean): Self = this.set("allowReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReserved: Self = this.set("allowReserved", js.undefined)
    
    @scala.inline
    def setContent(value: StringDictionary[MediaTypeObject]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    
    @scala.inline
    def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setExplode(value: Boolean): Self = this.set("explode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplode: Self = this.set("explode", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSchema(value: ReferenceObject | SchemaObject): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
