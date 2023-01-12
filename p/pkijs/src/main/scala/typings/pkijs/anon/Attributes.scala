package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.AttCertValidityPeriodSchema
import typings.pkijs.mod.ExtensionsSchema
import typings.pkijs.mod.HolderSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attrCertValidityPeriod: js.UndefOr[AttCertValidityPeriodSchema] = js.undefined
  
  var attributes: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[ExtensionsSchema] = js.undefined
  
  var holder: js.UndefOr[HolderSchema] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var issuerUniqueID: js.UndefOr[String] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriodSchema): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttrCertValidityPeriodUndefined: Self = StObject.set(x, "attrCertValidityPeriod", js.undefined)
    
    inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setExtensions(value: ExtensionsSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHolder(value: HolderSchema): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setIssuerUniqueID(value: String): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
