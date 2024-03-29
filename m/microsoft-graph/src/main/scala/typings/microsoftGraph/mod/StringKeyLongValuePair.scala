package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringKeyLongValuePair extends StObject {
  
  var key: js.UndefOr[NullableOption[String]] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object StringKeyLongValuePair {
  
  inline def apply(): StringKeyLongValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringKeyLongValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringKeyLongValuePair] (val x: Self) extends AnyVal {
    
    inline def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
