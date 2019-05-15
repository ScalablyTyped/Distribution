package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs7")
@js.native
object pkcs7Ns extends js.Object {
  @js.native
  trait PkcsSignedData extends js.Object {
    var content: js.UndefOr[java.lang.String | nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer] = js.native
    var contentInfo: js.UndefOr[nodeDashForgeLib.Anon_Value] = js.native
    def addCertificate(certificate: java.lang.String): scala.Unit = js.native
    def addCertificate(certificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate): scala.Unit = js.native
    def addSigner(options: nodeDashForgeLib.Anon_AuthenticatedAttributes): scala.Unit = js.native
    def sign(): scala.Unit = js.native
    def sign(options: nodeDashForgeLib.Anon_Detached): scala.Unit = js.native
    def toAsn1(): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  }
  
  def createSignedData(): PkcsSignedData = js.native
}

