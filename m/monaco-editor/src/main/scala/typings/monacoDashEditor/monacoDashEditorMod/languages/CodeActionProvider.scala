package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Range
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionProvider extends js.Object {
  /**
    * Provide commands for the given document and range.
    */
  def provideCodeActions(model: ITextModel, range: Range, context: CodeActionContext, token: CancellationToken): CodeActionList | js.Promise[CodeActionList]
}

object CodeActionProvider {
  @scala.inline
  def apply(
    provideCodeActions: (ITextModel, Range, CodeActionContext, CancellationToken) => CodeActionList | js.Promise[CodeActionList]
  ): CodeActionProvider = {
    val __obj = js.Dynamic.literal(provideCodeActions = js.Any.fromFunction4(provideCodeActions))
  
    __obj.asInstanceOf[CodeActionProvider]
  }
}

