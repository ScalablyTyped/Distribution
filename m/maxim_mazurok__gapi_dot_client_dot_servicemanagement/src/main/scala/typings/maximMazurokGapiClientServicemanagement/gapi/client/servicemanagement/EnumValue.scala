package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValue extends StObject {
  
  /** Enum value name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Enum value number. */
  var number: js.UndefOr[Double] = js.undefined
  
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
}
object EnumValue {
  
  inline def apply(): EnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
