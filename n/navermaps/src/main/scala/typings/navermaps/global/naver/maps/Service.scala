package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Service.GeocodeResponse
import typings.navermaps.naver.maps.Service.GeocodeServiceOptions
import typings.navermaps.naver.maps.Service.ReverseGeocodeResponse
import typings.navermaps.naver.maps.Service.ReverseServiceOptions
import typings.navermaps.naver.maps.Service.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Submodule - geocoder
  * See https://navermaps.github.io/maps.js.ncp/docs/tutorial-geocoder.html
  */
object Service {
  
  @JSGlobal("naver.maps.Service")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.Service.CoordinatesType")
  @js.native
  object CoordinatesType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.navermaps.naver.maps.Service.CoordinatesType & String] = js.native
    
    /* "epsg:3857" */ val EPSG3857: typings.navermaps.naver.maps.Service.CoordinatesType.EPSG3857 & String = js.native
    
    /* "epsg:4326" */ val LATLNG: typings.navermaps.naver.maps.Service.CoordinatesType.LATLNG & String = js.native
    
    /* "nhn:128" */ val TM128: typings.navermaps.naver.maps.Service.CoordinatesType.TM128 & String = js.native
    
    /* "nhn:2048" */ val UTMK: typings.navermaps.naver.maps.Service.CoordinatesType.UTMK & String = js.native
  }
  
  @JSGlobal("naver.maps.Service.GeocodeStatus")
  @js.native
  object GeocodeStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.navermaps.naver.maps.Service.GeocodeStatus & String] = js.native
    
    /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.navermaps.naver.maps.Service.GeocodeStatus.INVALID_REQUEST & String = js.native
    
    /* "OK" */ val OK: typings.navermaps.naver.maps.Service.GeocodeStatus.OK & String = js.native
    
    /* "SYSTEM_ERROR" */ val SYSTEM_ERROR: typings.navermaps.naver.maps.Service.GeocodeStatus.SYSTEM_ERROR & String = js.native
  }
  
  @JSGlobal("naver.maps.Service.OrderType")
  @js.native
  object OrderType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.navermaps.naver.maps.Service.OrderType & String] = js.native
    
    /* "addr" */ val ADDR: typings.navermaps.naver.maps.Service.OrderType.ADDR & String = js.native
    
    /* "admcode" */ val ADM_CODE: typings.navermaps.naver.maps.Service.OrderType.ADM_CODE & String = js.native
    
    /* "legalcode" */ val LEGAL_CODE: typings.navermaps.naver.maps.Service.OrderType.LEGAL_CODE & String = js.native
    
    /* "roadaddr" */ val ROAD_ADDR: typings.navermaps.naver.maps.Service.OrderType.ROAD_ADDR & String = js.native
  }
  
  @JSGlobal("naver.maps.Service.ReverseGeocodeStatusCode")
  @js.native
  object ReverseGeocodeStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.navermaps.naver.maps.Service.ReverseGeocodeStatusCode & String] = js.native
    
    /* "0" */ val CODE_0: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_0 & String = js.native
    
    /* "100" */ val CODE_100: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_100 & String = js.native
    
    /* "3" */ val CODE_3: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_3 & String = js.native
    
    /* "900" */ val CODE_900: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusCode.CODE_900 & String = js.native
  }
  
  @JSGlobal("naver.maps.Service.ReverseGeocodeStatusName")
  @js.native
  object ReverseGeocodeStatusName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.navermaps.naver.maps.Service.ReverseGeocodeStatusName & String] = js.native
    
    /* "invalid request" */ val INVALID_REQUEST: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusName.INVALID_REQUEST & String = js.native
    
    /* "no results" */ val NO_RESULTS: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusName.NO_RESULTS & String = js.native
    
    /* "ok" */ val OK: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusName.OK & String = js.native
    
    /* "unknown error / io error" */ val UNKNOWN_ERROR_IO_ERROR: typings.navermaps.naver.maps.Service.ReverseGeocodeStatusName.UNKNOWN_ERROR_IO_ERROR & String = js.native
  }
  
  @JSGlobal("naver.maps.Service.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.Status & Double] = js.native
    
    /* 500 */ val ERROR: typings.navermaps.naver.maps.Service.Status.ERROR & Double = js.native
    
    /* 200 */ val OK: typings.navermaps.naver.maps.Service.Status.OK & Double = js.native
  }
  
  inline def fromAddrToCoord(options: GeocodeServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddrToCoord")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fromAddrToCoord(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAddrToCoord")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromCoordToAddr(options: ReverseServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToAddr")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fromCoordToAddr(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToAddr")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def geocode(options: GeocodeServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def geocode(
    options: GeocodeServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ GeocodeResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reverseGeocode(options: ReverseServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reverseGeocode(
    options: ReverseServiceOptions,
    callback: js.Function2[/* status */ Status, /* response */ ReverseGeocodeResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
