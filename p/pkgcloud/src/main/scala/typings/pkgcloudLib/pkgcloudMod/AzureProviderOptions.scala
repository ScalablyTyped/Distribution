package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureProviderOptions extends js.Object {
  var location: js.UndefOr[java.lang.String] = js.undefined
  var provider: pkgcloudLib.pkgcloudLibStrings.azure
  var storageAccessKey: java.lang.String
  var storageAccount: java.lang.String
}

object AzureProviderOptions {
  @scala.inline
  def apply(
    provider: pkgcloudLib.pkgcloudLibStrings.azure,
    storageAccessKey: java.lang.String,
    storageAccount: java.lang.String,
    location: java.lang.String = null
  ): AzureProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("storageAccessKey")(storageAccessKey)
    __obj.updateDynamic("storageAccount")(storageAccount)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[AzureProviderOptions]
  }
}

