package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeStampResp extends StObject {
  
  /**
    * Time-Stamp status
    */
  var status: PKIStatusInfo
  
  /**
    * Time-Stamp token
    */
  var timeStampToken: js.UndefOr[ContentInfo] = js.undefined
}
object ITimeStampResp {
  
  inline def apply(status: PKIStatusInfo): ITimeStampResp = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeStampResp]
  }
  
  extension [Self <: ITimeStampResp](x: Self) {
    
    inline def setStatus(value: PKIStatusInfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimeStampToken(value: ContentInfo): Self = StObject.set(x, "timeStampToken", value.asInstanceOf[js.Any])
    
    inline def setTimeStampTokenUndefined: Self = StObject.set(x, "timeStampToken", js.undefined)
  }
}
