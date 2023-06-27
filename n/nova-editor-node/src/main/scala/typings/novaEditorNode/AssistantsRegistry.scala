package typings.novaEditorNode

import typings.novaEditorNode.anon.Event
import typings.novaEditorNode.anon.Identifier
import typings.novaEditorNode.anon.TriggerChars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssistantsRegistry extends StObject {
  
  def registerColorAssistant(selector: AssistantsRegistrySelector, `object`: ColorAssistant): Disposable = js.native
  
  def registerCompletionAssistant(selector: AssistantsRegistrySelector, `object`: CompletionAssistant): Disposable = js.native
  def registerCompletionAssistant(selector: AssistantsRegistrySelector, `object`: CompletionAssistant, options: TriggerChars): Disposable = js.native
  
  def registerIssueAssistant(selector: AssistantsRegistrySelector, `object`: IssueAssistant): Disposable = js.native
  def registerIssueAssistant(selector: AssistantsRegistrySelector, `object`: IssueAssistant, options: Event): Disposable = js.native
  
  def registerTaskAssistant(`object`: TaskAssistant): Disposable = js.native
  def registerTaskAssistant(`object`: TaskAssistant, options: Identifier): Disposable = js.native
}
