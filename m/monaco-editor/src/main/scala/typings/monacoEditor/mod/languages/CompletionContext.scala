package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionContext extends js.Object {
  /**
    * Character that triggered the completion item provider.
    *
    * `undefined` if provider was not triggered by a character.
    */
  var triggerCharacter: js.UndefOr[String] = js.undefined
  /**
    * How the completion was triggered.
    */
  var triggerKind: CompletionTriggerKind
}

object CompletionContext {
  @scala.inline
  def apply(triggerKind: CompletionTriggerKind, triggerCharacter: String = null): CompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
}

