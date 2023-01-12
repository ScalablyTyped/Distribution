package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDomainFederation
  extends StObject
     with IdentitySource {
  
  // The name of the identity source, typically also the domain name. Read only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The domain name. Read only.
  var domainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The issuerURI of the incoming federation. Read only.
  var issuerUri: js.UndefOr[NullableOption[String]] = js.undefined
}
object ExternalDomainFederation {
  
  inline def apply(): ExternalDomainFederation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDomainFederation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalDomainFederation] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setIssuerUri(value: NullableOption[String]): Self = StObject.set(x, "issuerUri", value.asInstanceOf[js.Any])
    
    inline def setIssuerUriNull: Self = StObject.set(x, "issuerUri", null)
    
    inline def setIssuerUriUndefined: Self = StObject.set(x, "issuerUri", js.undefined)
  }
}
