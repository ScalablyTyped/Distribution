package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import typings.asn1js.mod.Sequence
import typings.pkijs.pkijsStrings.base64
import typings.pkijs.pkijsStrings.base64url
import typings.pkijs.pkijsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.AttributeCertificateInfoV2> */
trait AttributeCertificateInfoV2Parameters extends StObject {
  
  var attrCertValidityPeriod: js.UndefOr[AttCertValidityPeriod] = js.undefined
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var className: js.UndefOr[js.Function0[String]] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* parameters */ js.UndefOr[this.type], Any]] = js.undefined
  
  var extensions: js.UndefOr[Extensions] = js.undefined
  
  var fromSchema: js.UndefOr[js.Function1[/* schema */ SchemaType, Unit]] = js.undefined
  
  var holder: js.UndefOr[Holder] = js.undefined
  
  var issuer: js.UndefOr[GeneralNames | V2Form] = js.undefined
  
  var issuerUniqueID: js.UndefOr[BitString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var toJSON: js.UndefOr[js.Function0[AttributeCertificateInfoV2Json]] = js.undefined
  
  var toSchema: js.UndefOr[js.Function0[Sequence]] = js.undefined
  
  @JSName("toString")
  var toString_FAttributeCertificateInfoV2Parameters: js.UndefOr[js.Function1[/* encoding */ js.UndefOr[hex | base64 | base64url], String]] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object AttributeCertificateInfoV2Parameters {
  
  inline def apply(): AttributeCertificateInfoV2Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeCertificateInfoV2Parameters]
  }
  
  extension [Self <: AttributeCertificateInfoV2Parameters](x: Self) {
    
    inline def setAttrCertValidityPeriod(value: AttCertValidityPeriod): Self = StObject.set(x, "attrCertValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setAttrCertValidityPeriodUndefined: Self = StObject.set(x, "attrCertValidityPeriod", js.undefined)
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setClassName(value: () => String): Self = StObject.set(x, "className", js.Any.fromFunction0(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setConstructor(value: /* parameters */ js.UndefOr[AttributeCertificateInfoV2Parameters] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setFromSchema(value: /* schema */ SchemaType => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
    
    inline def setFromSchemaUndefined: Self = StObject.set(x, "fromSchema", js.undefined)
    
    inline def setHolder(value: Holder): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
    
    inline def setIssuer(value: GeneralNames | V2Form): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setIssuerUniqueID(value: BitString): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setToJSON(value: () => AttributeCertificateInfoV2Json): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToSchema(value: () => Sequence): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    
    inline def setToSchemaUndefined: Self = StObject.set(x, "toSchema", js.undefined)
    
    inline def setToString_(value: /* encoding */ js.UndefOr[hex | base64 | base64url] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
