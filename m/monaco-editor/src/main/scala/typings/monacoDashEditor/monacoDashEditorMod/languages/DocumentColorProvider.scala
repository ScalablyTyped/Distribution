package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorProvider extends js.Object {
  /**
    * Provide the string representations for a color.
    */
  def provideColorPresentations(model: ITextModel, colorInfo: IColorInformation, token: CancellationToken): ProviderResult[js.Array[IColorPresentation]]
  /**
    * Provides the color ranges for a specific model.
    */
  def provideDocumentColors(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[IColorInformation]]
}

object DocumentColorProvider {
  @scala.inline
  def apply(
    provideColorPresentations: (ITextModel, IColorInformation, CancellationToken) => ProviderResult[js.Array[IColorPresentation]],
    provideDocumentColors: (ITextModel, CancellationToken) => ProviderResult[js.Array[IColorInformation]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideDocumentColors = js.Any.fromFunction2(provideDocumentColors))
  
    __obj.asInstanceOf[DocumentColorProvider]
  }
}

