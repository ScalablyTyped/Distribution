package typings.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKdfAlgorithm extends js.Object {
  var kdfAlgorithm: js.UndefOr[String] = js.undefined
  var kekEncryptionLength: js.UndefOr[Double] = js.undefined
  var oaepHashAlgorithm: js.UndefOr[String] = js.undefined
}

object AnonKdfAlgorithm {
  @scala.inline
  def apply(
    kdfAlgorithm: String = null,
    kekEncryptionLength: Int | Double = null,
    oaepHashAlgorithm: String = null
  ): AnonKdfAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (kdfAlgorithm != null) __obj.updateDynamic("kdfAlgorithm")(kdfAlgorithm.asInstanceOf[js.Any])
    if (kekEncryptionLength != null) __obj.updateDynamic("kekEncryptionLength")(kekEncryptionLength.asInstanceOf[js.Any])
    if (oaepHashAlgorithm != null) __obj.updateDynamic("oaepHashAlgorithm")(oaepHashAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKdfAlgorithm]
  }
}

