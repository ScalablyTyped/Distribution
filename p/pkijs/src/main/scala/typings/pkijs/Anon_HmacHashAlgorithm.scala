package typings.pkijs

import typings.std.Algorithm
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HmacHashAlgorithm extends js.Object {
  var hmacHashAlgorithm: js.UndefOr[String] = js.undefined
  var iterationCount: js.UndefOr[Double] = js.undefined
  var keyEncryptionAlgorithm: js.UndefOr[Algorithm] = js.undefined
  var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.undefined
  var keyIdentifier: js.UndefOr[ArrayBuffer] = js.undefined
}

object Anon_HmacHashAlgorithm {
  @scala.inline
  def apply(
    hmacHashAlgorithm: String = null,
    iterationCount: Int | Double = null,
    keyEncryptionAlgorithm: Algorithm = null,
    keyEncryptionAlgorithmParams: js.Any = null,
    keyIdentifier: ArrayBuffer = null
  ): Anon_HmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (hmacHashAlgorithm != null) __obj.updateDynamic("hmacHashAlgorithm")(hmacHashAlgorithm.asInstanceOf[js.Any])
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithm != null) __obj.updateDynamic("keyEncryptionAlgorithm")(keyEncryptionAlgorithm.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithmParams != null) __obj.updateDynamic("keyEncryptionAlgorithmParams")(keyEncryptionAlgorithmParams.asInstanceOf[js.Any])
    if (keyIdentifier != null) __obj.updateDynamic("keyIdentifier")(keyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HmacHashAlgorithm]
  }
}

