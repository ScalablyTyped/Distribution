package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<openapi-types.openapi-types.OpenAPIV3.MediaTypeObject, {  schema :openapi-types.openapi-types.OpenAPIV3_1.SchemaObject | openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | undefined,   examples :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.ExampleObject> | undefined}> */
trait MediaTypeObject extends StObject {
  
  var encoding: js.UndefOr[StringDictionary[typings.openapiTypes.mod.OpenAPIV3.EncodingObject]] = js.undefined
  
  var example: js.UndefOr[Any] = js.undefined
  
  var examples: js.UndefOr[Record[String, ReferenceObject | ExampleObject]] = js.undefined
  
  var schema: js.UndefOr[SchemaObject | ReferenceObject] = js.undefined
}
object MediaTypeObject {
  
  inline def apply(): MediaTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTypeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTypeObject] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: StringDictionary[typings.openapiTypes.mod.OpenAPIV3.EncodingObject]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExamples(value: Record[String, ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setSchema(value: SchemaObject | ReferenceObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
