package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiWarning extends StObject {
  
  /** Code to uniquely identify the warning type. */
  var code: js.UndefOr[String] = js.undefined
  
  /** The warning message. */
  var message: js.UndefOr[String] = js.undefined
  
  /** The region name for REGION_UNREACHABLE warning. */
  var region: js.UndefOr[String] = js.undefined
}
object ApiWarning {
  
  inline def apply(): ApiWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiWarning]
  }
  
  extension [Self <: ApiWarning](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
