package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tasks extends StObject {
  
  var tasks: js.UndefOr[disabled | enabled] = js.undefined
}
object Tasks {
  
  inline def apply(): Tasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tasks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tasks] (val x: Self) extends AnyVal {
    
    inline def setTasks(value: disabled | enabled): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
  }
}
