package typings.nodeForge.anon

import typings.nodeForge.mod.Hex
import typings.nodeForge.nodeForgeStrings.`3des`
import typings.nodeForge.nodeForgeStrings.aes128
import typings.nodeForge.nodeForgeStrings.aes192
import typings.nodeForge.nodeForgeStrings.aes256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var generateLocalKeyId: js.UndefOr[Boolean] = js.undefined
  var localKeyId: js.UndefOr[Hex] = js.undefined
  var saltSize: js.UndefOr[Double] = js.undefined
  var useMac: js.UndefOr[Boolean] = js.undefined
}

object Algorithm {
  @scala.inline
  def apply(
    algorithm: aes128 | aes192 | aes256 | `3des` = null,
    count: js.UndefOr[Double] = js.undefined,
    friendlyName: String = null,
    generateLocalKeyId: js.UndefOr[Boolean] = js.undefined,
    localKeyId: Hex = null,
    saltSize: js.UndefOr[Double] = js.undefined,
    useMac: js.UndefOr[Boolean] = js.undefined
  ): Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (!js.isUndefined(generateLocalKeyId)) __obj.updateDynamic("generateLocalKeyId")(generateLocalKeyId.get.asInstanceOf[js.Any])
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(saltSize)) __obj.updateDynamic("saltSize")(saltSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMac)) __obj.updateDynamic("useMac")(useMac.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

