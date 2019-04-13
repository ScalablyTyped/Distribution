package typings
package mdnsLib.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertisement
  extends nodeLib.NodeJSNs.EventEmitter {
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

@JSImport("mdns", "Advertisement")
@js.native
class AdvertisementCls protected () extends Advertisement {
  def this(serviceType: ServiceType, port: scala.Double) = this()
  def this(serviceType: ServiceType, port: scala.Double, options: AdvertisementOptions) = this()
  def this(serviceType: ServiceType, port: scala.Double, options: AdvertisementOptions, callback: js.Function2[/* error */ DnsSdError, /* service */ Service, scala.Unit]) = this()
}

