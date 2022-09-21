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
  
  /**
    * The TypeAnnotationCode that disambiguates SQL type that Spanner will use to represent values of this type during query processing. This is necessary for some type codes because a
    * single TypeCode can be mapped to different SQL types depending on the SQL dialect. type_annotation typically is not needed to process the content of a value (it doesn't affect
    * serialization) and clients can ignore it on the read path.
    */
  var typeAnnotation: js.UndefOr[String] = js.undefined
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
    
    inline def setTypeAnnotation(value: String): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
