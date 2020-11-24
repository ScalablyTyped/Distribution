package typings.novaEditorNode.global

import typings.novaEditorNode.TaskName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Task")
@js.native
class Task protected ()
  extends typings.novaEditorNode.Task {
  def this(name: String) = this()
}
/* static members */
@JSGlobal("Task")
@js.native
object Task extends js.Object {
  
  val Build: TaskName = js.native
  
  val Clean: TaskName = js.native
  
  val Run: TaskName = js.native
}
