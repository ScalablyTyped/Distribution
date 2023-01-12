package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonArraySchemaObject
  extends StObject
     with BaseSchemaObject
     with SchemaObject {
  
  var `type`: js.UndefOr[NonArraySchemaObjectType] = js.undefined
}
object NonArraySchemaObject {
  
  inline def apply(): NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonArraySchemaObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonArraySchemaObject] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonArraySchemaObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
