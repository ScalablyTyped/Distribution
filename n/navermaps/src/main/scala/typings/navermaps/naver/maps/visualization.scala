package typings.navermaps.naver.maps

import typings.navermaps.naver.maps.drawing.DrawingEvent
import typings.navermaps.naver.maps.drawing.DrawingMode
import typings.navermaps.naver.maps.drawing.DrawingOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @js.native
  sealed trait SpectrumStyle extends StObject
  @JSGlobal("naver.maps.visualization.SpectrumStyle")
  @js.native
  object SpectrumStyle extends StObject {
    
    @js.native
    sealed trait COOL extends SpectrumStyle
    
    @js.native
    sealed trait GREYS extends SpectrumStyle
    
    @js.native
    sealed trait HOT extends SpectrumStyle
    
    @js.native
    sealed trait HSV extends SpectrumStyle
    
    @js.native
    sealed trait JET extends SpectrumStyle
    
    @js.native
    sealed trait OXYGEN extends SpectrumStyle
    
    @js.native
    sealed trait PORTLAND extends SpectrumStyle
    
    @js.native
    sealed trait RAINBOW extends SpectrumStyle
    
    @js.native
    sealed trait RdBu extends SpectrumStyle
    
    @js.native
    sealed trait YIGnBu extends SpectrumStyle
    
    @js.native
    sealed trait YIOrRd extends SpectrumStyle
  }
  
  @js.native
  trait DotMap extends KVO {
    
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
    
    def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
    
    def destroy(): Unit = js.native
    
    def getDrawing(id: String): DrawingOverlay = js.native
    
    def getDrawings(): js.Any = js.native
    
    def getMap(): Map | Null = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def toGeoJson(): js.Any = js.native
  }
  
  @js.native
  trait DotMapOptions extends StObject {
    
    var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation] = js.native
    
    var fillColor: js.UndefOr[String] = js.native
    
    var map: Map = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String] = js.native
    
    var strokeLineCap: js.UndefOr[strokeLineCapType] = js.native
    
    var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.native
    
    var strokeWeight: js.UndefOr[Double] = js.native
  }
  object DotMapOptions {
    
    @scala.inline
    def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): DotMapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotMapOptions]
    }
    
    @scala.inline
    implicit class DotMapOptionsMutableBuilder[Self <: DotMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeLineCap(value: strokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      @scala.inline
      def setStrokeLineJoin(value: strokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      @scala.inline
      def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    }
  }
  
  @js.native
  trait HeatMap extends StObject {
    
    def getColorMap(): SpectrumStyle = js.native
    
    def getData(): js.Array[LatLng | PointArrayLiteral] = js.native
    
    def getMap(): Map | Null = js.native
    
    def getOptions(): HeatMapOptions = js.native
    def getOptions(key: String): HeatMapOptions = js.native
    
    def redraw(): Unit = js.native
    
    def setColorMap(colormap: SpectrumStyle, inReverse: Boolean): Unit = js.native
    
    def setData(data: js.Array[LatLng | PointArrayLiteral]): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def setOptions(key: String, value: js.Any): Unit = js.native
    def setOptions(options: HeatMapOptions): Unit = js.native
  }
  
  @js.native
  trait HeatMapOptions extends StObject {
    
    var colorMap: js.UndefOr[SpectrumStyle] = js.native
    
    var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation] = js.native
    
    var map: Map = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
  }
  object HeatMapOptions {
    
    @scala.inline
    def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): HeatMapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatMapOptions]
    }
    
    @scala.inline
    implicit class HeatMapOptionsMutableBuilder[Self <: HeatMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorMap(value: SpectrumStyle): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  @js.native
  trait WeightedLocation extends StObject {
    
    def getLocation(): LatLng = js.native
    
    def getWeight(): Double = js.native
    
    def lat(): Double = js.native
    
    def lng(): Double = js.native
  }
  object WeightedLocation {
    
    @scala.inline
    def apply(getLocation: () => LatLng, getWeight: () => Double, lat: () => Double, lng: () => Double): WeightedLocation = {
      val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getWeight = js.Any.fromFunction0(getWeight), lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng))
      __obj.asInstanceOf[WeightedLocation]
    }
    
    @scala.inline
    implicit class WeightedLocationMutableBuilder[Self <: WeightedLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLocation(value: () => LatLng): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWeight(value: () => Double): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLat(value: () => Double): Self = StObject.set(x, "lat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLng(value: () => Double): Self = StObject.set(x, "lng", js.Any.fromFunction0(value))
    }
  }
}
