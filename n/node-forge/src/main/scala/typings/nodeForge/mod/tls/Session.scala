package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var cipherSuite: CipherSuite | Null
  
  var clientCertificate: Certificate | Null
  
  var compressionMethod: CompressionMethod | Null
  
  var extensions: StringDictionary[js.Object]
  
  var md5: MessageDigest
  
  var serverCertificate: Certificate | Null
  
  var sha1: MessageDigest
  
  var version: ProtocolVersion | Null
}
object Session {
  
  inline def apply(extensions: StringDictionary[js.Object], md5: MessageDigest, sha1: MessageDigest): Session = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], cipherSuite = null, clientCertificate = null, compressionMethod = null, serverCertificate = null, version = null)
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setCipherSuite(value: CipherSuite): Self = StObject.set(x, "cipherSuite", value.asInstanceOf[js.Any])
    
    inline def setCipherSuiteNull: Self = StObject.set(x, "cipherSuite", null)
    
    inline def setClientCertificate(value: Certificate): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateNull: Self = StObject.set(x, "clientCertificate", null)
    
    inline def setCompressionMethod(value: CompressionMethod): Self = StObject.set(x, "compressionMethod", value.asInstanceOf[js.Any])
    
    inline def setCompressionMethodNull: Self = StObject.set(x, "compressionMethod", null)
    
    inline def setExtensions(value: StringDictionary[js.Object]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setMd5(value: MessageDigest): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setServerCertificate(value: Certificate): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateNull: Self = StObject.set(x, "serverCertificate", null)
    
    inline def setSha1(value: MessageDigest): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ProtocolVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
