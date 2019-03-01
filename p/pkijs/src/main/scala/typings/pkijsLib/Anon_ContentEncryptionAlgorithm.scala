package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentEncryptionAlgorithm extends js.Object {
  var contentEncryptionAlgorithm: stdLib.Algorithm
  var contentToEncrypt: stdLib.BufferSource
  var hmacHashAlgorithm: java.lang.String
  var iterationCount: scala.Double
  var password: java.lang.String
}

object Anon_ContentEncryptionAlgorithm {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: stdLib.Algorithm,
    contentToEncrypt: stdLib.BufferSource,
    hmacHashAlgorithm: java.lang.String,
    iterationCount: scala.Double,
    password: java.lang.String
  ): Anon_ContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentEncryptionAlgorithm")(contentEncryptionAlgorithm)
    __obj.updateDynamic("contentToEncrypt")(contentToEncrypt)
    __obj.updateDynamic("hmacHashAlgorithm")(hmacHashAlgorithm)
    __obj.updateDynamic("iterationCount")(iterationCount)
    __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[Anon_ContentEncryptionAlgorithm]
  }
}

