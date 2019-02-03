package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.ScriptDefinition because var conflicts: description, disabled, id, name. Inlined `type`, src, exec */ @JSImport("postman-collection", "Script")
@js.native
class Script () extends Property[ScriptDefinition] {
  def this(options: java.lang.String) = this()
  def this(options: js.Array[java.lang.String]) = this()
  def this(options: ScriptDefinition) = this()
  var exec: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.native
  var src: js.UndefOr[java.lang.String | Url] = js.native
  var `type`: java.lang.String | js.UndefOr[java.lang.String] = js.native
  def toSource(): js.UndefOr[java.lang.String] = js.native
  def update(options: java.lang.String): scala.Unit = js.native
  def update(options: js.Array[java.lang.String]): scala.Unit = js.native
  def update(options: ScriptDefinition): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Script")
@js.native
object Script extends js.Object {
  def isScript(obj: js.Any): scala.Boolean = js.native
}

