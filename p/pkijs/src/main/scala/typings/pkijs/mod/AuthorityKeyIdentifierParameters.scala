package typings.pkijs.mod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAuthorityKeyIdentifier> */
trait AuthorityKeyIdentifierParameters extends StObject {
  
  var authorityCertIssuer: js.UndefOr[js.Array[GeneralName]] = js.undefined
  
  var authorityCertSerialNumber: js.UndefOr[Integer] = js.undefined
  
  var keyIdentifier: js.UndefOr[OctetString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object AuthorityKeyIdentifierParameters {
  
  inline def apply(): AuthorityKeyIdentifierParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorityKeyIdentifierParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorityKeyIdentifierParameters] (val x: Self) extends AnyVal {
    
    inline def setAuthorityCertIssuer(value: js.Array[GeneralName]): Self = StObject.set(x, "authorityCertIssuer", value.asInstanceOf[js.Any])
    
    inline def setAuthorityCertIssuerUndefined: Self = StObject.set(x, "authorityCertIssuer", js.undefined)
    
    inline def setAuthorityCertIssuerVarargs(value: GeneralName*): Self = StObject.set(x, "authorityCertIssuer", js.Array(value*))
    
    inline def setAuthorityCertSerialNumber(value: Integer): Self = StObject.set(x, "authorityCertSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setAuthorityCertSerialNumberUndefined: Self = StObject.set(x, "authorityCertSerialNumber", js.undefined)
    
    inline def setKeyIdentifier(value: OctetString): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
