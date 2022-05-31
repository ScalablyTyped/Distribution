package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxColumnCount extends StObject {
  
  var maxColumnCount: Double
  
  var maxRowCount: Double
}
object MaxColumnCount {
  
  inline def apply(maxColumnCount: Double, maxRowCount: Double): MaxColumnCount = {
    val __obj = js.Dynamic.literal(maxColumnCount = maxColumnCount.asInstanceOf[js.Any], maxRowCount = maxRowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxColumnCount]
  }
  
  extension [Self <: MaxColumnCount](x: Self) {
    
    inline def setMaxColumnCount(value: Double): Self = StObject.set(x, "maxColumnCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRowCount(value: Double): Self = StObject.set(x, "maxRowCount", value.asInstanceOf[js.Any])
  }
}
