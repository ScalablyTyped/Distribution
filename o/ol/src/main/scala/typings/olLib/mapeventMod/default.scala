package typings
package olLib.mapeventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/mapevent", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.MapEvent {
  /**
       * @classdesc
       * Events emitted as map events are instances of this type.
       * See {@link ol.Map} for which events trigger a map event.
       *
       * @param type Event type.
       * @param map Map.
       * @param opt_frameState Frame state.
       */
  def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map) = this()
  /**
       * @classdesc
       * Events emitted as map events are instances of this type.
       * See {@link ol.Map} for which events trigger a map event.
       *
       * @param type Event type.
       * @param map Map.
       * @param opt_frameState Frame state.
       */
  def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
}

