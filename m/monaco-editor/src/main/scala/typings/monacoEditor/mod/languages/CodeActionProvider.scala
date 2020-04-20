package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionProvider extends js.Object {
  /**
    * Provide commands for the given document and range.
    */
  def provideCodeActions(model: ITextModel, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[CodeActionList]
}

object CodeActionProvider {
  @scala.inline
  def apply(
    provideCodeActions: (ITextModel, Range, CodeActionContext, CancellationToken) => ProviderResult[CodeActionList]
  ): CodeActionProvider = {
    val __obj = js.Dynamic.literal(provideCodeActions = js.Any.fromFunction4(provideCodeActions))
    __obj.asInstanceOf[CodeActionProvider]
  }
}

