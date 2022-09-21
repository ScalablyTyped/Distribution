package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameValue
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var value: Double
}
object DictpropNameValue {
  
  inline def apply(value: Double): DictpropNameValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameValue]
  }
  
  extension [Self <: DictpropNameValue](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
