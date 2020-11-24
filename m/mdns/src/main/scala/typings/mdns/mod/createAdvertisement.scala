package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdns", "createAdvertisement")
@js.native
object createAdvertisement extends js.Object {
  
  def apply(serviceType: ServiceType, port: Double): Advertisement = js.native
  def apply(
    serviceType: ServiceType,
    port: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Advertisement = js.native
  def apply(serviceType: ServiceType, port: Double, options: AdvertisementOptions): Advertisement = js.native
  def apply(
    serviceType: ServiceType,
    port: Double,
    options: AdvertisementOptions,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Advertisement = js.native
}
