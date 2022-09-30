package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeStampRespJson extends StObject {
  
  var status: PKIStatusInfoJson
  
  var timeStampToken: js.UndefOr[ContentInfoJson] = js.undefined
}
object TimeStampRespJson {
  
  inline def apply(status: PKIStatusInfoJson): TimeStampRespJson = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStampRespJson]
  }
  
  extension [Self <: TimeStampRespJson](x: Self) {
    
    inline def setStatus(value: PKIStatusInfoJson): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimeStampToken(value: ContentInfoJson): Self = StObject.set(x, "timeStampToken", value.asInstanceOf[js.Any])
    
    inline def setTimeStampTokenUndefined: Self = StObject.set(x, "timeStampToken", js.undefined)
  }
}
