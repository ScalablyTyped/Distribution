package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.ScriptDefinition because var conflicts: description, disabled, id, name. Inlined `type`, src, exec */ @JSImport("postman-collection", "Script")
@js.native
class Script () extends Property[ScriptDefinition] {
  def this(options: String) = this()
  def this(options: js.Array[String]) = this()
  def this(options: ScriptDefinition) = this()
  var exec: js.UndefOr[js.Array[String] | String] = js.native
  var src: js.UndefOr[String | Url] = js.native
  var `type`: js.UndefOr[String] = js.native
  def toSource(): js.UndefOr[String] = js.native
  def update(options: String): Unit = js.native
  def update(options: js.Array[String]): Unit = js.native
  def update(options: ScriptDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Script")
@js.native
object Script extends js.Object {
  def isScript(obj: js.Any): Boolean = js.native
}

