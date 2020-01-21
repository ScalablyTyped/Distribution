package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
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
  @scala.inline
  def apply(
    extensions: StringDictionary[js.Object],
    md5: MessageDigest,
    sha1: MessageDigest,
    cipherSuite: CipherSuite = null,
    clientCertificate: Certificate = null,
    compressionMethod: CompressionMethod = null,
    serverCertificate: Certificate = null,
    version: ProtocolVersion = null
  ): Session = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    if (cipherSuite != null) __obj.updateDynamic("cipherSuite")(cipherSuite.asInstanceOf[js.Any])
    if (clientCertificate != null) __obj.updateDynamic("clientCertificate")(clientCertificate.asInstanceOf[js.Any])
    if (compressionMethod != null) __obj.updateDynamic("compressionMethod")(compressionMethod.asInstanceOf[js.Any])
    if (serverCertificate != null) __obj.updateDynamic("serverCertificate")(serverCertificate.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

