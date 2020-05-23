package typings.pkijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KdfAlgorithm extends js.Object {
  var kdfAlgorithm: js.UndefOr[String] = js.undefined
  var kekEncryptionLength: js.UndefOr[Double] = js.undefined
  var oaepHashAlgorithm: js.UndefOr[String] = js.undefined
}

object KdfAlgorithm {
  @scala.inline
  def apply(
    kdfAlgorithm: String = null,
    kekEncryptionLength: js.UndefOr[Double] = js.undefined,
    oaepHashAlgorithm: String = null
  ): KdfAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (kdfAlgorithm != null) __obj.updateDynamic("kdfAlgorithm")(kdfAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(kekEncryptionLength)) __obj.updateDynamic("kekEncryptionLength")(kekEncryptionLength.get.asInstanceOf[js.Any])
    if (oaepHashAlgorithm != null) __obj.updateDynamic("oaepHashAlgorithm")(oaepHashAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KdfAlgorithm]
  }
}

