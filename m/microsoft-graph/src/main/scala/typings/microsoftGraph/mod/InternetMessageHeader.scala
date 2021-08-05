package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternetMessageHeader extends StObject {
  
  // Represents the key in a key-value pair.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value in a key-value pair.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object InternetMessageHeader {
  
  inline def apply(): InternetMessageHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetMessageHeader]
  }
  
  extension [Self <: InternetMessageHeader](x: Self) {
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
