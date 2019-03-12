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
  def geocode(options: GeocodeServiceOptions): scala.Unit = js.native
  def geocode(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, scala.Unit]
  ): scala.Unit = js.native
  def reverseGeocode(options: ReverseServiceOptions): scala.Unit = js.native
  def reverseGeocode(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, scala.Unit]
  ): scala.Unit = js.native
}

