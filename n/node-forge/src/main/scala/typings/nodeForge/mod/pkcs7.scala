package typings.nodeForge.mod

import typings.nodeForge.anon.AuthenticatedAttributes
import typings.nodeForge.anon.Detached
import typings.nodeForge.anon.Value
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
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
    
    extension [Self <: PkcsEnvelopedData](x: Self) {
      
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
    
    var content: js.UndefOr[String | ByteBuffer] = js.native
    
    var contentInfo: js.UndefOr[Value] = js.native
    
    def sign(): Unit = js.native
    def sign(options: Detached): Unit = js.native
    
    def toAsn1(): Asn1 = js.native
  }
}
