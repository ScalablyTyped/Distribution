package typings.navermaps

import typings.navermaps.naver.maps.Animation
import typings.navermaps.naver.maps.ArrayOfCoords
import typings.navermaps.naver.maps.ArrayOfCoordsLiteral
import typings.navermaps.naver.maps.Bounds
import typings.navermaps.naver.maps.BoundsLiteral
import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.CoordLiteral
import typings.navermaps.naver.maps.HtmlIcon
import typings.navermaps.naver.maps.ImageIcon
import typings.navermaps.naver.maps.KVOArray
import typings.navermaps.naver.maps.KVOArrayOfCoords
import typings.navermaps.naver.maps.LatLng
import typings.navermaps.naver.maps.LatLngLiteral
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.MarkerShape
import typings.navermaps.naver.maps.Point
import typings.navermaps.naver.maps.PointLiteral
import typings.navermaps.naver.maps.PointingIcon
import typings.navermaps.naver.maps.Service.AddressItem
import typings.navermaps.naver.maps.Service.AddressItemV2
import typings.navermaps.naver.maps.Service.GeocodeStatus
import typings.navermaps.naver.maps.Service.Meta
import typings.navermaps.naver.maps.Service.ResultItem
import typings.navermaps.naver.maps.Service.ReverseGeocodeAddress
import typings.navermaps.naver.maps.Service.ReverseGeocodeStatus
import typings.navermaps.naver.maps.StrokeLineCapType
import typings.navermaps.naver.maps.StrokeLineJoinType
import typings.navermaps.naver.maps.StrokeStyleType
import typings.navermaps.naver.maps.SymbolIcon
import typings.navermaps.navermapsStrings.A
import typings.navermaps.navermapsStrings.BUILDING_NAME
import typings.navermaps.navermapsStrings.BUILDING_NUMBER
import typings.navermaps.navermapsStrings.L
import typings.navermaps.navermapsStrings.LAND_NUMBER
import typings.navermaps.navermapsStrings.POSTAL_CODE
import typings.navermaps.navermapsStrings.RI
import typings.navermaps.navermapsStrings.ROAD_NAME
import typings.navermaps.navermapsStrings.S
import typings.navermaps.navermapsStrings.SIDO
import typings.navermaps.navermapsStrings.SIGUGUN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: ReverseGeocodeAddress
    
    var results: js.Array[ResultItem]
    
    var status: ReverseGeocodeStatus
  }
  object Address {
    
    inline def apply(address: ReverseGeocodeAddress, results: js.Array[ResultItem], status: ReverseGeocodeStatus): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: ReverseGeocodeAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[ResultItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: ResultItem*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStatus(value: ReverseGeocodeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Addresses extends StObject {
    
    var addresses: js.Array[AddressItemV2]
    
    var errorMessage: String
    
    var meta: Meta
    
    var status: GeocodeStatus
  }
  object Addresses {
    
    inline def apply(addresses: js.Array[AddressItemV2], errorMessage: String, meta: Meta, status: GeocodeStatus): Addresses = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addresses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Addresses] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[AddressItemV2]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: AddressItemV2*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: GeocodeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var longName: String
    
    var shortName: String
    
    var types: SIDO | SIGUGUN | RI | ROAD_NAME | BUILDING_NUMBER | BUILDING_NAME | LAND_NUMBER | POSTAL_CODE
  }
  object Code {
    
    inline def apply(
      code: String,
      longName: String,
      shortName: String,
      types: SIDO | SIGUGUN | RI | ROAD_NAME | BUILDING_NUMBER | BUILDING_NAME | LAND_NUMBER | POSTAL_CODE
    ): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], longName = longName.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setTypes(
        value: SIDO | SIGUGUN | RI | ROAD_NAME | BUILDING_NUMBER | BUILDING_NAME | LAND_NUMBER | POSTAL_CODE
      ): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait Country extends StObject {
    
    var country: String
    
    var dongmyun: String
    
    var rest: String
    
    var sido: String
    
    var sigugun: String
  }
  object Country {
    
    inline def apply(country: String, dongmyun: String, rest: String, sido: String, sigugun: String): Country = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], dongmyun = dongmyun.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigugun = sigugun.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDongmyun(value: String): Self = StObject.set(x, "dongmyun", value.asInstanceOf[js.Any])
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      inline def setSigugun(value: String): Self = StObject.set(x, "sigugun", value.asInstanceOf[js.Any])
    }
  }
  
  trait Crs extends StObject {
    
    var crs: String
    
    var x: String
    
    var y: String
  }
  object Crs {
    
    inline def apply(crs: String, x: String, y: String): Crs = {
      val __obj = js.Dynamic.literal(crs = crs.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Crs] (val x: Self) extends AnyVal {
      
      inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var mappingId: String
    
    var `type`: L | A | S | String
  }
  object Id {
    
    inline def apply(id: String, mappingId: String, `type`: L | A | S | String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mappingId = mappingId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMappingId(value: String): Self = StObject.set(x, "mappingId", value.asInstanceOf[js.Any])
      
      inline def setType(value: L | A | S | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[AddressItem]
    
    var total: Double
    
    var userquery: Any
  }
  object Items {
    
    inline def apply(items: js.Array[AddressItem], total: Double, userquery: Any): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUserquery(value: Any): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<navermaps.naver.maps.EllipseOptions> */
  trait PartialEllipseOptions extends StObject {
    
    var bounds: js.UndefOr[Bounds | BoundsLiteral] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
    
    var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeStyle: js.UndefOr[StrokeStyleType] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialEllipseOptions {
    
    inline def apply(): PartialEllipseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEllipseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialEllipseOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: Bounds | BoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeLineCap(value: StrokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeLineJoin(value: StrokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeStyle(value: StrokeStyleType): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<navermaps.naver.maps.MarkerOptions> */
  trait PartialMarkerOptions extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String | ImageIcon | SymbolIcon | HtmlIcon] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var position: js.UndefOr[Coord | CoordLiteral] = js.undefined
    
    var shape: js.UndefOr[MarkerShape] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialMarkerOptions {
    
    inline def apply(): PartialMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMarkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMarkerOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setIcon(value: String | ImageIcon | SymbolIcon | HtmlIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPosition(value: Coord | CoordLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<navermaps.naver.maps.PolygonOptions> */
  trait PartialPolygonOptions extends StObject {
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var paths: js.UndefOr[(js.Array[ArrayOfCoords | ArrayOfCoordsLiteral]) | KVOArray[KVOArrayOfCoords]] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
    
    var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeStyle: js.UndefOr[StrokeStyleType] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialPolygonOptions {
    
    inline def apply(): PartialPolygonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPolygonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPolygonOptions] (val x: Self) extends AnyVal {
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPaths(value: (js.Array[ArrayOfCoords | ArrayOfCoordsLiteral]) | KVOArray[KVOArrayOfCoords]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: (ArrayOfCoords | ArrayOfCoordsLiteral)*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeLineCap(value: StrokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeLineJoin(value: StrokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeStyle(value: StrokeStyleType): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<navermaps.naver.maps.PolylineOptions> */
  trait PartialPolylineOptions extends StObject {
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var endIcon: js.UndefOr[PointingIcon] = js.undefined
    
    var endIconSize: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var path: js.UndefOr[ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral] = js.undefined
    
    var startIcon: js.UndefOr[PointingIcon] = js.undefined
    
    var startIconSize: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
    
    var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeStyle: js.UndefOr[StrokeStyleType] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialPolylineOptions {
    
    inline def apply(): PartialPolylineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPolylineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPolylineOptions] (val x: Self) extends AnyVal {
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setEndIcon(value: PointingIcon): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
      
      inline def setEndIconSize(value: Double): Self = StObject.set(x, "endIconSize", value.asInstanceOf[js.Any])
      
      inline def setEndIconSizeUndefined: Self = StObject.set(x, "endIconSize", js.undefined)
      
      inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPath(value: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (LatLng | LatLngLiteral | Point | PointLiteral)*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setStartIcon(value: PointingIcon): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
      
      inline def setStartIconSize(value: Double): Self = StObject.set(x, "startIconSize", value.asInstanceOf[js.Any])
      
      inline def setStartIconSizeUndefined: Self = StObject.set(x, "startIconSize", js.undefined)
      
      inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeLineCap(value: StrokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeLineJoin(value: StrokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeStyle(value: StrokeStyleType): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<navermaps.naver.maps.RectangleOptions> */
  trait PartialRectangleOptions extends StObject {
    
    var bounds: js.UndefOr[Bounds | BoundsLiteral] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
    
    var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    var strokeStyle: js.UndefOr[StrokeStyleType] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialRectangleOptions {
    
    inline def apply(): PartialRectangleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRectangleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRectangleOptions] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: Bounds | BoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeLineCap(value: StrokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeLineJoin(value: StrokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeStyle(value: StrokeStyleType): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Total extends StObject {
    
    var items: js.Array[AddressItem]
    
    var total: Double
    
    var userquery: String
  }
  object Total {
    
    inline def apply(items: js.Array[AddressItem], total: Double, userquery: String): Total = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Total]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Total] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUserquery(value: String): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
}
