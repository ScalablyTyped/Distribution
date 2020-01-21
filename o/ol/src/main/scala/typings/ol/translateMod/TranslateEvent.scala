package typings.ol.translateMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent ()
  extends typings.ol.eventMod.default {
  var coordinate: Coordinate = js.native
  var features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default = js.native
  var startCoordinate: Coordinate = js.native
}

