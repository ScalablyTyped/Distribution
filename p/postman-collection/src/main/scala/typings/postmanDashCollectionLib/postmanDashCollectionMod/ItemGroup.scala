package typings
package postmanDashCollectionLib.postmanDashCollectionMod

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
  def authorizeRequestsUsing(`type`: java.lang.String): scala.Unit = js.native
  def authorizeRequestsUsing(`type`: java.lang.String, options: VariableList): scala.Unit = js.native
  def authorizeRequestsUsing(`type`: RequestAuthDefinition): scala.Unit = js.native
  def authorizeRequestsUsing(`type`: RequestAuthDefinition, options: VariableList): scala.Unit = js.native
  def forEachItem(callback: js.Function1[/* el */ TItem, scala.Unit]): scala.Unit = js.native
  def forEachItemGroup(callback: js.Function1[/* el */ ItemGroup[TItem], scala.Unit]): scala.Unit = js.native
  def oneDeep(idOrName: java.lang.String): TItem = js.native
}

/* static members */
@JSImport("postman-collection", "ItemGroup")
@js.native
object ItemGroup extends js.Object {
  def isItemGroup(obj: js.Any): scala.Boolean = js.native
}

