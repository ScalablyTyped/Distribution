package typings.pkgcloud.pkgcloudMod

import typings.pkgcloud.pkgcloudStrings.amazon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmazonProviderOptions extends js.Object {
  var key: String
  var keyId: String
  var provider: amazon
  var region: js.UndefOr[String] = js.undefined
}

object AmazonProviderOptions {
  @scala.inline
  def apply(key: String, keyId: String, provider: amazon, region: String = null): AmazonProviderOptions = {
    val __obj = js.Dynamic.literal(key = key, keyId = keyId, provider = provider)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[AmazonProviderOptions]
  }
}

