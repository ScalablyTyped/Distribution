package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdns", "Advertisement")
@js.native
class AdvertisementCls protected () extends Advertisement {
  def this(serviceType: ServiceType, port: Double) = this()
  def this(serviceType: ServiceType, port: Double, options: AdvertisementOptions) = this()
  def this(
    serviceType: ServiceType,
    port: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ) = this()
  def this(
    serviceType: ServiceType,
    port: Double,
    options: AdvertisementOptions,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ) = this()
}
