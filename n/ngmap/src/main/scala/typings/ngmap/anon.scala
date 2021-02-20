package typings.ngmap

import typings.googlemaps.google.maps.Animation
import typings.googlemaps.google.maps.Icon
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.MarkerShape
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.Symbol
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnchorPoint extends StObject {
    
    /**
      * The offset from the marker's position to the tip of an InfoWindow
      * that has been opened with the marker as anchor.
      */
    var anchorPoint: js.UndefOr[Point] = js.native
    
    /** Which animation to play when marker is added to a map. */
    var animation: js.UndefOr[Animation] = js.native
    
    /**
      * If true, the marker receives mouse and touch events.
      * @default true
      */
    var clickable: js.UndefOr[Boolean] = js.native
    
    /** Mouse cursor to show on hover. */
    var cursor: js.UndefOr[String] = js.native
    
    /**
      * If true, the marker can be dragged.
      * @default false
      */
    var draggable: js.UndefOr[Boolean] = js.native
    
    /**
      * Icon for the foreground.
      * If a string is provided, it is treated as though it were an Icon with the string as url.
      * @type {(string|Icon|Symbol)}
      */
    var icon: js.UndefOr[String | Icon | Symbol] = js.native
    
    /**
      * Adds a label to the marker. The label can either be a string, or a MarkerLabel object.
      * Only the first character of the string will be displayed.
      * @type {string}
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Map on which to display Marker.
      * @type {(Map|StreetViewPanorama)}
      *
      */
    var map: js.UndefOr[Map[Element] | StreetViewPanorama] = js.native
    
    /** The marker's opacity between 0.0 and 1.0. */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * Optimization renders many markers as a single static element.
      * Optimized rendering is enabled by default.
      * Disable optimized rendering for animated GIFs or PNGs, or when each
      * marker must be rendered as a separate DOM element (advanced usage
      * only).
      */
    var optimized: js.UndefOr[Boolean] = js.native
    
    /** Image map region definition used for drag/click. */
    var shape: js.UndefOr[MarkerShape] = js.native
    
    /** Rollover text. */
    var title: js.UndefOr[String] = js.native
    
    /** If true, the marker is visible. */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * All markers are displayed on the map in order of their zIndex,
      * with higher values displaying in front of markers with lower values.
      * By default, markers are displayed according to their vertical position on screen,
      * with lower markers appearing in front of markers further up the screen.
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object AnchorPoint {
    
    @scala.inline
    def apply(): AnchorPoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorPoint]
    }
    
    @scala.inline
    implicit class AnchorPointMutableBuilder[Self <: AnchorPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
      
      @scala.inline
      def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMap(value: Map[Element] | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
      
      @scala.inline
      def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
