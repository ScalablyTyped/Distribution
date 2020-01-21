package typings.nodeForge.mod.pki

import typings.nodeForge.mod.asn1.Asn1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.privateKeyFromAsn1")
@js.native
object privateKeyFromAsn1 extends js.Object {
  def apply(privateKey: Asn1): PrivateKey = js.native
}

