package typings.navermaps.naver.maps

import typings.navermaps.naver.maps.drawing.DrawingMode
import typings.navermaps.naver.maps.drawing.DrawingOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Submodule - visualization
  * See https://navermaps.github.io/maps.js.ncp/docs/tutorial-visualization.html
  */
object visualization {
  
  @js.native
  sealed trait SpectrumStyle extends StObject
  @JSGlobal("naver.maps.visualization.SpectrumStyle")
  @js.native
  object SpectrumStyle extends StObject {
    
    @js.native
    sealed trait COOL
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait GREYS
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait HOT
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait HSV
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait JET
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait OXYGEN
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait PORTLAND
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait RAINBOW
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait RdBu
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait YIGnBu
      extends StObject
         with SpectrumStyle
    
    @js.native
    sealed trait YIOrRd
      extends StObject
         with SpectrumStyle
  }
  
  @js.native
  trait DotMap
    extends StObject
       with KVO {
    
    // if key is undefiend, return DotMapOptions
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
    
    def getData(): js.Array[LatLng | PointArrayLiteral] = js.native
    
    def getMap(): Map | Null = js.native
    
    def getOptions(): Any = js.native
    def getOptions(key: String): Any = js.native
    
    def redraw(): Unit = js.native
    
    def setData(data: js.Array[LatLng | PointArrayLiteral]): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def setOptions(key: String, value: Any): Unit = js.native
    def setOptions(options: DotMapOptions): Unit = js.native
  }
  
  trait DotMapOptions extends StObject {
    
    var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
    
    var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
    
    var strokeWeight: js.UndefOr[Double] = js.undefined
  }
  object DotMapOptions {
    
    inline def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): DotMapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotMapOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeLineCap(value: StrokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
      
      inline def setStrokeLineJoin(value: StrokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    }
  }
  
  @js.native
  trait HeatMap
    extends StObject
       with KVO {
    
    def getColorMap(): SpectrumStyle = js.native
    
    def getData(): js.Array[LatLng | PointArrayLiteral] = js.native
    
    def getMap(): Map | Null = js.native
    
    def getOptions(): Any = js.native
    def getOptions(key: String): Any = js.native
    
    // if key is undefiend, return HeatMapOptions
    def redraw(): Unit = js.native
    
    def setColorMap(colormap: SpectrumStyle, inReverse: Boolean): Unit = js.native
    
    def setData(data: js.Array[LatLng | PointArrayLiteral]): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def setOptions(key: String, value: Any): Unit = js.native
    def setOptions(options: HeatMapOptions): Unit = js.native
  }
  
  trait HeatMapOptions extends StObject {
    
    var colorMap: js.UndefOr[SpectrumStyle] = js.undefined
    
    var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]
    
    var map: js.UndefOr[Map] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object HeatMapOptions {
    
    inline def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): HeatMapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeatMapOptions] (val x: Self) extends AnyVal {
      
      inline def setColorMap(value: SpectrumStyle): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  trait WeightedLocation extends StObject {
    
    def getLocation(): LatLng
    
    def getWeight(): Double
    
    def lat(): Double
    
    def lng(): Double
  }
  object WeightedLocation {
    
    inline def apply(getLocation: () => LatLng, getWeight: () => Double, lat: () => Double, lng: () => Double): WeightedLocation = {
      val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getWeight = js.Any.fromFunction0(getWeight), lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng))
      __obj.asInstanceOf[WeightedLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeightedLocation] (val x: Self) extends AnyVal {
      
      inline def setGetLocation(value: () => LatLng): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
      
      inline def setGetWeight(value: () => Double): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      inline def setLat(value: () => Double): Self = StObject.set(x, "lat", js.Any.fromFunction0(value))
      
      inline def setLng(value: () => Double): Self = StObject.set(x, "lng", js.Any.fromFunction0(value))
    }
  }
}
