package typings
package pkgcloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pkgcloudMod {
  type ProviderOptions = BaseProviderOptions with (stdLib.Partial[AmazonProviderOptions | AzureProviderOptions])
  type Providers = pkgcloudLib.pkgcloudLibStrings.amazon | pkgcloudLib.pkgcloudLibStrings.azure | pkgcloudLib.pkgcloudLibStrings.digitalocean | pkgcloudLib.pkgcloudLibStrings.google | pkgcloudLib.pkgcloudLibStrings.hp | pkgcloudLib.pkgcloudLibStrings.iriscouch | pkgcloudLib.pkgcloudLibStrings.joyent | pkgcloudLib.pkgcloudLibStrings.mongohq | pkgcloudLib.pkgcloudLibStrings.mongolab | pkgcloudLib.pkgcloudLibStrings.oneandone | pkgcloudLib.pkgcloudLibStrings.openstack | pkgcloudLib.pkgcloudLibStrings.rackspace | pkgcloudLib.pkgcloudLibStrings.redistogo | pkgcloudLib.pkgcloudLibStrings.telefonic
}
