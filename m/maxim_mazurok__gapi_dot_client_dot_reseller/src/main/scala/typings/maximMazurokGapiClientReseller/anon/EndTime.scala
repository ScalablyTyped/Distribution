package typings.maximMazurokGapiClientReseller.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTime extends StObject {
  
  /** An annual commitment plan's interval's `endTime` in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** An annual commitment plan's interval's `startTime` in milliseconds using UNIX Epoch format. See an example Epoch converter. */
  var startTime: js.UndefOr[String] = js.undefined
}
object EndTime {
  
  inline def apply(): EndTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndTime]
  }
  
  extension [Self <: EndTime](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
