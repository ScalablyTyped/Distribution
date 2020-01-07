package typings.ol.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Select", "SelectEvent")
@js.native
class SelectEvent protected ()
  extends typings.ol.eventsEventMod.default {
  def this(
    `type`: SelectEventType,
    selected: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
    deselected: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
    mapBrowserEvent: typings.ol.mapBrowserEventMod.default
  ) = this()
  var deselected: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default = js.native
  var selected: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
}

