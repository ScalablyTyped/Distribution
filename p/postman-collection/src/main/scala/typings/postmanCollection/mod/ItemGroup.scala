package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "ItemGroup")
@js.native
class ItemGroup[TItem] () extends Property[ItemGroupDefinition] {
  def this(definition: ItemGroupDefinition) = this()
  var auth: js.UndefOr[RequestAuth] = js.native
  var events: EventList = js.native
  var items: PropertyList[TItem | ItemGroup[TItem]] = js.native
  def authorizeRequestsUsing(`type`: String): Unit = js.native
  def authorizeRequestsUsing(`type`: String, options: VariableList): Unit = js.native
  def authorizeRequestsUsing(`type`: RequestAuthDefinition): Unit = js.native
  def authorizeRequestsUsing(`type`: RequestAuthDefinition, options: VariableList): Unit = js.native
  def forEachItem(callback: js.Function1[/* el */ TItem, Unit]): Unit = js.native
  def forEachItemGroup(callback: js.Function1[/* el */ ItemGroup[TItem], Unit]): Unit = js.native
  def oneDeep(idOrName: String): TItem = js.native
}

/* static members */
@JSImport("postman-collection", "ItemGroup")
@js.native
object ItemGroup extends js.Object {
  def isItemGroup(obj: js.Any): Boolean = js.native
}

