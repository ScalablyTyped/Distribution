package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.azure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureProviderOptions extends js.Object {
  var location: js.UndefOr[String] = js.native
  var provider: azure = js.native
  var storageAccessKey: String = js.native
  var storageAccount: String = js.native
}

object AzureProviderOptions {
  @scala.inline
  def apply(provider: azure, storageAccessKey: String, storageAccount: String): AzureProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], storageAccessKey = storageAccessKey.asInstanceOf[js.Any], storageAccount = storageAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureProviderOptions]
  }
  @scala.inline
  implicit class AzureProviderOptionsOps[Self <: AzureProviderOptions] (val x: Self) extends AnyVal {
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
    def setProvider(value: azure): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageAccessKey(value: String): Self = this.set("storageAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageAccount(value: String): Self = this.set("storageAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

