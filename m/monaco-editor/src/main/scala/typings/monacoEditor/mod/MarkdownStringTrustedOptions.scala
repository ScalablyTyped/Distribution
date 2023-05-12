package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkdownStringTrustedOptions extends StObject {
  
  val enabledCommands: js.Array[String]
}
object MarkdownStringTrustedOptions {
  
  inline def apply(enabledCommands: js.Array[String]): MarkdownStringTrustedOptions = {
    val __obj = js.Dynamic.literal(enabledCommands = enabledCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownStringTrustedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkdownStringTrustedOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabledCommands(value: js.Array[String]): Self = StObject.set(x, "enabledCommands", value.asInstanceOf[js.Any])
    
    inline def setEnabledCommandsVarargs(value: String*): Self = StObject.set(x, "enabledCommands", js.Array(value*))
  }
}
