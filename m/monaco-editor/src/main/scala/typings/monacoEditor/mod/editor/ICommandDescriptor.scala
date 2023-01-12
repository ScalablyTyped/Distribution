package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommandDescriptor extends StObject {
  
  /**
    * An unique identifier of the contributed command.
    */
  var id: String
  
  /**
    * Callback that will be executed when the command is triggered.
    */
  def run(args: Any*): Unit
  /**
    * Callback that will be executed when the command is triggered.
    */
  @JSName("run")
  var run_Original: ICommandHandler
}
object ICommandDescriptor {
  
  inline def apply(id: String, run: /* repeated */ Any => Unit): ICommandDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[ICommandDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICommandDescriptor] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRun(value: /* repeated */ Any => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
