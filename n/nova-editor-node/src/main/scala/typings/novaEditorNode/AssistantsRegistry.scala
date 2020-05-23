package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssistantsRegistry extends js.Object {
  def registerColorAssistant(selector: AssistantsRegistrySelector, `object`: ColorAssistant): Disposable
  def registerCompletionAssistant(selector: AssistantsRegistrySelector, `object`: CompletionAssistant): Disposable
  def registerIssueAssistant(selector: AssistantsRegistrySelector, `object`: IssueAssistant): Disposable
}

object AssistantsRegistry {
  @scala.inline
  def apply(
    registerColorAssistant: (AssistantsRegistrySelector, ColorAssistant) => Disposable,
    registerCompletionAssistant: (AssistantsRegistrySelector, CompletionAssistant) => Disposable,
    registerIssueAssistant: (AssistantsRegistrySelector, IssueAssistant) => Disposable
  ): AssistantsRegistry = {
    val __obj = js.Dynamic.literal(registerColorAssistant = js.Any.fromFunction2(registerColorAssistant), registerCompletionAssistant = js.Any.fromFunction2(registerCompletionAssistant), registerIssueAssistant = js.Any.fromFunction2(registerIssueAssistant))
    __obj.asInstanceOf[AssistantsRegistry]
  }
}

