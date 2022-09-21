package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.ascending
import typings.oracleOraclejet.oracleOraclejetStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameDirection
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var direction: ascending | descending
  
  var header: Any
}
object DictpropNameDirection {
  
  inline def apply(direction: ascending | descending, header: Any): DictpropNameDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameDirection]
  }
  
  extension [Self <: DictpropNameDirection](x: Self) {
    
    inline def setDirection(value: ascending | descending): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
