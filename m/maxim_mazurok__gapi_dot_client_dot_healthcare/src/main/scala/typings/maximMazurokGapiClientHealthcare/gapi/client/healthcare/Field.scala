package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /** The maximum number of times this field can be repeated. 0 or -1 means unbounded. */
  var maxOccurs: js.UndefOr[Double] = js.undefined
  
  /** The minimum number of times this field must be present/repeated. */
  var minOccurs: js.UndefOr[Double] = js.undefined
  
  /** The name of the field. For example, "PID-1" or just "1". */
  var name: js.UndefOr[String] = js.undefined
  
  /** The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296". */
  var table: js.UndefOr[String] = js.undefined
  
  /** The type of this field. A Type with this name must be defined in an Hl7TypesConfig. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Field {
  
  inline def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
    
    inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
    
    inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
    
    inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
