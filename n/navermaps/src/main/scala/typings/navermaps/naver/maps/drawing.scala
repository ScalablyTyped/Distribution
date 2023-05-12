package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StringDictionary
import typings.navermaps.anon.PartialEllipseOptions
import typings.navermaps.anon.PartialMarkerOptions
import typings.navermaps.anon.PartialPolygonOptions
import typings.navermaps.anon.PartialPolylineOptions
import typings.navermaps.anon.PartialRectangleOptions
import typings.navermaps.navermapsStrings.arrowlineOptions
import typings.navermaps.navermapsStrings.controlPointOptions
import typings.navermaps.navermapsStrings.drawingControl
import typings.navermaps.navermapsStrings.drawingControlOptions
import typings.navermaps.navermapsStrings.drawingMode
import typings.navermaps.navermapsStrings.ellipseOptions
import typings.navermaps.navermapsStrings.map
import typings.navermaps.navermapsStrings.markerOptions
import typings.navermaps.navermapsStrings.polygonOptions
import typings.navermaps.navermapsStrings.polylineOptions
import typings.navermaps.navermapsStrings.rectangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Submodule - Drawing
  * See https://navermaps.github.io/maps.js.ncp/docs/tutorial-Drawing.html
  */
object drawing {
  
  @js.native
  sealed trait DrawingEvents extends StObject
  @JSGlobal("naver.maps.drawing.DrawingEvents")
  @js.native
  object DrawingEvents extends StObject {
    
    @js.native
    sealed trait ADD
      extends StObject
         with DrawingEvents
    
    @js.native
    sealed trait CANCLE
      extends StObject
         with DrawingEvents
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with DrawingEvents
    
    @js.native
    sealed trait SELECT
      extends StObject
         with DrawingEvents
    
    @js.native
    sealed trait START
      extends StObject
         with DrawingEvents
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
    
    def addListener(eventName: DrawingEvents, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
    
    def destroy(): Unit = js.native
    
    def getDrawing(id: String): DrawingOverlay = js.native
    
    def getDrawings(): StringDictionary[DrawingOverlay] = js.native
    
    def getMap(): Map | Null = js.native
    
    @JSName("getOptions")
    def getOptions_arrowlineOptions(key: arrowlineOptions): js.UndefOr[PartialPolylineOptions] = js.native
    @JSName("getOptions")
    def getOptions_controlPointOptions(key: controlPointOptions): js.UndefOr[ControlPointOptions] = js.native
    @JSName("getOptions")
    def getOptions_drawingControl(key: drawingControl): js.UndefOr[js.Array[DrawingMode]] = js.native
    @JSName("getOptions")
    def getOptions_drawingControlOptions(key: drawingControlOptions): js.UndefOr[DrawingControlOptions] = js.native
    @JSName("getOptions")
    def getOptions_drawingMode(key: drawingMode): js.UndefOr[DrawingMode] = js.native
    @JSName("getOptions")
    def getOptions_ellipseOptions(key: ellipseOptions): js.UndefOr[PartialEllipseOptions] = js.native
    @JSName("getOptions")
    def getOptions_map(key: map): js.UndefOr[Map] = js.native
    @JSName("getOptions")
    def getOptions_markerOptions(key: markerOptions): js.UndefOr[PartialMarkerOptions] = js.native
    @JSName("getOptions")
    def getOptions_polygonOptions(key: polygonOptions): js.UndefOr[PartialPolygonOptions] = js.native
    @JSName("getOptions")
    def getOptions_polylineOptions(key: polylineOptions): js.UndefOr[PartialPolylineOptions] = js.native
    @JSName("getOptions")
    def getOptions_rectangleOptions(key: rectangleOptions): js.UndefOr[PartialRectangleOptions] = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def setOptions(options: DrawingOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_arrowlineOptions(key: arrowlineOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_arrowlineOptions(key: arrowlineOptions, value: PartialPolylineOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_controlPointOptions(key: controlPointOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_controlPointOptions(key: controlPointOptions, value: ControlPointOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_drawingControl(key: drawingControl): Unit = js.native
    @JSName("setOptions")
    def setOptions_drawingControl(key: drawingControl, value: js.Array[DrawingMode]): Unit = js.native
    @JSName("setOptions")
    def setOptions_drawingControlOptions(key: drawingControlOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_drawingControlOptions(key: drawingControlOptions, value: DrawingControlOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_drawingMode(key: drawingMode): Unit = js.native
    @JSName("setOptions")
    def setOptions_drawingMode(key: drawingMode, value: DrawingMode): Unit = js.native
    @JSName("setOptions")
    def setOptions_ellipseOptions(key: ellipseOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_ellipseOptions(key: ellipseOptions, value: PartialEllipseOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_map(key: map): Unit = js.native
    @JSName("setOptions")
    def setOptions_map(key: map, value: Map): Unit = js.native
    @JSName("setOptions")
    def setOptions_markerOptions(key: markerOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_markerOptions(key: markerOptions, value: PartialMarkerOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_polygonOptions(key: polygonOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_polygonOptions(key: polygonOptions, value: PartialPolygonOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_polylineOptions(key: polylineOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_polylineOptions(key: polylineOptions, value: PartialPolylineOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_rectangleOptions(key: rectangleOptions): Unit = js.native
    @JSName("setOptions")
    def setOptions_rectangleOptions(key: rectangleOptions, value: PartialRectangleOptions): Unit = js.native
    
    def toGeoJson(): GeoJSON = js.native
  }
  
  trait DrawingOptions extends StObject {
    
    var arrowlineOptions: js.UndefOr[PartialPolylineOptions] = js.undefined
    
    var controlPointOptions: js.UndefOr[ControlPointOptions] = js.undefined
    
    var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.undefined
    
    var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.undefined
    
    var drawingMode: js.UndefOr[DrawingMode] = js.undefined
    
    var ellipseOptions: js.UndefOr[PartialEllipseOptions] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var markerOptions: js.UndefOr[PartialMarkerOptions] = js.undefined
    
    var polygonOptions: js.UndefOr[PartialPolygonOptions] = js.undefined
    
    var polylineOptions: js.UndefOr[PartialPolylineOptions] = js.undefined
    
    var rectangleOptions: js.UndefOr[PartialRectangleOptions] = js.undefined
  }
  object DrawingOptions {
    
    inline def apply(): DrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawingOptions] (val x: Self) extends AnyVal {
      
      inline def setArrowlineOptions(value: PartialPolylineOptions): Self = StObject.set(x, "arrowlineOptions", value.asInstanceOf[js.Any])
      
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
      
      inline def setEllipseOptions(value: PartialEllipseOptions): Self = StObject.set(x, "ellipseOptions", value.asInstanceOf[js.Any])
      
      inline def setEllipseOptionsUndefined: Self = StObject.set(x, "ellipseOptions", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMarkerOptions(value: PartialMarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
      
      inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
      
      inline def setPolygonOptions(value: PartialPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      inline def setPolylineOptions(value: PartialPolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
      
      inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
      
      inline def setRectangleOptions(value: PartialRectangleOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
      
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
