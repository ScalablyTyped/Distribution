package typings.mdns.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "Advertisement")
@js.native
class AdvertisementCls protected () extends Advertisement {
  def this(serviceType: ServiceType, port: Double) = this()
  def this(serviceType: ServiceType, port: Double, options: AdvertisementOptions) = this()
  def this(
    serviceType: ServiceType,
    port: Double,
    options: AdvertisementOptions,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ) = this()
}

