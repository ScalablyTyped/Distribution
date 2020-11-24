package typings.ol.translateMod

import typings.ol.coordinateMod.Coordinate
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent protected ()
  extends typings.ol.eventMod.default {
  def this(
    `type`: TranslateEventType,
    features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    coordinate: Coordinate,
    startCoordinate: Coordinate,
    mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]
  ) = this()
  
  /**
    * The coordinate of the drag event.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * The features being translated.
    */
  var features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  
  /**
    * Associated {@link module:ol/MapBrowserEvent}.
    */
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
  
  /**
    * The coordinate of the start position before translation started.
    */
  var startCoordinate: Coordinate = js.native
}
