package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.Anon_3des
import typings.nodeDashForge.Anon_Encrypted
import typings.nodeDashForge.Anon_FriendlyName
import typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Asn1
import typings.nodeDashForge.nodeDashForgeMod.mdNs.MessageDigest
import typings.nodeDashForge.nodeDashForgeMod.pkcs12Ns.Bag
import typings.nodeDashForge.nodeDashForgeMod.pkcs12Ns.BagsFilter
import typings.nodeDashForge.nodeDashForgeMod.pkcs12Ns.Pkcs12Pfx
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.Certificate
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PrivateKey
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs12")
@js.native
object pkcs12Ns extends js.Object {
  trait Bag extends js.Object {
    var asn1: Asn1
    var attributes: js.Any
    var cert: js.UndefOr[Certificate] = js.undefined
    var key: js.UndefOr[PrivateKey] = js.undefined
    var `type`: String
  }
  
  trait BagsFilter extends js.Object {
    var bagType: js.UndefOr[String] = js.undefined
    var friendlyName: js.UndefOr[String] = js.undefined
    var localKeyId: js.UndefOr[String] = js.undefined
    var localKeyIdHex: js.UndefOr[String] = js.undefined
  }
  
  trait Pkcs12Pfx extends js.Object {
    var safeContents: js.Array[Anon_Encrypted]
    var version: String
    def getBags(filter: BagsFilter): Anon_FriendlyName
    def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag]
    def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag]
  }
  
  def generateKey(password: js.UndefOr[scala.Nothing], salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def generateKey(
    password: js.UndefOr[scala.Nothing],
    salt: ByteBuffer,
    id: Byte,
    iter: Double,
    n: Double,
    md: MessageDigest
  ): ByteBuffer = js.native
  def generateKey(password: String, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def generateKey(password: String, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = js.native
  def generateKey(password: Null, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = js.native
  def generateKey(password: Null, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = js.native
  def pkcs12FromAsn1(obj: js.Any): Pkcs12Pfx = js.native
  def pkcs12FromAsn1(obj: js.Any, password: String): Pkcs12Pfx = js.native
  def pkcs12FromAsn1(obj: js.Any, strict: Boolean): Pkcs12Pfx = js.native
  def pkcs12FromAsn1(obj: js.Any, strict: Boolean, password: String): Pkcs12Pfx = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate]): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate], password: String): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate], password: String, options: Anon_3des): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate], password: Null, options: Anon_3des): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate, password: String): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate, password: String, options: Anon_3des): Asn1 = js.native
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate, password: Null, options: Anon_3des): Asn1 = js.native
}

