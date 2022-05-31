package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNamePreviousValue
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var previousValue: js.Any
  
  var value: js.Any
}
object DictpropNamePreviousValue {
  
  inline def apply(previousValue: js.Any, value: js.Any): DictpropNamePreviousValue = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNamePreviousValue]
  }
  
  extension [Self <: DictpropNamePreviousValue](x: Self) {
    
    inline def setPreviousValue(value: js.Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
