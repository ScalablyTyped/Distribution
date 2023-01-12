package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableRange extends StObject {
  
  var disableRange: Any
  
  var getResponseHeader: Any
  
  var isHttp: Any
  
  var rangeChunkSize: Any
}
object DisableRange {
  
  inline def apply(disableRange: Any, getResponseHeader: Any, isHttp: Any, rangeChunkSize: Any): DisableRange = {
    val __obj = js.Dynamic.literal(disableRange = disableRange.asInstanceOf[js.Any], getResponseHeader = getResponseHeader.asInstanceOf[js.Any], isHttp = isHttp.asInstanceOf[js.Any], rangeChunkSize = rangeChunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableRange] (val x: Self) extends AnyVal {
    
    inline def setDisableRange(value: Any): Self = StObject.set(x, "disableRange", value.asInstanceOf[js.Any])
    
    inline def setGetResponseHeader(value: Any): Self = StObject.set(x, "getResponseHeader", value.asInstanceOf[js.Any])
    
    inline def setIsHttp(value: Any): Self = StObject.set(x, "isHttp", value.asInstanceOf[js.Any])
    
    inline def setRangeChunkSize(value: Any): Self = StObject.set(x, "rangeChunkSize", value.asInstanceOf[js.Any])
  }
}
