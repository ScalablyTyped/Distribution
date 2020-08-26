package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.amazon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmazonProviderOptions extends js.Object {
  var key: String = js.native
  var keyId: String = js.native
  var provider: amazon = js.native
  var region: js.UndefOr[String] = js.native
}

object AmazonProviderOptions {
  @scala.inline
  def apply(key: String, keyId: String, provider: amazon): AmazonProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonProviderOptions]
  }
  @scala.inline
  implicit class AmazonProviderOptionsOps[Self <: AmazonProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: amazon): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

