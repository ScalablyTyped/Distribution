package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tasks extends StObject {
  
  var tasks: js.UndefOr[disabled | enabled] = js.native
}
object Tasks {
  
  @scala.inline
  def apply(): Tasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tasks]
  }
  
  @scala.inline
  implicit class TasksMutableBuilder[Self <: Tasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTasks(value: disabled | enabled): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
  }
}
