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
  def apply(key: KeyLike, padding: js.UndefOr[Double] = js.undefined): RsaPublicKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
}

