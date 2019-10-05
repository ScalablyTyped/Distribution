package typings.nodeDashForge.nodeDashForgeMod.pkcs12

import typings.nodeDashForge.Anon_3des
import typings.nodeDashForge.nodeDashForgeMod.asn1.Asn1
import typings.nodeDashForge.nodeDashForgeMod.pki.Certificate
import typings.nodeDashForge.nodeDashForgeMod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs12.toPkcs12Asn1")
@js.native
object toPkcs12Asn1 extends js.Object {
  def apply(key: PrivateKey, cert: js.Array[Certificate]): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: String): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: String, options: Anon_3des): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: Null, options: Anon_3des): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: String): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: String, options: Anon_3des): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: Null, options: Anon_3des): Asn1 = js.native
}

