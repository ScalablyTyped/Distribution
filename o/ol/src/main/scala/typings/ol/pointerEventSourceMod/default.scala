package typings.ol.pointerEventSourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/EventSource", JSImport.Default)
@js.native
class default protected () extends EventSource {
  def this(
    dispatcher: typings.ol.pointerPointerEventHandlerMod.default,
    mapping: StringDictionary[js.Function1[/* p0 */ Event, Unit]]
  ) = this()
  /* CompleteClass */
  override def getEvents(): js.Array[String] = js.native
  /* CompleteClass */
  override def getHandlerForEvent(eventType: String): js.Function1[/* p0 */ Event, Unit] = js.native
}

