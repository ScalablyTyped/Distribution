package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.nodeDashForge.nodeDashForgeStrings.`3des`
import typings.nodeDashForge.nodeDashForgeStrings.aes128
import typings.nodeDashForge.nodeDashForgeStrings.aes192
import typings.nodeDashForge.nodeDashForgeStrings.aes256
import typings.nodeDashForge.nodeDashForgeStrings.sha1
import typings.nodeDashForge.nodeDashForgeStrings.sha224
import typings.nodeDashForge.nodeDashForgeStrings.sha256
import typings.nodeDashForge.nodeDashForgeStrings.sha384
import typings.nodeDashForge.nodeDashForgeStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionOptions extends js.Object {
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var legacy: js.UndefOr[Boolean] = js.undefined
  var prfAlgorithm: js.UndefOr[sha1 | sha224 | sha256 | sha384 | sha512] = js.undefined
  var saltSize: js.UndefOr[Double] = js.undefined
}

object EncryptionOptions {
  @scala.inline
  def apply(
    algorithm: aes128 | aes192 | aes256 | `3des` = null,
    count: Int | Double = null,
    legacy: js.UndefOr[Boolean] = js.undefined,
    prfAlgorithm: sha1 | sha224 | sha256 | sha384 | sha512 = null,
    saltSize: Int | Double = null
  ): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(legacy)) __obj.updateDynamic("legacy")(legacy.asInstanceOf[js.Any])
    if (prfAlgorithm != null) __obj.updateDynamic("prfAlgorithm")(prfAlgorithm.asInstanceOf[js.Any])
    if (saltSize != null) __obj.updateDynamic("saltSize")(saltSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionOptions]
  }
}

