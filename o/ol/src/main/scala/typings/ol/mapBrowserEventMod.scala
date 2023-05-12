package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.mapMod.FrameState
import typings.ol.pixelMod.Pixel
import typings.std.PointerEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventMod {
  
  /**
    * @classdesc
    * Events emitted as map browser events are instances of this type.
    * See {@link module:ol/Map~Map} for which events trigger a map browser event.
    * @template {UIEvent} EVENT
    */
  @JSImport("ol/MapBrowserEvent", JSImport.Default)
  @js.native
  open class default[EVENT /* <: UIEvent */] protected () extends MapBrowserEvent[EVENT] {
    /**
      * @param {string} type Event type.
      * @param {import("./Map.js").default} map Map.
      * @param {EVENT} originalEvent Original event.
      * @param {boolean} [dragging] Is the map currently being dragged?
      * @param {import("./Map.js").FrameState} [frameState] Frame state.
      * @param {Array<PointerEvent>} [activePointers] Active pointers.
      */
    def this(`type`: String, map: typings.ol.rendererMapMod.default, originalEvent: EVENT) = this()
    def this(`type`: String, map: typings.ol.rendererMapMod.default, originalEvent: EVENT, dragging: Boolean) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Boolean,
      frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Unit,
      frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Boolean,
      frameState: Unit,
      activePointers: js.Array[PointerEvent]
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Boolean,
      frameState: FrameState,
      activePointers: js.Array[PointerEvent]
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Unit,
      frameState: Unit,
      activePointers: js.Array[PointerEvent]
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.rendererMapMod.default,
      originalEvent: EVENT,
      dragging: Unit,
      frameState: FrameState,
      activePointers: js.Array[PointerEvent]
    ) = this()
  }
  
  /**
    * @classdesc
    * Events emitted as map browser events are instances of this type.
    * See {@link module:ol/Map~Map} for which events trigger a map browser event.
    * @template {UIEvent} EVENT
    */
  @js.native
  trait MapBrowserEvent[EVENT /* <: UIEvent */]
    extends typings.ol.mapEventMod.default {
    
    /**
      * @type {Array<PointerEvent>|undefined}
      */
    var activePointers: js.UndefOr[js.Array[PointerEvent]] = js.native
    
    /**
      * The coordinate corresponding to the original browser event.  This will be in the user
      * projection if one is set.  Otherwise it will be in the view projection.
      * @type {import("./coordinate.js").Coordinate}
      * @api
      */
    def coordinate: Coordinate = js.native
    
    /**
      * The coordinate in the user projection corresponding to the original browser event.
      * @type {?import("./coordinate.js").Coordinate}
      */
    var coordinate_ : Coordinate | Null = js.native
    
    def coordinate_=(arg: Coordinate): Unit = js.native
    
    /**
      * Indicates if the map is currently being dragged. Only set for
      * `POINTERDRAG` and `POINTERMOVE` events. Default is `false`.
      *
      * @type {boolean}
      * @api
      */
    var dragging: Boolean = js.native
    
    /**
      * The original browser event.
      * @const
      * @type {EVENT}
      * @api
      */
    var originalEvent: EVENT = js.native
    
    /**
      * The map pixel relative to the viewport corresponding to the original event.
      * @type {import("./pixel.js").Pixel}
      * @api
      */
    def pixel: Pixel = js.native
    
    /**
      * The map pixel relative to the viewport corresponding to the original browser event.
      * @type {?import("./pixel.js").Pixel}
      */
    var pixel_ : Pixel | Null = js.native
    
    def pixel_=(arg: Pixel): Unit = js.native
  }
}
