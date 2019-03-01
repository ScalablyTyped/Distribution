package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPublicKey extends js.Object {
  var key: KeyLike
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object RsaPublicKey {
  @scala.inline
  def apply(key: KeyLike, padding: scala.Int | scala.Double = null): RsaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
}

