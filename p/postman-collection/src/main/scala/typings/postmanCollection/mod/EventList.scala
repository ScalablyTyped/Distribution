package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "EventList")
@js.native
class EventList protected () extends PropertyList[Event] {
  def this(parent: js.Any, populate: js.Array[Event]) = this()
  
  def listeners(name: String): js.Array[Event] = js.native
  
  def listenersOwn(name: String): js.Array[Event] = js.native
}
/* static members */
object EventList {
  
  @JSImport("postman-collection", "EventList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEventList(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
