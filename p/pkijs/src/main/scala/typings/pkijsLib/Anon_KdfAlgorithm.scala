package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KdfAlgorithm extends js.Object {
  var kdfAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var kekEncryptionLength: js.UndefOr[scala.Double] = js.undefined
  var oaepHashAlgorithm: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KdfAlgorithm {
  @scala.inline
  def apply(
    kdfAlgorithm: java.lang.String = null,
    kekEncryptionLength: scala.Int | scala.Double = null,
    oaepHashAlgorithm: java.lang.String = null
  ): Anon_KdfAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (kdfAlgorithm != null) __obj.updateDynamic("kdfAlgorithm")(kdfAlgorithm)
    if (kekEncryptionLength != null) __obj.updateDynamic("kekEncryptionLength")(kekEncryptionLength.asInstanceOf[js.Any])
    if (oaepHashAlgorithm != null) __obj.updateDynamic("oaepHashAlgorithm")(oaepHashAlgorithm)
    __obj.asInstanceOf[Anon_KdfAlgorithm]
  }
}

