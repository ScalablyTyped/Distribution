package typings.msportalfxMock

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdfeCertificateMod {
  
  trait SubscriptionCertificate extends StObject {
    
    /**
      * Specifies the time that the management certificate was created, in UTC. An example Created value is 2011-05-11T16:15:26Z.
      */
    var created: Date
    
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
    
    @scala.inline
    def apply(
      created: Date,
      subscriptionCertificateData: String,
      subscriptionCertificatePublicKey: String,
      subscriptionCertificateThumbprint: String
    ): SubscriptionCertificate = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], subscriptionCertificateData = subscriptionCertificateData.asInstanceOf[js.Any], subscriptionCertificatePublicKey = subscriptionCertificatePublicKey.asInstanceOf[js.Any], subscriptionCertificateThumbprint = subscriptionCertificateThumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionCertificate]
    }
    
    @scala.inline
    implicit class SubscriptionCertificateMutableBuilder[Self <: SubscriptionCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionCertificateData(value: String): Self = StObject.set(x, "subscriptionCertificateData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionCertificatePublicKey(value: String): Self = StObject.set(x, "subscriptionCertificatePublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionCertificateThumbprint(value: String): Self = StObject.set(x, "subscriptionCertificateThumbprint", value.asInstanceOf[js.Any])
    }
  }
}
