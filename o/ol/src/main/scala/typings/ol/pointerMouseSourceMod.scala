package typings.ol

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/MouseSource", JSImport.Namespace)
@js.native
object pointerMouseSourceMod extends js.Object {
  @js.native
  trait MouseSource
    extends typings.ol.pointerEventSourceMod.default {
    def cancel(inEvent: Event): Unit = js.native
    def cleanupMouse(): Unit = js.native
  }
  
  @js.native
  class default protected () extends MouseSource {
    def this(dispatcher: typings.ol.pointerPointerEventHandlerMod.default) = this()
  }
  
  def prepareEvent(inEvent: Event, dispatcher: typings.ol.pointerPointerEventHandlerMod.default): js.Any = js.native
}

