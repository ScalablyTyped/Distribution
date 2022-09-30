package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECCCMSSharedInfoJson extends StObject {
  
  var entityUInfo: js.UndefOr[OctetStringJson] = js.undefined
  
  var keyInfo: AlgorithmIdentifierJson
  
  var suppPubInfo: OctetStringJson
}
object ECCCMSSharedInfoJson {
  
  inline def apply(keyInfo: AlgorithmIdentifierJson, suppPubInfo: OctetStringJson): ECCCMSSharedInfoJson = {
    val __obj = js.Dynamic.literal(keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCCMSSharedInfoJson]
  }
  
  extension [Self <: ECCCMSSharedInfoJson](x: Self) {
    
    inline def setEntityUInfo(value: OctetStringJson): Self = StObject.set(x, "entityUInfo", value.asInstanceOf[js.Any])
    
    inline def setEntityUInfoUndefined: Self = StObject.set(x, "entityUInfo", js.undefined)
    
    inline def setKeyInfo(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
    
    inline def setSuppPubInfo(value: OctetStringJson): Self = StObject.set(x, "suppPubInfo", value.asInstanceOf[js.Any])
  }
}
