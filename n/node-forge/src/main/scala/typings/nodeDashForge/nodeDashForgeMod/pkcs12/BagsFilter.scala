package typings.nodeDashForge.nodeDashForgeMod.pkcs12

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BagsFilter extends js.Object {
  var bagType: js.UndefOr[String] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var localKeyId: js.UndefOr[String] = js.undefined
  var localKeyIdHex: js.UndefOr[String] = js.undefined
}

object BagsFilter {
  @scala.inline
  def apply(
    bagType: String = null,
    friendlyName: String = null,
    localKeyId: String = null,
    localKeyIdHex: String = null
  ): BagsFilter = {
    val __obj = js.Dynamic.literal()
    if (bagType != null) __obj.updateDynamic("bagType")(bagType.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId.asInstanceOf[js.Any])
    if (localKeyIdHex != null) __obj.updateDynamic("localKeyIdHex")(localKeyIdHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BagsFilter]
  }
}

