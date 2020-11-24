package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
  def getAction(name: String): js.UndefOr[TaskProcessAction] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  def setAction(name: String): Unit = js.native
  def setAction(name: String, action: TaskProcessAction): Unit = js.native
}
