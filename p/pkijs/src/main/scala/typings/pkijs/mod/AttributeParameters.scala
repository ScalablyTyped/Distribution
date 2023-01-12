package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAttribute> */
trait AttributeParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[Any]] = js.undefined
}
object AttributeParameters {
  
  inline def apply(): AttributeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeParameters] (val x: Self) extends AnyVal {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
