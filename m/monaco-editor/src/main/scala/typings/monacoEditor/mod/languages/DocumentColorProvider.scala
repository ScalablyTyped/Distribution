package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentColorProvider extends StObject {
  
  /**
    * Provide the string representations for a color.
    */
  def provideColorPresentations(model: ITextModel, colorInfo: IColorInformation, token: CancellationToken): ProviderResult[js.Array[IColorPresentation]] = js.native
  
  /**
    * Provides the color ranges for a specific model.
    */
  def provideDocumentColors(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[IColorInformation]] = js.native
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
  
  @scala.inline
  implicit class DocumentColorProviderMutableBuilder[Self <: DocumentColorProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideColorPresentations(
      value: (ITextModel, IColorInformation, CancellationToken) => ProviderResult[js.Array[IColorPresentation]]
    ): Self = StObject.set(x, "provideColorPresentations", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProvideDocumentColors(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[IColorInformation]]): Self = StObject.set(x, "provideDocumentColors", js.Any.fromFunction2(value))
  }
}
