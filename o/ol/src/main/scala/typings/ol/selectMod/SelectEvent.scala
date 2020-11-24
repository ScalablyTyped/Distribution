package typings.ol.selectMod

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectEvent
  extends typings.ol.eventMod.default {
  
  /**
    * Deselected features array.
    */
  var deselected: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  
  /**
    * Associated {@link module:ol/MapBrowserEvent}.
    */
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
  
  /**
    * Selected features array.
    */
  var selected: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
}
