package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAttributeTypeAndValue> */
trait AttributeTypeAndValueParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[AttributeValueType] = js.undefined
}
object AttributeTypeAndValueParameters {
  
  inline def apply(): AttributeTypeAndValueParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeTypeAndValueParameters]
  }
  
  extension [Self <: AttributeTypeAndValueParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: AttributeValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
