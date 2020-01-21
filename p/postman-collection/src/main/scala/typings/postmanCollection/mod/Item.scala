package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "Item")
@js.native
class Item () extends Property[ItemDefinition] {
  def this(definition: ItemDefinition) = this()
  var events: EventList = js.native
  var request: Request = js.native
  var responses: PropertyList[Response] = js.native
  def authorizeRequestUsing(`type`: String): Unit = js.native
  def authorizeRequestUsing(`type`: String, options: VariableList): Unit = js.native
  def authorizeRequestUsing(`type`: RequestAuthDefinition): Unit = js.native
  def authorizeRequestUsing(`type`: RequestAuthDefinition, options: VariableList): Unit = js.native
  def getAuth(): RequestAuth = js.native
  def getEvents(): js.Array[Event] = js.native
  def getEvents(name: String): js.Array[Event] = js.native
}

/* static members */
@JSImport("postman-collection", "Item")
@js.native
object Item extends js.Object {
  def isItem(obj: js.Any): Boolean = js.native
}

