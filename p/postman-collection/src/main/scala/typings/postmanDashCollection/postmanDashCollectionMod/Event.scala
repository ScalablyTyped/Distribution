package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.EventDefinition because var conflicts: description, disabled, id, name. Inlined listen, script */ @JSImport("postman-collection", "Event")
@js.native
class Event protected () extends Property[EventDefinition] {
  def this(definition: EventDefinition) = this()
  var listen: js.UndefOr[String] = js.native
  var script: js.Array[String] | Script | ScriptDefinition | String = js.native
  def update(definition: EventDefinition): Unit = js.native
}

