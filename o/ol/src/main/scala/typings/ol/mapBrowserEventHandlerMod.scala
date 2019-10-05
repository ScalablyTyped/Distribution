package typings.ol

import typings.ol.mapBrowserEventHandlerMod.MapBrowserEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapBrowserEventHandler", JSImport.Namespace)
@js.native
object mapBrowserEventHandlerMod extends js.Object {
  @js.native
  class default protected () extends MapBrowserEventHandler {
    def this(map: typings.ol.pluggableMapMod.default) = this()
    def this(map: typings.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  type MapBrowserEventHandler = typings.ol.eventsTargetMod.default
}

