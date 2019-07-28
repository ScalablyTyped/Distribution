package typings.pkgcloud.pkgcloudMod

import typings.pkgcloud.pkgcloudStrings.azure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureProviderOptions extends js.Object {
  var location: js.UndefOr[String] = js.undefined
  var provider: azure
  var storageAccessKey: String
  var storageAccount: String
}

object AzureProviderOptions {
  @scala.inline
  def apply(provider: azure, storageAccessKey: String, storageAccount: String, location: String = null): AzureProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider, storageAccessKey = storageAccessKey, storageAccount = storageAccount)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[AzureProviderOptions]
  }
}

