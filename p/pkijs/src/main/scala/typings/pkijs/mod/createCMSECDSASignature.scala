package typings.pkijs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "createCMSECDSASignature")
@js.native
object createCMSECDSASignature extends js.Object {
  /**
    * Create CMS ECDSA signature from WebCrypto ECDSA signature
    *
    * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
    * @returns {ArrayBuffer}
    */
  def apply(signatureBuffer: ArrayBuffer): ArrayBuffer = js.native
}

