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
    if (bagType != null) __obj.updateDynamic("bagType")(bagType)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId)
    if (localKeyIdHex != null) __obj.updateDynamic("localKeyIdHex")(localKeyIdHex)
    __obj.asInstanceOf[BagsFilter]
  }
}

