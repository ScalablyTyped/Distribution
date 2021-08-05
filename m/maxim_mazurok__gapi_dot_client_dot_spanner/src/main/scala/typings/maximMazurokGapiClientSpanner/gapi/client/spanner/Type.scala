package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /** If code == ARRAY, then `array_element_type` is the type of the array elements. */
  var arrayElementType: js.UndefOr[Type] = js.undefined
  
  /** Required. The TypeCode for this type. */
  var code: js.UndefOr[String] = js.undefined
  
  /** If code == STRUCT, then `struct_type` provides type information for the struct's fields. */
  var structType: js.UndefOr[StructType] = js.undefined
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setArrayElementType(value: Type): Self = StObject.set(x, "arrayElementType", value.asInstanceOf[js.Any])
    
    inline def setArrayElementTypeUndefined: Self = StObject.set(x, "arrayElementType", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setStructType(value: StructType): Self = StObject.set(x, "structType", value.asInstanceOf[js.Any])
    
    inline def setStructTypeUndefined: Self = StObject.set(x, "structType", js.undefined)
  }
}
