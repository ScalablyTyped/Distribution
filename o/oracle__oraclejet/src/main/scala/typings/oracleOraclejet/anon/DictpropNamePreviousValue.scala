package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNamePreviousValue
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var previousValue: Any
  
  var value: Any
}
object DictpropNamePreviousValue {
  
  inline def apply(previousValue: Any, value: Any): DictpropNamePreviousValue = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNamePreviousValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictpropNamePreviousValue] (val x: Self) extends AnyVal {
    
    inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
