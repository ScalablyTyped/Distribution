package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeSemanticTokensProvider extends js.Object {
  def getLegend(): SemanticTokensLegend
  def provideDocumentRangeSemanticTokens(model: ITextModel, range: Range, token: CancellationToken): ProviderResult[SemanticTokens]
}

object DocumentRangeSemanticTokensProvider {
  @scala.inline
  def apply(
    getLegend: () => SemanticTokensLegend,
    provideDocumentRangeSemanticTokens: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(getLegend = js.Any.fromFunction0(getLegend), provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
}

