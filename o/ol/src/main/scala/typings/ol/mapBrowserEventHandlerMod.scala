package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventHandlerMod {
  
  @JSImport("ol/MapBrowserEventHandler", JSImport.Default)
  @js.native
  class default protected () extends MapBrowserEventHandler {
    def this(map: typings.ol.pluggableMapMod.default) = this()
    def this(map: typings.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  @js.native
  trait MapBrowserEventHandler
    extends typings.ol.targetMod.default
}
