package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPFX extends StObject {
  
  var authSafe: ContentInfo
  
  var macData: js.UndefOr[MacData] = js.undefined
  
  var parsedValue: js.UndefOr[PFXParsedValue] = js.undefined
  
  var version: Double
}
object IPFX {
  
  inline def apply(authSafe: ContentInfo, version: Double): IPFX = {
    val __obj = js.Dynamic.literal(authSafe = authSafe.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFX]
  }
  
  extension [Self <: IPFX](x: Self) {
    
    inline def setAuthSafe(value: ContentInfo): Self = StObject.set(x, "authSafe", value.asInstanceOf[js.Any])
    
    inline def setMacData(value: MacData): Self = StObject.set(x, "macData", value.asInstanceOf[js.Any])
    
    inline def setMacDataUndefined: Self = StObject.set(x, "macData", js.undefined)
    
    inline def setParsedValue(value: PFXParsedValue): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
