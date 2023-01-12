package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISignedAndUnsignedAttributes> */
trait SignedAndUnsignedAttributesParameters extends StObject {
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var encodedValue: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
}
object SignedAndUnsignedAttributesParameters {
  
  inline def apply(): SignedAndUnsignedAttributesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedAndUnsignedAttributesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedAndUnsignedAttributesParameters] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setEncodedValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "encodedValue", value.asInstanceOf[js.Any])
    
    inline def setEncodedValueUndefined: Self = StObject.set(x, "encodedValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
