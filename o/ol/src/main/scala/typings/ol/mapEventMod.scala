package typings.ol

import typings.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapEventMod {
  
  @JSImport("ol/MapEvent", JSImport.Default)
  @js.native
  open class default protected () extends MapEvent {
    def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
  @js.native
  trait MapEvent
    extends typings.ol.eventMod.default {
    
    /**
      * The frame state at the time of the event.
      */
    var frameState: FrameState = js.native
    
    /**
      * The map where the event occurred.
      */
    var map: typings.ol.pluggableMapMod.default = js.native
  }
}
