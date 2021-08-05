package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.Service.GeocodeResponse
import typings.navermaps.naver.maps.Service.GeocodeServiceOptions
import typings.navermaps.naver.maps.Service.ReverseGeocodeResponse
import typings.navermaps.naver.maps.Service.ReverseServiceOptions
import typings.navermaps.naver.maps.Service.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Service {
  
  // Sub module: geocoder
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.Service")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.Service.CoordType")
  @js.native
  object CoordType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.CoordType & Double] = js.native
    
    /* 0 */ val LATLNG: typings.navermaps.naver.maps.Service.CoordType.LATLNG & Double = js.native
    
    /* 1 */ val TM128: typings.navermaps.naver.maps.Service.CoordType.TM128 & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.Encoding & Double] = js.native
    
    /* 1 */ val EUC_KR: typings.navermaps.naver.maps.Service.Encoding.EUC_KR & Double = js.native
    
    /* 0 */ val UTF_8: typings.navermaps.naver.maps.Service.Encoding.UTF_8 & Double = js.native
  }
  
  @JSGlobal("naver.maps.Service.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.navermaps.naver.maps.Service.Status & Double] = js.native
    
    /* 1 */ val ERROR: typings.navermaps.naver.maps.Service.Status.ERROR & Double = js.native
    
    /* 0 */ val OK: typings.navermaps.naver.maps.Service.Status.OK & Double = js.native
  }
  
  inline def fromAddrToCoord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddrToCoord")().asInstanceOf[Unit]
  
  inline def fromCoordToAddr(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToAddr")().asInstanceOf[Unit]
  
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
