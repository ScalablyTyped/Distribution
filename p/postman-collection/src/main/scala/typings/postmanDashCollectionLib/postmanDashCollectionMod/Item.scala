package typings
package postmanDashCollectionLib.postmanDashCollectionMod

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
  def authorizeRequestUsing(`type`: java.lang.String): scala.Unit = js.native
  def authorizeRequestUsing(`type`: java.lang.String, options: VariableList): scala.Unit = js.native
  def authorizeRequestUsing(`type`: RequestAuthDefinition): scala.Unit = js.native
  def authorizeRequestUsing(`type`: RequestAuthDefinition, options: VariableList): scala.Unit = js.native
  def getAuth(): RequestAuth = js.native
  def getEvents(): js.Array[Event] = js.native
  def getEvents(name: java.lang.String): js.Array[Event] = js.native
}

@JSImport("postman-collection", "Item")
@js.native
object Item extends js.Object {
  def isItem(obj: js.Any): scala.Boolean = js.native
}

