package typings.nodeForge.mod.pkcs7

import typings.nodeForge.anon.AuthenticatedAttributes
import typings.nodeForge.anon.Detached
import typings.nodeForge.anon.Value
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkcsSignedData extends js.Object {
  var content: js.UndefOr[String | ByteBuffer] = js.native
  var contentInfo: js.UndefOr[Value] = js.native
  def addCertificate(certificate: String): Unit = js.native
  def addCertificate(certificate: Certificate): Unit = js.native
  def addSigner(options: AuthenticatedAttributes): Unit = js.native
  def sign(): Unit = js.native
  def sign(options: Detached): Unit = js.native
  def toAsn1(): Asn1 = js.native
}

