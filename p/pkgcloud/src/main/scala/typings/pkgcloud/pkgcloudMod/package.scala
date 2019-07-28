package typings.pkgcloud

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pkgcloudMod {
  type ProviderOptions = BaseProviderOptions with (Partial[
    AmazonProviderOptions | AzureProviderOptions | GoogleProviderOptions | OpenstackProviderOptions
  ])
}
