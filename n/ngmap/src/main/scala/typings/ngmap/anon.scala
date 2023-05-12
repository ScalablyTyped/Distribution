package typings.ngmap

import typings.googleMaps.google.maps.Animation
import typings.googleMaps.google.maps.Icon
import typings.googleMaps.google.maps.Map
import typings.googleMaps.google.maps.MarkerShape
import typings.googleMaps.google.maps.Point
import typings.googleMaps.google.maps.StreetViewPanorama
import typings.googleMaps.google.maps.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnchorPoint extends StObject {
    
    /**
      * The offset from the marker's position to the tip of an InfoWindow
      * that has been opened with the marker as anchor.
      */
    var anchorPoint: js.UndefOr[Point] = js.undefined
    
    /** Which animation to play when marker is added to a map. */
    var animation: js.UndefOr[Animation] = js.undefined
    
    /**
      * If true, the marker receives mouse and touch events.
      * @default true
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /** Mouse cursor to show on hover. */
    var cursor: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the marker can be dragged.
      * @default false
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon for the foreground.
      * If a string is provided, it is treated as though it were an Icon with the string as url.
      */
    var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
    
    /**
      * Adds a label to the marker. The label can either be a string, or a MarkerLabel object.
      * Only the first character of the string will be displayed.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Map on which to display Marker.
      */
    var map: js.UndefOr[Map | StreetViewPanorama] = js.undefined
    
    /** The marker's opacity between 0.0 and 1.0. */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Optimization renders many markers as a single static element.
      * Optimized rendering is enabled by default.
      * Disable optimized rendering for animated GIFs or PNGs, or when each
      * marker must be rendered as a separate DOM element (advanced usage
      * only).
      */
    var optimized: js.UndefOr[Boolean] = js.undefined
    
    /** Image map region definition used for drag/click. */
    var shape: js.UndefOr[MarkerShape] = js.undefined
    
    /** Rollover text. */
    var title: js.UndefOr[String] = js.undefined
    
    /** If true, the marker is visible. */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * All markers are displayed on the map in order of their zIndex,
      * with higher values displaying in front of markers with lower values.
      * By default, markers are displayed according to their vertical position on screen,
      * with lower markers appearing in front of markers further up the screen.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object AnchorPoint {
    
    inline def apply(): AnchorPoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorPoint] (val x: Self) extends AnyVal {
      
      inline def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
      
      inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMap(value: Map | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
      
      inline def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
      
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
}
