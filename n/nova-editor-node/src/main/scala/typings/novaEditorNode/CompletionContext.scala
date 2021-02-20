package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/completion-context/
@js.native
trait CompletionContext extends StObject {
  
  val line: String = js.native
  
  val position: Double = js.native
  
  val reason: CompletionReason = js.native
  
  val text: String = js.native
}
object CompletionContext {
  
  @scala.inline
  def apply(line: String, position: Double, reason: CompletionReason, text: String): CompletionContext = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  
  @scala.inline
  implicit class CompletionContextMutableBuilder[Self <: CompletionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: CompletionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
