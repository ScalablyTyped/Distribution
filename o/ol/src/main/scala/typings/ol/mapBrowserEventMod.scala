package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventMod {
  
  @JSImport("ol/MapBrowserEvent", JSImport.Default)
  @js.native
  class default[EVENT /* <: UIEvent */] protected () extends MapBrowserEvent[EVENT] {
    def this(`type`: String, map: typings.ol.pluggableMapMod.default, originalEvent: EVENT) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Unit,
      opt_frameState: FrameState
    ) = this()
  }
  
  @js.native
  trait MapBrowserEvent[EVENT /* <: UIEvent */]
    extends typings.ol.mapEventMod.default {
    
    /**
      * The coordinate corresponding to the original browser event.  This will be in the user
      * projection if one is set.  Otherwise it will be in the view projection.
      */
    var coordinate: Coordinate = js.native
    
    /**
      * Indicates if the map is currently being dragged. Only set for
      * POINTERDRAG and POINTERMOVE events. Default is false.
      */
    var dragging: Boolean = js.native
    
    /**
      * The original browser event.
      */
    var originalEvent: EVENT = js.native
    
    /**
      * The map pixel relative to the viewport corresponding to the original event.
      */
    var pixel: Pixel = js.native
  }
}
