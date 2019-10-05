package typings.navermaps.naver.maps.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Service.reverseGeocode")
@js.native
object reverseGeocode extends js.Object {
  def apply(options: ReverseServiceOptions): Unit = js.native
  def apply(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, Unit]
  ): Unit = js.native
}

