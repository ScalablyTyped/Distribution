package typings
package mdnsLib.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "Advertisement")
@js.native
class AdvertisementCls protected ()
  extends mdnsLib.mdnsMod.MDNSNs.Advertisement {
  def this(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType, port: scala.Double) = this()
  def this(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType, port: scala.Double, options: mdnsLib.mdnsMod.MDNSNs.AdvertisementOptions) = this()
  def this(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType, port: scala.Double, options: mdnsLib.mdnsMod.MDNSNs.AdvertisementOptions, callback: js.Function2[
      /* error */ mdnsLib.mdnsMod.MDNSNs.DnsSdError, 
      /* service */ mdnsLib.mdnsMod.MDNSNs.Service, 
      scala.Unit
    ]) = this()
}

