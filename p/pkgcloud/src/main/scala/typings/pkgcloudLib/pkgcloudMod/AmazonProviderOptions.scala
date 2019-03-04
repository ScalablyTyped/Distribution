package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmazonProviderOptions extends js.Object {
  var key: java.lang.String
  var keyId: java.lang.String
  var provider: pkgcloudLib.pkgcloudLibStrings.amazon
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object AmazonProviderOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    keyId: java.lang.String,
    provider: pkgcloudLib.pkgcloudLibStrings.amazon,
    region: java.lang.String = null
  ): AmazonProviderOptions = {
    val __obj = js.Dynamic.literal(key = key, keyId = keyId, provider = provider)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[AmazonProviderOptions]
  }
}

