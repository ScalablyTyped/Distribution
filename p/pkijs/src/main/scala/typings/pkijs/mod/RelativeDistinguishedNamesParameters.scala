package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRelativeDistinguishedNames> */
trait RelativeDistinguishedNamesParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var typesAndValues: js.UndefOr[js.Array[AttributeTypeAndValue]] = js.undefined
  
  var valueBeforeDecode: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object RelativeDistinguishedNamesParameters {
  
  inline def apply(): RelativeDistinguishedNamesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeDistinguishedNamesParameters]
  }
  
  extension [Self <: RelativeDistinguishedNamesParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTypesAndValues(value: js.Array[AttributeTypeAndValue]): Self = StObject.set(x, "typesAndValues", value.asInstanceOf[js.Any])
    
    inline def setTypesAndValuesUndefined: Self = StObject.set(x, "typesAndValues", js.undefined)
    
    inline def setTypesAndValuesVarargs(value: AttributeTypeAndValue*): Self = StObject.set(x, "typesAndValues", js.Array(value*))
    
    inline def setValueBeforeDecode(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
  }
}
