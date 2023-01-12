package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IECCCMSSharedInfo extends StObject {
  
  var entityUInfo: js.UndefOr[OctetString] = js.undefined
  
  var keyInfo: AlgorithmIdentifier
  
  var suppPubInfo: OctetString
}
object IECCCMSSharedInfo {
  
  inline def apply(keyInfo: AlgorithmIdentifier, suppPubInfo: OctetString): IECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IECCCMSSharedInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IECCCMSSharedInfo] (val x: Self) extends AnyVal {
    
    inline def setEntityUInfo(value: OctetString): Self = StObject.set(x, "entityUInfo", value.asInstanceOf[js.Any])
    
    inline def setEntityUInfoUndefined: Self = StObject.set(x, "entityUInfo", js.undefined)
    
    inline def setKeyInfo(value: AlgorithmIdentifier): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
    
    inline def setSuppPubInfo(value: OctetString): Self = StObject.set(x, "suppPubInfo", value.asInstanceOf[js.Any])
  }
}
