package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Ads ---
trait AdvertisementOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var domain: js.UndefOr[js.Any] = js.undefined
  var flags: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[js.Any] = js.undefined
  var interfaceIndex: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var networkInterface: js.UndefOr[java.lang.String] = js.undefined
  var txtRecord: js.UndefOr[js.Any] = js.undefined
}

object AdvertisementOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    domain: js.Any = null,
    flags: js.Any = null,
    host: js.Any = null,
    interfaceIndex: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    networkInterface: java.lang.String = null,
    txtRecord: js.Any = null
  ): AdvertisementOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (host != null) __obj.updateDynamic("host")(host)
    if (interfaceIndex != null) __obj.updateDynamic("interfaceIndex")(interfaceIndex.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface)
    if (txtRecord != null) __obj.updateDynamic("txtRecord")(txtRecord)
    __obj.asInstanceOf[AdvertisementOptions]
  }
}

