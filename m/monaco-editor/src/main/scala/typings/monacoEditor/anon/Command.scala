package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  val command: typings.monacoEditor.mod.languages.Command
  
  val kind: String
}
object Command {
  
  inline def apply(command: typings.monacoEditor.mod.languages.Command, kind: String): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: typings.monacoEditor.mod.languages.Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
