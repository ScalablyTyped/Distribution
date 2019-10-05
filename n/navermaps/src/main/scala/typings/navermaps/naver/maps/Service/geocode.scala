package typings.navermaps.naver.maps.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Service.geocode")
@js.native
object geocode extends js.Object {
  def apply(options: GeocodeServiceOptions): Unit = js.native
  def apply(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, Unit]
  ): Unit = js.native
}

