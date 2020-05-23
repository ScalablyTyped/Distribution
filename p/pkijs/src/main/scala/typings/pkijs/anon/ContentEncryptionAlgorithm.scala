package typings.pkijs.anon

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentEncryptionAlgorithm extends js.Object {
  var contentEncryptionAlgorithm: typings.std.Algorithm
  var contentToEncrypt: BufferSource
  var hmacHashAlgorithm: String
  var iterationCount: Double
  var password: String
}

object ContentEncryptionAlgorithm {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: typings.std.Algorithm,
    contentToEncrypt: BufferSource,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: String
  ): ContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncryptionAlgorithm]
  }
}

