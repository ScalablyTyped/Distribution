package typings
package pkijsLib.srcTimeStampRespMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeStampResp extends js.Object {
  var status: pkijsLib.srcPKIStatusInfoMod.default = js.native
  var timeStampToken: js.UndefOr[pkijsLib.srcContentInfoMod.default] = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
           * Sign current TSP Response
           * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
           * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
           * @returns {Promise}
           */
  def sign(privateKey: stdLib.CryptoKey): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Sign current TSP Response
           * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
           * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
           * @returns {Promise}
           */
  def sign(privateKey: stdLib.CryptoKey, hashAlgorithm: java.lang.String): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  /**
           * Verify current TSP Response
           * @param {VerifyParams} verificationParameters Input parameters for verification
           * @returns {Promise}
           */
  def verify(verificationParameters: pkijsLib.srcSignedDataMod.VerifyParams): stdLib.PromiseLike[pkijsLib.srcSignedDataMod.VerifyResult] = js.native
}

