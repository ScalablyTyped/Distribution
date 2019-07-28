package typings.mdns.mdnsMod

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertisement extends EventEmitter {
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

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

