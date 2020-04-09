package typings.nodeForge.mod.pkcs7

import typings.nodeForge.AnonAuthenticatedAttributes
import typings.nodeForge.AnonDetached
import typings.nodeForge.AnonValue
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkcsSignedData extends js.Object {
  var content: js.UndefOr[String | ByteBuffer] = js.native
  var contentInfo: js.UndefOr[AnonValue] = js.native
  def addCertificate(certificate: String): Unit = js.native
  def addCertificate(certificate: Certificate): Unit = js.native
  def addSigner(options: AnonAuthenticatedAttributes): Unit = js.native
  def sign(): Unit = js.native
  def sign(options: AnonDetached): Unit = js.native
  def toAsn1(): Asn1 = js.native
}

