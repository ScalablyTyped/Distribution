package typings.pkijs

import typings.std.Algorithm
import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentEncryptionAlgorithm extends js.Object {
  var contentEncryptionAlgorithm: Algorithm
  var contentToEncrypt: BufferSource
  var hmacHashAlgorithm: String
  var iterationCount: Double
  var password: String
}

object Anon_ContentEncryptionAlgorithm {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: Algorithm,
    contentToEncrypt: BufferSource,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: String
  ): Anon_ContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm, contentToEncrypt = contentToEncrypt, hmacHashAlgorithm = hmacHashAlgorithm, iterationCount = iterationCount, password = password)
  
    __obj.asInstanceOf[Anon_ContentEncryptionAlgorithm]
  }
}

