package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends StObject {
  
  def getAction(name: String): js.UndefOr[TaskProcessAction] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  def setAction(name: String): Unit = js.native
  def setAction(name: String, action: TaskProcessAction): Unit = js.native
}
