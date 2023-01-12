package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxCount extends StObject {
  
  var fetchSize: Double
  
  var maxCount: Double
}
object MaxCount {
  
  inline def apply(fetchSize: Double, maxCount: Double): MaxCount = {
    val __obj = js.Dynamic.literal(fetchSize = fetchSize.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxCount] (val x: Self) extends AnyVal {
    
    inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
  }
}
