package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignedAndUnsignedAttributes extends StObject {
  
  var attributes: js.Array[Attribute]
  
  /**
    * Need to have it in order to successfully process with signature verification
    */
  var encodedValue: js.typedarray.ArrayBuffer
  
  var `type`: Double
}
object ISignedAndUnsignedAttributes {
  
  inline def apply(attributes: js.Array[Attribute], encodedValue: js.typedarray.ArrayBuffer, `type`: Double): ISignedAndUnsignedAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], encodedValue = encodedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignedAndUnsignedAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISignedAndUnsignedAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setEncodedValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "encodedValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
