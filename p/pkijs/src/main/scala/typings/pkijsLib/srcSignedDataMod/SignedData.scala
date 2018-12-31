package typings
package pkijsLib.srcSignedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedData extends js.Object {
  var certificates: js.UndefOr[
    js.Array[pkijsLib.srcCertificateMod.default] | js.Array[pkijsLib.srcOtherCertificateFormatMod.default]
  ] = js.native
  var crls: js.UndefOr[
    js.Array[pkijsLib.srcCertificateRevocationListMod.default] | js.Array[pkijsLib.srcOtherRevocationInfoFormatMod.default]
  ] = js.native
  var digestAlgorithms: js.Array[pkijsLib.srcAlgorithmIdentifierMod.default] = js.native
  var encapContentInfo: pkijsLib.srcEncapsulatedContentInfoMod.default = js.native
  var signerInfos: js.Array[pkijsLib.srcSignerInfoMod.default] = js.native
  var version: scala.Double = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
    * Signing current SignedData
    * 
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {number} signerIndex Index number (starting from 0) of signer index to make signature for
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @param {BufferSource} [data] Detached data
    * @returns {ArrayBuffer}
    * 
    * @memberOf SignedData
    */
  def sign(privateKey: stdLib.CryptoKey, signerIndex: scala.Double): stdLib.ArrayBuffer = js.native
  def sign(privateKey: stdLib.CryptoKey, signerIndex: scala.Double, hashAlgorithm: java.lang.String): stdLib.ArrayBuffer = js.native
  def sign(
    privateKey: stdLib.CryptoKey,
    signerIndex: scala.Double,
    hashAlgorithm: java.lang.String,
    data: stdLib.BufferSource
  ): stdLib.ArrayBuffer = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: scala.Boolean): js.Any = js.native
  def verify(options: VerifyParams): js.Thenable[VerifyResult] = js.native
}

