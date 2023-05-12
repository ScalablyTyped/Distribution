package typings.ol

import typings.ol.mapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapEventMod {
  
  /**
    * @classdesc
    * Events emitted as map events are instances of this type.
    * See {@link module:ol/Map~Map} for which events trigger a map event.
    */
  @JSImport("ol/MapEvent", JSImport.Default)
  @js.native
  open class default protected () extends MapEvent {
    /**
      * @param {string} type Event type.
      * @param {import("./Map.js").default} map Map.
      * @param {?import("./Map.js").FrameState} [frameState] Frame state.
      */
    def this(`type`: String, map: typings.ol.rendererMapMod.default) = this()
    def this(`type`: String, map: typings.ol.rendererMapMod.default, frameState: FrameState) = this()
  }
  
  /**
    * @classdesc
    * Events emitted as map events are instances of this type.
    * See {@link module:ol/Map~Map} for which events trigger a map event.
    */
  @js.native
  trait MapEvent
    extends typings.ol.eventsEventMod.default {
    
    /**
      * The frame state at the time of the event.
      * @type {?import("./Map.js").FrameState}
      * @api
      */
    var frameState: FrameState | Null = js.native
    
    /**
      * The map where the event occurred.
      * @type {import("./Map.js").default}
      * @api
      */
    var map: typings.ol.rendererMapMod.default = js.native
  }
}
