package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Service.GeocodeResponse
import typings.navermaps.naver.maps.Service.GeocodeServiceOptions
import typings.navermaps.naver.maps.Service.ReverseGeocodeResponse
import typings.navermaps.naver.maps.Service.ReverseServiceOptions
import typings.navermaps.naver.maps.Service.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Service")
@js.native
object Service extends js.Object {
  // Sub module: geocoder
  def apply(): Unit = js.native
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
  @js.native
  object CoordType extends js.Object {
    /* 0 */ val LATLNG: typings.navermaps.naver.maps.Service.CoordType.LATLNG with Double = js.native
    /* 1 */ val TM128: typings.navermaps.naver.maps.Service.CoordType.TM128 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.CoordType with Double] = js.native
  }
  
  @js.native
  object Encoding extends js.Object {
    /* 1 */ val EUC_KR: typings.navermaps.naver.maps.Service.Encoding.EUC_KR with Double = js.native
    /* 0 */ val UTF_8: typings.navermaps.naver.maps.Service.Encoding.UTF_8 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.Encoding with Double] = js.native
  }
  
  @js.native
  object Status extends js.Object {
    /* 1 */ val ERROR: typings.navermaps.naver.maps.Service.Status.ERROR with Double = js.native
    /* 0 */ val OK: typings.navermaps.naver.maps.Service.Status.OK with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.Status with Double] = js.native
  }
  
}

