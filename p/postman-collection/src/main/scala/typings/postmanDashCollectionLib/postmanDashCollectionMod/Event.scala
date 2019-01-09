package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.EventDefinition because var conflicts: description, disabled, id, name. Inlined listen, script */ @JSImport("postman-collection", "Event")
@js.native
class Event protected () extends Property[EventDefinition] {
  def this(definition: EventDefinition) = this()
  var listen: js.UndefOr[java.lang.String] = js.native
  var script: js.Array[java.lang.String] | Script | ScriptDefinition | java.lang.String = js.native
  def update(definition: EventDefinition): scala.Unit = js.native
}

