package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Submodule - Drawing
  * See https://navermaps.github.io/maps.js.ncp/docs/tutorial-Drawing.html
  */
object drawing {
  
  @js.native
  sealed trait DrawingEvent extends StObject
  @JSGlobal("naver.maps.drawing.DrawingEvent")
  @js.native
  object DrawingEvent extends StObject {
    
    @js.native
    sealed trait ADD
      extends StObject
         with DrawingEvent
    
    @js.native
    sealed trait CANCLE
      extends StObject
         with DrawingEvent
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with DrawingEvent
    
    @js.native
    sealed trait SELECT
      extends StObject
         with DrawingEvent
    
    @js.native
    sealed trait START
      extends StObject
         with DrawingEvent
  }
  
  @js.native
  sealed trait DrawingMode extends StObject
  @JSGlobal("naver.maps.drawing.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    @js.native
    sealed trait ARROWLINE
      extends StObject
         with DrawingMode
    
    @js.native
    sealed trait ELLIPSE
      extends StObject
         with DrawingMode
    
    @js.native
    sealed trait HAND
      extends StObject
         with DrawingMode
    
    @js.native
    sealed trait MARKER
      extends StObject
         with DrawingMode
    
    @js.native
    sealed trait POLYGON
      extends StObject
         with DrawingMode
    
    @js.native
    sealed trait POLYLINE
      extends StObject
         with DrawingMode
    
    @js.native
    sealed trait RECTANGLE
      extends StObject
         with DrawingMode
  }
  
  @js.native
  sealed trait DrawingStyle extends StObject
  @JSGlobal("naver.maps.drawing.DrawingStyle")
  @js.native
  object DrawingStyle extends StObject {
    
    @js.native
    sealed trait HORIZONTAL
      extends StObject
         with DrawingStyle
    
    @js.native
    sealed trait HORIZONTAL_2
      extends StObject
         with DrawingStyle
    
    @js.native
    sealed trait VERTICAL
      extends StObject
         with DrawingStyle
    
    @js.native
    sealed trait VERTICAL_2
      extends StObject
         with DrawingStyle
  }
  
  trait ControlPointOptions
    extends StObject
       with ControlOptions {
    
    var anchorPointOptions: CircleOptions
    
    var midPointOptions: CircleOptions
  }
  object ControlPointOptions {
    
    inline def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions, position: Position): ControlPointOptions = {
      val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions.asInstanceOf[js.Any], midPointOptions = midPointOptions.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPointOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlPointOptions] (val x: Self) extends AnyVal {
      
      inline def setAnchorPointOptions(value: CircleOptions): Self = StObject.set(x, "anchorPointOptions", value.asInstanceOf[js.Any])
      
      inline def setMidPointOptions(value: CircleOptions): Self = StObject.set(x, "midPointOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawingControlOptions
    extends StObject
       with ControlOptions {
    
    var style: js.UndefOr[DrawingStyle] = js.undefined
  }
  object DrawingControlOptions {
    
    inline def apply(position: Position): DrawingControlOptions = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawingControlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawingControlOptions] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: DrawingStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DrawingManager
    extends StObject
       with KVO {
    
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
    
    def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
    
    def destroy(): Unit = js.native
    
    def getDrawing(id: String): DrawingOverlay = js.native
    
    def getDrawings(): StringDictionary[DrawingOverlay] = js.native
    
    def getMap(): Map | Null = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def toGeoJson(): GeoJSON = js.native
  }
  
  trait DrawingOptions extends StObject {
    
    var arrowlineOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    var controlPointOptions: js.UndefOr[ControlPointOptions] = js.undefined
    
    var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.undefined
    
    var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.undefined
    
    var drawingMode: js.UndefOr[DrawingMode] = js.undefined
    
    var ellipseOptions: js.UndefOr[EllipseOptions] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
    
    var polygonOptions: js.UndefOr[PolygonOptions] = js.undefined
    
    var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    var rectangleOptions: js.UndefOr[RectangleOptions] = js.undefined
  }
  object DrawingOptions {
    
    inline def apply(): DrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawingOptions] (val x: Self) extends AnyVal {
      
      inline def setArrowlineOptions(value: PolylineOptions): Self = StObject.set(x, "arrowlineOptions", value.asInstanceOf[js.Any])
      
      inline def setArrowlineOptionsUndefined: Self = StObject.set(x, "arrowlineOptions", js.undefined)
      
      inline def setControlPointOptions(value: ControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
      
      inline def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
      
      inline def setDrawingControl(value: js.Array[DrawingMode]): Self = StObject.set(x, "drawingControl", value.asInstanceOf[js.Any])
      
      inline def setDrawingControlOptions(value: DrawingControlOptions): Self = StObject.set(x, "drawingControlOptions", value.asInstanceOf[js.Any])
      
      inline def setDrawingControlOptionsUndefined: Self = StObject.set(x, "drawingControlOptions", js.undefined)
      
      inline def setDrawingControlUndefined: Self = StObject.set(x, "drawingControl", js.undefined)
      
      inline def setDrawingControlVarargs(value: DrawingMode*): Self = StObject.set(x, "drawingControl", js.Array(value*))
      
      inline def setDrawingMode(value: DrawingMode): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      inline def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      inline def setEllipseOptions(value: EllipseOptions): Self = StObject.set(x, "ellipseOptions", value.asInstanceOf[js.Any])
      
      inline def setEllipseOptionsUndefined: Self = StObject.set(x, "ellipseOptions", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
      
      inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
      
      inline def setPolygonOptions(value: PolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
      
      inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
      
      inline def setRectangleOptions(value: RectangleOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
      
      inline def setRectangleOptionsUndefined: Self = StObject.set(x, "rectangleOptions", js.undefined)
    }
  }
  
  @js.native
  trait DrawingOverlay extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    def setEditable(editable: Boolean): Unit = js.native
    def setEditable(editable: Boolean, controlPointOptions: ControlPointOptions): Unit = js.native
  }
}
