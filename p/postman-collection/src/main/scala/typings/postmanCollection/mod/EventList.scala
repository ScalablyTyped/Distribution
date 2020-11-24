package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "EventList")
@js.native
class EventList protected () extends PropertyList[Event] {
  def this(parent: js.Any, populate: js.Array[Event]) = this()
  
  def listeners(name: String): js.Array[Event] = js.native
  
  def listenersOwn(name: String): js.Array[Event] = js.native
}
/* static members */
@JSImport("postman-collection", "EventList")
@js.native
object EventList extends js.Object {
  
  def isEventList(obj: js.Any): Boolean = js.native
}
