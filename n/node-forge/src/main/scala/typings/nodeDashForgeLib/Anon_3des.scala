package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3des extends js.Object {
  var algorithm: js.UndefOr[
    nodeDashForgeLib.nodeDashForgeLibStrings.aes128 | nodeDashForgeLib.nodeDashForgeLibStrings.aes192 | nodeDashForgeLib.nodeDashForgeLibStrings.aes256 | nodeDashForgeLib.nodeDashForgeLibStrings.`3des`
  ] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var generateLocalKeyId: js.UndefOr[scala.Boolean] = js.undefined
  var localKeyId: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.Hex] = js.undefined
  var saltSize: js.UndefOr[scala.Double] = js.undefined
  var useMac: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_3des {
  @scala.inline
  def apply(
    algorithm: nodeDashForgeLib.nodeDashForgeLibStrings.aes128 | nodeDashForgeLib.nodeDashForgeLibStrings.aes192 | nodeDashForgeLib.nodeDashForgeLibStrings.aes256 | nodeDashForgeLib.nodeDashForgeLibStrings.`3des` = null,
    count: scala.Int | scala.Double = null,
    friendlyName: java.lang.String = null,
    generateLocalKeyId: js.UndefOr[scala.Boolean] = js.undefined,
    localKeyId: nodeDashForgeLib.nodeDashForgeMod.Hex = null,
    saltSize: scala.Int | scala.Double = null,
    useMac: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_3des = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (!js.isUndefined(generateLocalKeyId)) __obj.updateDynamic("generateLocalKeyId")(generateLocalKeyId)
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId)
    if (saltSize != null) __obj.updateDynamic("saltSize")(saltSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useMac)) __obj.updateDynamic("useMac")(useMac)
    __obj.asInstanceOf[Anon_3des]
  }
}

