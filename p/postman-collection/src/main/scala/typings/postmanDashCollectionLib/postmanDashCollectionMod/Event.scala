package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.EventDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "Event")
@js.native
class Event protected () extends Property[EventDefinition] {
  def this(definition: EventDefinition) = this()
  var listen: js.UndefOr[java.lang.String] = js.native
  var script: Script = js.native
  def update(definition: EventDefinition): scala.Unit = js.native
}

