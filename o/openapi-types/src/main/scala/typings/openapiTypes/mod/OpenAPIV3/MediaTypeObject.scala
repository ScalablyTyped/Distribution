package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTypeObject extends StObject {
  
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
  implicit class MediaTypeObjectMutableBuilder[Self <: MediaTypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: StringDictionary[EncodingObject]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setSchema(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
