package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Utf8String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPKIStatusInfo extends StObject {
  
  var failInfo: js.UndefOr[BitString] = js.undefined
  
  var status: PKIStatus
  
  var statusStrings: js.UndefOr[js.Array[Utf8String]] = js.undefined
}
object IPKIStatusInfo {
  
  inline def apply(status: PKIStatus): IPKIStatusInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPKIStatusInfo]
  }
  
  extension [Self <: IPKIStatusInfo](x: Self) {
    
    inline def setFailInfo(value: BitString): Self = StObject.set(x, "failInfo", value.asInstanceOf[js.Any])
    
    inline def setFailInfoUndefined: Self = StObject.set(x, "failInfo", js.undefined)
    
    inline def setStatus(value: PKIStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusStrings(value: js.Array[Utf8String]): Self = StObject.set(x, "statusStrings", value.asInstanceOf[js.Any])
    
    inline def setStatusStringsUndefined: Self = StObject.set(x, "statusStrings", js.undefined)
    
    inline def setStatusStringsVarargs(value: Utf8String*): Self = StObject.set(x, "statusStrings", js.Array(value*))
  }
}
