package typings
package olLib.mapbrowsereventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/mapbrowserevent", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.MapBrowserEvent {
  /**
       * @classdesc
       * Events emitted as map browser events are instances of this type.
       * See {@link ol.Map} for which events trigger a map browser event.
       *
       * @param type Event type.
       * @param map Map.
       * @param browserEvent Browser event.
       * @param opt_dragging Is the map currently being dragged?
       * @param opt_frameState Frame state.
       */
  def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, browserEvent: stdLib.Event) = this()
  /**
       * @classdesc
       * Events emitted as map browser events are instances of this type.
       * See {@link ol.Map} for which events trigger a map browser event.
       *
       * @param type Event type.
       * @param map Map.
       * @param browserEvent Browser event.
       * @param opt_dragging Is the map currently being dragged?
       * @param opt_frameState Frame state.
       */
  def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, browserEvent: stdLib.Event, opt_dragging: scala.Boolean) = this()
  /**
       * @classdesc
       * Events emitted as map browser events are instances of this type.
       * See {@link ol.Map} for which events trigger a map browser event.
       *
       * @param type Event type.
       * @param map Map.
       * @param browserEvent Browser event.
       * @param opt_dragging Is the map currently being dragged?
       * @param opt_frameState Frame state.
       */
  def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, browserEvent: stdLib.Event, opt_dragging: scala.Boolean, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
}

