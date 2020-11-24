package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  var cipherSuite: CipherSuite | Null = js.native
  
  var clientCertificate: Certificate | Null = js.native
  
  var compressionMethod: CompressionMethod | Null = js.native
  
  var extensions: StringDictionary[js.Object] = js.native
  
  var md5: MessageDigest = js.native
  
  var serverCertificate: Certificate | Null = js.native
  
  var sha1: MessageDigest = js.native
  
  var version: ProtocolVersion | Null = js.native
}
object Session {
  
  @scala.inline
  def apply(extensions: StringDictionary[js.Object], md5: MessageDigest, sha1: MessageDigest): Session = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtensions(value: StringDictionary[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: MessageDigest): Self = this.set("md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: MessageDigest): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherSuite(value: CipherSuite): Self = this.set("cipherSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherSuiteNull: Self = this.set("cipherSuite", null)
    
    @scala.inline
    def setClientCertificate(value: Certificate): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateNull: Self = this.set("clientCertificate", null)
    
    @scala.inline
    def setCompressionMethod(value: CompressionMethod): Self = this.set("compressionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionMethodNull: Self = this.set("compressionMethod", null)
    
    @scala.inline
    def setServerCertificate(value: Certificate): Self = this.set("serverCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateNull: Self = this.set("serverCertificate", null)
    
    @scala.inline
    def setVersion(value: ProtocolVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
