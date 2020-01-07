package typings.ol.interactionTranslateMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent ()
  extends typings.ol.eventsEventMod.default {
  var coordinate: Coordinate = js.native
  var features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default = js.native
  var startCoordinate: Coordinate = js.native
}

