package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTypeObject extends js.Object {
  
  var encoding: js.UndefOr[StringDictionary[EncodingObject]] = js.native
  
  var example: js.UndefOr[js.Any] = js.native
  
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.native
  
  var schema: js.UndefOr[ReferenceObject | SchemaObject] = js.native
}
object MediaTypeObject {
  
  @scala.inline
  def apply(): MediaTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTypeObject]
  }
  
  @scala.inline
  implicit class MediaTypeObjectOps[Self <: MediaTypeObject] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: StringDictionary[EncodingObject]): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    
    @scala.inline
    def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setSchema(value: ReferenceObject | SchemaObject): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
