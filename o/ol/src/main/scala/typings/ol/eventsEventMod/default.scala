package typings.ol.eventsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/Event", JSImport.Default)
@js.native
class default protected () extends Event {
  def this(`type`: String) = this()
  /* CompleteClass */
  override var target: js.Any = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

