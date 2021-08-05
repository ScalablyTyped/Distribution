package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppReturnCode extends StObject {
  
  // Return code.
  var returnCode: js.UndefOr[Double] = js.undefined
  
  // The type of return code. Possible values are: failed, success, softReboot, hardReboot, retry.
  var `type`: js.UndefOr[Win32LobAppReturnCodeType] = js.undefined
}
object Win32LobAppReturnCode {
  
  inline def apply(): Win32LobAppReturnCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppReturnCode]
  }
  
  extension [Self <: Win32LobAppReturnCode](x: Self) {
    
    inline def setReturnCode(value: Double): Self = StObject.set(x, "returnCode", value.asInstanceOf[js.Any])
    
    inline def setReturnCodeUndefined: Self = StObject.set(x, "returnCode", js.undefined)
    
    inline def setType(value: Win32LobAppReturnCodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
