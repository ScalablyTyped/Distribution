package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.Anon_AuthenticatedAttributes
import typings.nodeDashForge.Anon_Detached
import typings.nodeDashForge.Anon_Value
import typings.nodeDashForge.nodeDashForgeMod.asn1.Asn1
import typings.nodeDashForge.nodeDashForgeMod.pki.Certificate
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs7")
@js.native
object pkcs7 extends js.Object {
  @js.native
  trait PkcsSignedData extends js.Object {
    var content: js.UndefOr[String | ByteBuffer] = js.native
    var contentInfo: js.UndefOr[Anon_Value] = js.native
    def addCertificate(certificate: String): Unit = js.native
    def addCertificate(certificate: Certificate): Unit = js.native
    def addSigner(options: Anon_AuthenticatedAttributes): Unit = js.native
    def sign(): Unit = js.native
    def sign(options: Anon_Detached): Unit = js.native
    def toAsn1(): Asn1 = js.native
  }
  
  def createSignedData(): PkcsSignedData = js.native
}

