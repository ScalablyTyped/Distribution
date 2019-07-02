package typings
package olLib.pointerEventSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/EventSource", JSImport.Default)
@js.native
class default protected () extends EventSource {
  def this(dispatcher: olLib.pointerPointerEventHandlerMod.default, mapping: org.scalablytyped.runtime.StringDictionary[js.Function1[/* p0 */ stdLib.Event, scala.Unit]]) = this()
  /* CompleteClass */
  override def getEvents(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getHandlerForEvent(eventType: java.lang.String): js.Function1[/* p0 */ stdLib.Event, scala.Unit] = js.native
}

