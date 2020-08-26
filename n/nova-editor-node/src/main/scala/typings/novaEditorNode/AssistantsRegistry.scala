package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssistantsRegistry extends js.Object {
  def registerColorAssistant(selector: AssistantsRegistrySelector, `object`: ColorAssistant): Disposable = js.native
  def registerCompletionAssistant(selector: AssistantsRegistrySelector, `object`: CompletionAssistant): Disposable = js.native
  def registerIssueAssistant(selector: AssistantsRegistrySelector, `object`: IssueAssistant): Disposable = js.native
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
  @scala.inline
  implicit class AssistantsRegistryOps[Self <: AssistantsRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegisterColorAssistant(value: (AssistantsRegistrySelector, ColorAssistant) => Disposable): Self = this.set("registerColorAssistant", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterCompletionAssistant(value: (AssistantsRegistrySelector, CompletionAssistant) => Disposable): Self = this.set("registerCompletionAssistant", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterIssueAssistant(value: (AssistantsRegistrySelector, IssueAssistant) => Disposable): Self = this.set("registerIssueAssistant", js.Any.fromFunction2(value))
  }
  
}

