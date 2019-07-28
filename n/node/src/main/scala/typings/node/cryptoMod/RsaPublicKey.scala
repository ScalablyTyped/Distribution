package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPublicKey extends js.Object {
  var key: KeyLike
  var padding: js.UndefOr[Double] = js.undefined
}

object RsaPublicKey {
  @scala.inline
  def apply(key: KeyLike, padding: Int | Double = null): RsaPublicKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
}

