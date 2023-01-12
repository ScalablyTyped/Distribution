package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IECCCMSSharedInfo> */
trait ECCCMSSharedInfoParameters extends StObject {
  
  var entityUInfo: js.UndefOr[OctetString] = js.undefined
  
  var keyInfo: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var suppPubInfo: js.UndefOr[OctetString] = js.undefined
}
object ECCCMSSharedInfoParameters {
  
  inline def apply(): ECCCMSSharedInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECCCMSSharedInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECCCMSSharedInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setEntityUInfo(value: OctetString): Self = StObject.set(x, "entityUInfo", value.asInstanceOf[js.Any])
    
    inline def setEntityUInfoUndefined: Self = StObject.set(x, "entityUInfo", js.undefined)
    
    inline def setKeyInfo(value: AlgorithmIdentifier): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
    
    inline def setKeyInfoUndefined: Self = StObject.set(x, "keyInfo", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSuppPubInfo(value: OctetString): Self = StObject.set(x, "suppPubInfo", value.asInstanceOf[js.Any])
    
    inline def setSuppPubInfoUndefined: Self = StObject.set(x, "suppPubInfo", js.undefined)
  }
}
