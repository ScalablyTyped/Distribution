package typings.mkcert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mkcert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCA(caCerticateInfo: CACertificateInfo): js.Promise[Certificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCA")(caCerticateInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Certificate]]
  
  inline def createCert(certicateInfo: CertificateInfo): js.Promise[Certificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCert")(certicateInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Certificate]]
  
  trait CACertificateInfo extends StObject {
    
    var countryCode: String
    
    var locality: String
    
    var organization: String
    
    var state: String
    
    var validityDays: Double
  }
  object CACertificateInfo {
    
    inline def apply(countryCode: String, locality: String, organization: String, state: String, validityDays: Double): CACertificateInfo = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CACertificateInfo]
    }
    
    extension [Self <: CACertificateInfo](x: Self) {
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setValidityDays(value: Double): Self = StObject.set(x, "validityDays", value.asInstanceOf[js.Any])
    }
  }
  
  trait Certificate extends StObject {
    
    var cert: String
    
    var key: String
  }
  object Certificate {
    
    inline def apply(cert: String, key: String): Certificate = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Certificate]
    }
    
    extension [Self <: Certificate](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateInfo extends StObject {
    
    var caCert: String
    
    var caKey: String
    
    var domains: js.Array[String]
    
    var validityDays: Double
  }
  object CertificateInfo {
    
    inline def apply(caCert: String, caKey: String, domains: js.Array[String], validityDays: Double): CertificateInfo = {
      val __obj = js.Dynamic.literal(caCert = caCert.asInstanceOf[js.Any], caKey = caKey.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateInfo]
    }
    
    extension [Self <: CertificateInfo](x: Self) {
      
      inline def setCaCert(value: String): Self = StObject.set(x, "caCert", value.asInstanceOf[js.Any])
      
      inline def setCaKey(value: String): Self = StObject.set(x, "caKey", value.asInstanceOf[js.Any])
      
      inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      inline def setValidityDays(value: Double): Self = StObject.set(x, "validityDays", value.asInstanceOf[js.Any])
    }
  }
}
