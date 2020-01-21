package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.`3des`
import typings.nodeForge.nodeForgeStrings.aes128
import typings.nodeForge.nodeForgeStrings.aes192
import typings.nodeForge.nodeForgeStrings.aes256
import typings.nodeForge.nodeForgeStrings.sha1
import typings.nodeForge.nodeForgeStrings.sha224
import typings.nodeForge.nodeForgeStrings.sha256
import typings.nodeForge.nodeForgeStrings.sha384
import typings.nodeForge.nodeForgeStrings.sha512
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

