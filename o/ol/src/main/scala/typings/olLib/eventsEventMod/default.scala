package typings
package olLib.eventsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/Event", JSImport.Default)
@js.native
class default protected () extends Event {
  def this(`type`: java.lang.String) = this()
  /* CompleteClass */
  override var target: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): scala.Unit = js.native
}

