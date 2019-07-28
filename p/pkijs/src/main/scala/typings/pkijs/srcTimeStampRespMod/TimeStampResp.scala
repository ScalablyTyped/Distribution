package typings.pkijs.srcTimeStampRespMod

import typings.pkijs.srcSignedDataMod.VerifyParams
import typings.pkijs.srcSignedDataMod.VerifyResult
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeStampResp extends js.Object {
  var status: typings.pkijs.srcPKIStatusInfoMod.default = js.native
  var timeStampToken: js.UndefOr[typings.pkijs.srcContentInfoMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Sign current TSP Response
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @returns {Promise}
    */
  def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  /**
    * Verify current TSP Response
    * @param {VerifyParams} verificationParameters Input parameters for verification
    * @returns {Promise}
    */
  def verify(verificationParameters: VerifyParams): js.Thenable[VerifyResult] = js.native
}

