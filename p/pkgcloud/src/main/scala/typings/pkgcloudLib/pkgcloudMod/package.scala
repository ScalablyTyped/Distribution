package typings
package pkgcloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pkgcloudMod {
  type ProviderOptions = BaseProviderOptions with (stdLib.Partial[
    AmazonProviderOptions | AzureProviderOptions | GoogleProviderOptions | OpenstackProviderOptions
  ])
}
