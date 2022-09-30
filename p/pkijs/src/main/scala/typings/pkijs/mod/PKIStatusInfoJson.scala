package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.Utf8StringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PKIStatusInfoJson extends StObject {
  
  var failInfo: js.UndefOr[BitStringJson] = js.undefined
  
  var status: PKIStatus
  
  var statusStrings: js.UndefOr[js.Array[Utf8StringJson]] = js.undefined
}
object PKIStatusInfoJson {
  
  inline def apply(status: PKIStatus): PKIStatusInfoJson = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKIStatusInfoJson]
  }
  
  extension [Self <: PKIStatusInfoJson](x: Self) {
    
    inline def setFailInfo(value: BitStringJson): Self = StObject.set(x, "failInfo", value.asInstanceOf[js.Any])
    
    inline def setFailInfoUndefined: Self = StObject.set(x, "failInfo", js.undefined)
    
    inline def setStatus(value: PKIStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusStrings(value: js.Array[Utf8StringJson]): Self = StObject.set(x, "statusStrings", value.asInstanceOf[js.Any])
    
    inline def setStatusStringsUndefined: Self = StObject.set(x, "statusStrings", js.undefined)
    
    inline def setStatusStringsVarargs(value: Utf8StringJson*): Self = StObject.set(x, "statusStrings", js.Array(value*))
  }
}
