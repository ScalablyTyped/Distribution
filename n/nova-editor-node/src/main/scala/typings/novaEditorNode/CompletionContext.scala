package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/completion-context/
trait CompletionContext extends StObject {
  
  val line: String
  
  val position: Double
  
  val reason: CompletionReason
  
  val text: String
}
object CompletionContext {
  
  inline def apply(line: String, position: Double, reason: CompletionReason, text: String): CompletionContext = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionContext] (val x: Self) extends AnyVal {
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReason(value: CompletionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
