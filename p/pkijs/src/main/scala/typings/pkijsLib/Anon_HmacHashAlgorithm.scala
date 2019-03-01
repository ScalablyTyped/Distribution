package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HmacHashAlgorithm extends js.Object {
  var hmacHashAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var iterationCount: js.UndefOr[scala.Double] = js.undefined
  var keyEncryptionAlgorithm: js.UndefOr[stdLib.Algorithm] = js.undefined
  var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.undefined
  var keyIdentifier: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
}

object Anon_HmacHashAlgorithm {
  @scala.inline
  def apply(
    hmacHashAlgorithm: java.lang.String = null,
    iterationCount: scala.Int | scala.Double = null,
    keyEncryptionAlgorithm: stdLib.Algorithm = null,
    keyEncryptionAlgorithmParams: js.Any = null,
    keyIdentifier: stdLib.ArrayBuffer = null
  ): Anon_HmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (hmacHashAlgorithm != null) __obj.updateDynamic("hmacHashAlgorithm")(hmacHashAlgorithm)
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (keyEncryptionAlgorithm != null) __obj.updateDynamic("keyEncryptionAlgorithm")(keyEncryptionAlgorithm)
    if (keyEncryptionAlgorithmParams != null) __obj.updateDynamic("keyEncryptionAlgorithmParams")(keyEncryptionAlgorithmParams)
    if (keyIdentifier != null) __obj.updateDynamic("keyIdentifier")(keyIdentifier)
    __obj.asInstanceOf[Anon_HmacHashAlgorithm]
  }
}

