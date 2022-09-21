package typings.openlayers.global.ol

import typings.openlayers.mod.olx.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.MapEvent")
@js.native
open class MapEvent protected ()
  extends typings.openlayers.mod.MapEvent {
  /**
    * @classdesc
    * Events emitted as map events are instances of this type.
    * See {@link ol.Map} for which events trigger a map event.
    *
    * @param type Event type.
    * @param map Map.
    * @param opt_frameState Frame state.
    */
  def this(`type`: String, map: typings.openlayers.mod.Map) = this()
  def this(`type`: String, map: typings.openlayers.mod.Map, opt_frameState: FrameState) = this()
}
