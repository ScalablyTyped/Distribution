package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRelativeDistinguishedNames extends StObject {
  
  /**
    * Array of "type and value" objects
    */
  var typesAndValues: js.Array[AttributeTypeAndValue]
  
  /**
    * Value of the RDN before decoding from schema
    */
  var valueBeforeDecode: js.typedarray.ArrayBuffer
}
object IRelativeDistinguishedNames {
  
  inline def apply(typesAndValues: js.Array[AttributeTypeAndValue], valueBeforeDecode: js.typedarray.ArrayBuffer): IRelativeDistinguishedNames = {
    val __obj = js.Dynamic.literal(typesAndValues = typesAndValues.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelativeDistinguishedNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRelativeDistinguishedNames] (val x: Self) extends AnyVal {
    
    inline def setTypesAndValues(value: js.Array[AttributeTypeAndValue]): Self = StObject.set(x, "typesAndValues", value.asInstanceOf[js.Any])
    
    inline def setTypesAndValuesVarargs(value: AttributeTypeAndValue*): Self = StObject.set(x, "typesAndValues", js.Array(value*))
    
    inline def setValueBeforeDecode(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
  }
}
