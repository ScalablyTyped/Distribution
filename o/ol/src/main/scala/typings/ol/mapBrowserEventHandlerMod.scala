package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/MapBrowserEventHandler", JSImport.Namespace)
@js.native
object mapBrowserEventHandlerMod extends js.Object {
  
  @js.native
  trait MapBrowserEventHandler
    extends typings.ol.targetMod.default
  
  @js.native
  class default protected () extends MapBrowserEventHandler {
    def this(map: typings.ol.pluggableMapMod.default) = this()
    def this(map: typings.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
}
