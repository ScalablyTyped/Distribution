package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxCount extends StObject {
  
  var fetchSize: Double = js.native
  
  var maxCount: Double = js.native
}
object MaxCount {
  
  @scala.inline
  def apply(fetchSize: Double, maxCount: Double): MaxCount = {
    val __obj = js.Dynamic.literal(fetchSize = fetchSize.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCount]
  }
  
  @scala.inline
  implicit class MaxCountMutableBuilder[Self <: MaxCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
  }
}
