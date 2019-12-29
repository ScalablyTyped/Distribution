package typings.node.cryptoMod

import typings.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPrivateKey extends js.Object {
  var key: KeyLike
  /**
    * @default 'sha1'
    */
  var oaepHash: js.UndefOr[String] = js.undefined
  var oaepLabel: js.UndefOr[TypedArray] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
}

object RsaPrivateKey {
  @scala.inline
  def apply(
    key: KeyLike,
    oaepHash: String = null,
    oaepLabel: TypedArray = null,
    padding: Int | Double = null,
    passphrase: String = null
  ): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (oaepHash != null) __obj.updateDynamic("oaepHash")(oaepHash.asInstanceOf[js.Any])
    if (oaepLabel != null) __obj.updateDynamic("oaepLabel")(oaepLabel.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPrivateKey]
  }
}

