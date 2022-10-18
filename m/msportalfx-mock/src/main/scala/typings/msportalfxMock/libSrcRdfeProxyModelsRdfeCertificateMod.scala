package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcRdfeProxyModelsRdfeCertificateMod {
  
  trait SubscriptionCertificate extends StObject {
    
    /**
      * Specifies the time that the management certificate was created, in UTC. An example Created value is 2011-05-11T16:15:26Z.
      */
    var created: js.Date
    
    /**
      * Specifies the base-64 encoded data contained in the management certificate, in .cer format.
      */
    var subscriptionCertificateData: String
    
    /**
      * Specifies a base-64 encoded public key for the management certificate.
      */
    var subscriptionCertificatePublicKey: String
    
    /**
      * Specifies the thumbprint of the management certificate.
      */
    var subscriptionCertificateThumbprint: String
  }
  object SubscriptionCertificate {
    
    inline def apply(
      created: js.Date,
      subscriptionCertificateData: String,
      subscriptionCertificatePublicKey: String,
      subscriptionCertificateThumbprint: String
    ): SubscriptionCertificate = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], subscriptionCertificateData = subscriptionCertificateData.asInstanceOf[js.Any], subscriptionCertificatePublicKey = subscriptionCertificatePublicKey.asInstanceOf[js.Any], subscriptionCertificateThumbprint = subscriptionCertificateThumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionCertificate]
    }
    
    extension [Self <: SubscriptionCertificate](x: Self) {
      
      inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionCertificateData(value: String): Self = StObject.set(x, "subscriptionCertificateData", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionCertificatePublicKey(value: String): Self = StObject.set(x, "subscriptionCertificatePublicKey", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionCertificateThumbprint(value: String): Self = StObject.set(x, "subscriptionCertificateThumbprint", value.asInstanceOf[js.Any])
    }
  }
}
