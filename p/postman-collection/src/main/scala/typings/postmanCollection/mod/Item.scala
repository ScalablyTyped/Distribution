package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "Item")
@js.native
class Item () extends Property[ItemDefinition] {
  def this(definition: ItemDefinition) = this()
  
  def authorizeRequestUsing(`type`: String): Unit = js.native
  def authorizeRequestUsing(`type`: String, options: VariableList): Unit = js.native
  def authorizeRequestUsing(`type`: RequestAuthDefinition): Unit = js.native
  def authorizeRequestUsing(`type`: RequestAuthDefinition, options: VariableList): Unit = js.native
  
  var events: EventList = js.native
  
  def getAuth(): RequestAuth = js.native
  
  def getEvents(): js.Array[Event] = js.native
  def getEvents(name: String): js.Array[Event] = js.native
  
  var request: Request = js.native
  
  var responses: PropertyList[Response] = js.native
}
/* static members */
object Item {
  
  @JSImport("postman-collection", "Item.isItem")
  @js.native
  def isItem(obj: js.Any): Boolean = js.native
}
