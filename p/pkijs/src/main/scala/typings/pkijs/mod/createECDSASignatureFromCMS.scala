package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/common", "createECDSASignatureFromCMS")
@js.native
object createECDSASignatureFromCMS extends js.Object {
  
  /**
    * Create a single ArrayBuffer from CMS ECDSA signature
    *
    * @param {Sequence} cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
    * @returns {ArrayBuffer}
    */
  def apply(cmsSignature: Sequence): ArrayBuffer = js.native
}
