package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTypeObject extends StObject {
  
  var encoding: js.UndefOr[StringDictionary[EncodingObject]] = js.undefined
  
  var example: js.UndefOr[Any] = js.undefined
  
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.undefined
  
  var schema: js.UndefOr[ReferenceObject | SchemaObject] = js.undefined
}
object MediaTypeObject {
  
  inline def apply(): MediaTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTypeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTypeObject] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: StringDictionary[EncodingObject]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setSchema(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
