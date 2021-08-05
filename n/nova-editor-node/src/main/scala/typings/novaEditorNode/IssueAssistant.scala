package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueAssistant extends StObject {
  
  def provideIssues(editor: TextEditor): AssistantArray[Issue]
}
object IssueAssistant {
  
  inline def apply(provideIssues: TextEditor => AssistantArray[Issue]): IssueAssistant = {
    val __obj = js.Dynamic.literal(provideIssues = js.Any.fromFunction1(provideIssues))
    __obj.asInstanceOf[IssueAssistant]
  }
  
  extension [Self <: IssueAssistant](x: Self) {
    
    inline def setProvideIssues(value: TextEditor => AssistantArray[Issue]): Self = StObject.set(x, "provideIssues", js.Any.fromFunction1(value))
  }
}
