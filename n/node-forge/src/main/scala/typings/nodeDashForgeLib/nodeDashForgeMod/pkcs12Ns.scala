package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs12")
@js.native
object pkcs12Ns extends js.Object {
  trait Bag extends js.Object {
    var asn1: nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1
    var attributes: js.Any
    var cert: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate] = js.undefined
    var key: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey] = js.undefined
    var `type`: java.lang.String
  }
  
  trait BagsFilter extends js.Object {
    var bagType: js.UndefOr[java.lang.String] = js.undefined
    var friendlyName: js.UndefOr[java.lang.String] = js.undefined
    var localKeyId: js.UndefOr[java.lang.String] = js.undefined
    var localKeyIdHex: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Pkcs12Pfx extends js.Object {
    var safeContents: js.Array[nodeDashForgeLib.Anon_Encrypted]
    var version: java.lang.String
    def getBags(filter: BagsFilter): nodeDashForgeLib.Anon_FriendlyName
    def getBagsByFriendlyName(fiendlyName: java.lang.String, bagType: java.lang.String): js.Array[Bag]
    def getBagsByLocalKeyId(localKeyId: java.lang.String, bagType: java.lang.String): js.Array[Bag]
  }
  
  def generateKey(
    password: java.lang.String,
    salt: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    id: nodeDashForgeLib.nodeDashForgeMod.Byte,
    iter: scala.Double,
    n: scala.Double
  ): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  def generateKey(
    password: java.lang.String,
    salt: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    id: nodeDashForgeLib.nodeDashForgeMod.Byte,
    iter: scala.Double,
    n: scala.Double,
    md: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
  ): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  def generateKey(
    password: js.UndefOr[scala.Nothing],
    salt: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    id: nodeDashForgeLib.nodeDashForgeMod.Byte,
    iter: scala.Double,
    n: scala.Double
  ): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  def generateKey(
    password: js.UndefOr[scala.Nothing],
    salt: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    id: nodeDashForgeLib.nodeDashForgeMod.Byte,
    iter: scala.Double,
    n: scala.Double,
    md: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
  ): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  def generateKey(
    password: scala.Null,
    salt: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    id: nodeDashForgeLib.nodeDashForgeMod.Byte,
    iter: scala.Double,
    n: scala.Double
  ): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  def generateKey(
    password: scala.Null,
    salt: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    id: nodeDashForgeLib.nodeDashForgeMod.Byte,
    iter: scala.Double,
    n: scala.Double,
    md: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
  ): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  def pkcs12FromAsn1(obj: js.Any): Pkcs12Pfx = js.native
  def pkcs12FromAsn1(obj: js.Any, password: java.lang.String): Pkcs12Pfx = js.native
  def pkcs12FromAsn1(obj: js.Any, strict: scala.Boolean): Pkcs12Pfx = js.native
  def pkcs12FromAsn1(obj: js.Any, strict: scala.Boolean, password: java.lang.String): Pkcs12Pfx = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate]
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate],
    password: java.lang.String
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate],
    password: java.lang.String,
    options: nodeDashForgeLib.Anon_3des
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate],
    password: scala.Null,
    options: nodeDashForgeLib.Anon_3des
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate,
    password: java.lang.String
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate,
    password: java.lang.String,
    options: nodeDashForgeLib.Anon_3des
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
  def toPkcs12Asn1(
    key: nodeDashForgeLib.nodeDashForgeMod.pkiNs.PrivateKey,
    cert: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate,
    password: scala.Null,
    options: nodeDashForgeLib.Anon_3des
  ): nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Asn1 = js.native
}

