package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.pointerPointerEventMod.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/PointerEvent", JSImport.Namespace)
@js.native
object pointerPointerEventMod extends js.Object {
  @js.native
  class default protected () extends PointerEvent {
    def this(`type`: String, originalEvent: typings.ol.eventsEventMod.default) = this()
    def this(
      `type`: String,
      originalEvent: typings.ol.eventsEventMod.default,
      opt_eventDict: StringDictionary[js.Any]
    ) = this()
  }
  
  type PointerEvent = typings.ol.eventsEventMod.default
}

