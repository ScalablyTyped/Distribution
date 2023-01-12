package typings.nodeForge.mod

import typings.nodeForge.anon.AuthenticatedAttributes
import typings.nodeForge.anon.Detached
import typings.nodeForge.anon.RawCapture
import typings.nodeForge.anon.Value
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.pki.PEM
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs7 {
  
  @JSImport("node-forge", "pkcs7")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEnvelopedData(): PkcsEnvelopedData = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnvelopedData")().asInstanceOf[PkcsEnvelopedData]
  
  inline def createSignedData(): PkcsSignedData = ^.asInstanceOf[js.Dynamic].applyDynamic("createSignedData")().asInstanceOf[PkcsSignedData]
  
  /**
    * Converts a PKCS#7 message from an ASN.1 object.
    *
    * @param asn the ASN.1 representation of a ContentInfo.
    *
    * @return the PKCS#7 message.
    */
  inline def messageFromAsn1(asn: Asn1): Captured[PkcsEnvelopedData | PkcsSignedData] = ^.asInstanceOf[js.Dynamic].applyDynamic("messageFromAsn1")(asn.asInstanceOf[js.Any]).asInstanceOf[Captured[PkcsEnvelopedData | PkcsSignedData]]
  
  /**
    * Converts a PKCS#7 message from PEM format.
    *
    * @param pem the PEM-formatted PKCS#7 message.
    *
    * @return the PKCS#7 message.
    */
  inline def messageFromPem(pem: PEM): Captured[PkcsEnvelopedData | PkcsSignedData] = ^.asInstanceOf[js.Dynamic].applyDynamic("messageFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[Captured[PkcsEnvelopedData | PkcsSignedData]]
  
  /**
    * Converts a PKCS#7 message to PEM format.
    *
    * @param msg The PKCS#7 message object
    * @param maxline The maximum characters per line, defaults to 64.
    *
    * @return The PEM-formatted PKCS#7 message.
    */
  inline def messageToPem(msg: PkcsSignedData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageToPem")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def messageToPem(msg: PkcsSignedData, maxline: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("messageToPem")(msg.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** When a PKCS#7 object has been created by reading from a message, the raw captured object is joined */
  type Captured[T] = T & RawCapture
  
  trait PkcsEnvelopedData extends StObject {
    
    def addRecipient(certificate: Certificate): Unit
    
    var content: js.UndefOr[String | ByteBuffer] = js.undefined
    
    def encrypt(): Unit
    
    def toAsn1(): Asn1
  }
  object PkcsEnvelopedData {
    
    inline def apply(addRecipient: Certificate => Unit, encrypt: () => Unit, toAsn1: () => Asn1): PkcsEnvelopedData = {
      val __obj = js.Dynamic.literal(addRecipient = js.Any.fromFunction1(addRecipient), encrypt = js.Any.fromFunction0(encrypt), toAsn1 = js.Any.fromFunction0(toAsn1))
      __obj.asInstanceOf[PkcsEnvelopedData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PkcsEnvelopedData] (val x: Self) extends AnyVal {
      
      inline def setAddRecipient(value: Certificate => Unit): Self = StObject.set(x, "addRecipient", js.Any.fromFunction1(value))
      
      inline def setContent(value: String | ByteBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEncrypt(value: () => Unit): Self = StObject.set(x, "encrypt", js.Any.fromFunction0(value))
      
      inline def setToAsn1(value: () => Asn1): Self = StObject.set(x, "toAsn1", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PkcsSignedData extends StObject {
    
    def addCertificate(certificate: String): Unit = js.native
    def addCertificate(certificate: Certificate): Unit = js.native
    
    def addSigner(options: AuthenticatedAttributes): Unit = js.native
    
    var certificates: js.Array[Certificate] = js.native
    
    var content: js.UndefOr[String | ByteBuffer] = js.native
    
    var contentInfo: js.UndefOr[Value] = js.native
    
    def sign(): Unit = js.native
    def sign(options: Detached): Unit = js.native
    
    def toAsn1(): Asn1 = js.native
  }
}
