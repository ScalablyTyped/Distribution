package typings.ol.modifyMod

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Modify", "ModifyEvent")
@js.native
class ModifyEvent protected ()
  extends typings.ol.eventMod.default {
  def this(
    `type`: ModifyEventType,
    features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    MapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]
  ) = this()
  
  /**
    * The features being modified.
    */
  var features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  
  /**
    * Associated {@link module:ol/MapBrowserEvent}.
    */
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
}
