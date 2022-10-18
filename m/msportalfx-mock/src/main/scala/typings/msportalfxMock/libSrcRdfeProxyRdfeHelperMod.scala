package typings.msportalfxMock

import typings.msportalfxMock.libSrcRdfeProxyModelsRdfeCertificateMod.SubscriptionCertificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcRdfeProxyRdfeHelperMod {
  
  object RdfeHelper {
    
    @JSImport("msportalfx-mock/lib/src/RdfeProxy/rdfeHelper", "RdfeHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deep clone a javascript object
      * @param obj
      */
    inline def cloneObject(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Converts a SubvscriptionCertificate into a xml encoded string.
      * @param certificate
      */
    inline def convertSubscriptionCertificateToXml(certificate: SubscriptionCertificate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSubscriptionCertificateToXml")(certificate.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts a SubscriptionCertificate array into a xml encoded string.
      * @param certificates
      */
    inline def convertSubscriptionCertificatesToXml(certificates: js.Array[SubscriptionCertificate]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSubscriptionCertificatesToXml")(certificates.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts a xml string encoding of a SubscriptionCertificate into the Javascript Object.
      * @param xml
      */
    inline def convertXmlToSubscriptionCertificate(xml: String): SubscriptionCertificate = ^.asInstanceOf[js.Dynamic].applyDynamic("convertXmlToSubscriptionCertificate")(xml.asInstanceOf[js.Any]).asInstanceOf[SubscriptionCertificate]
    
    /**
      * Converts a xml string encoding of SubvscriptionCertificates into a SubscriptionCertificate array.
      * @param xml
      */
    inline def convertXmlToSubscriptionCertificates(xml: String): js.Array[SubscriptionCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertXmlToSubscriptionCertificates")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Array[SubscriptionCertificate]]
  }
}
