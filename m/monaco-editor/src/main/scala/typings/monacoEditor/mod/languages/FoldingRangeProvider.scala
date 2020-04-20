package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeProvider extends js.Object {
  /**
    * Provides the color ranges for a specific model.
    */
  def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
}

object FoldingRangeProvider {
  @scala.inline
  def apply(
    provideFoldingRanges: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
}

