package typings.ol.interactionModifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Modify", "ModifyEvent")
@js.native
class ModifyEvent ()
  extends typings.ol.eventsEventMod.default {
  var features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default = js.native
}

