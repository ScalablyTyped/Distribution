package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Service")
@js.native
object ^ extends js.Object {
  def fromAddrToCoord(): scala.Unit = js.native
  def fromCoordToAddr(): scala.Unit = js.native
  def geocode(options: navermapsLib.naverNs.mapsNs.ServiceNs.GeocodeServiceOptions): scala.Unit = js.native
  def geocode(
    options: navermapsLib.naverNs.mapsNs.ServiceNs.GeocodeServiceOptions,
    callback: js.Function2[
      /* status */ navermapsLib.naverNs.mapsNs.ServiceNs.Status, 
      /* response */ navermapsLib.naverNs.mapsNs.ServiceNs.GeocodeResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def reverseGeocode(options: navermapsLib.naverNs.mapsNs.ServiceNs.ReverseServiceOptions): scala.Unit = js.native
  def reverseGeocode(
    options: navermapsLib.naverNs.mapsNs.ServiceNs.ReverseServiceOptions,
    callback: js.Function2[
      /* status */ navermapsLib.naverNs.mapsNs.ServiceNs.Status, 
      /* response */ navermapsLib.naverNs.mapsNs.ServiceNs.ReverseGeocodeResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

