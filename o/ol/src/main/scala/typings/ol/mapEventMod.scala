package typings.ol

import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapEvent", JSImport.Namespace)
@js.native
object mapEventMod extends js.Object {
  @js.native
  trait MapEvent
    extends typings.ol.eventsEventMod.default {
    var frameState: FrameState = js.native
    var map: typings.ol.pluggableMapMod.default = js.native
  }
  
  @js.native
  class default protected () extends MapEvent {
    def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
}

