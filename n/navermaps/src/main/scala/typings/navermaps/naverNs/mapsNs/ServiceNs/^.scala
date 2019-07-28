package typings.navermaps.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Service")
@js.native
object ^ extends js.Object {
  def fromAddrToCoord(): Unit = js.native
  def fromCoordToAddr(): Unit = js.native
  def geocode(options: GeocodeServiceOptions): Unit = js.native
  def geocode(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, Unit]
  ): Unit = js.native
  def reverseGeocode(options: ReverseServiceOptions): Unit = js.native
  def reverseGeocode(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, Unit]
  ): Unit = js.native
}

