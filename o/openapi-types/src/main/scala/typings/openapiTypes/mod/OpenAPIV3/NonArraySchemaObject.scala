package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonArraySchemaObject
  extends BaseSchemaObject
     with SchemaObject {
  
  var `type`: js.UndefOr[NonArraySchemaObjectType] = js.native
}
object NonArraySchemaObject {
  
  @scala.inline
  def apply(): NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonArraySchemaObject]
  }
  
  @scala.inline
  implicit class NonArraySchemaObjectMutableBuilder[Self <: NonArraySchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NonArraySchemaObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
