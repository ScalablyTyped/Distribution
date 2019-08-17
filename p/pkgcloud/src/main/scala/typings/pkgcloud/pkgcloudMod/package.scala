package typings.pkgcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pkgcloudMod {
  import typings.std.Partial

  type ProviderOptions = BaseProviderOptions with (Partial[
    AmazonProviderOptions | AzureProviderOptions | GoogleProviderOptions | OpenstackProviderOptions
  ])
}
