package typings.mdns.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Ads ---
trait AdvertisementOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var domain: js.UndefOr[js.Any] = js.undefined
  var flags: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[js.Any] = js.undefined
  var interfaceIndex: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var networkInterface: js.UndefOr[String] = js.undefined
  var txtRecord: js.UndefOr[js.Any] = js.undefined
}

object AdvertisementOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    domain: js.Any = null,
    flags: js.Any = null,
    host: js.Any = null,
    interfaceIndex: Int | Double = null,
    name: String = null,
    networkInterface: String = null,
    txtRecord: js.Any = null
  ): AdvertisementOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (interfaceIndex != null) __obj.updateDynamic("interfaceIndex")(interfaceIndex.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface.asInstanceOf[js.Any])
    if (txtRecord != null) __obj.updateDynamic("txtRecord")(txtRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertisementOptions]
  }
}

