package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.IEvent
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsProvider extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var onDidChangeInlayHints: js.UndefOr[IEvent[Unit]] = js.undefined
  
  def provideInlayHints(model: ITextModel, range: Range, token: CancellationToken): ProviderResult[InlayHintList]
  
  var resolveInlayHint: js.UndefOr[
    js.Function2[/* hint */ InlayHint, /* token */ CancellationToken, ProviderResult[InlayHint]]
  ] = js.undefined
}
object InlayHintsProvider {
  
  inline def apply(provideInlayHints: (ITextModel, Range, CancellationToken) => ProviderResult[InlayHintList]): InlayHintsProvider = {
    val __obj = js.Dynamic.literal(provideInlayHints = js.Any.fromFunction3(provideInlayHints))
    __obj.asInstanceOf[InlayHintsProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlayHintsProvider] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOnDidChangeInlayHints(value: (/* listener */ js.Function1[Unit, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable): Self = StObject.set(x, "onDidChangeInlayHints", js.Any.fromFunction2(value))
    
    inline def setOnDidChangeInlayHintsUndefined: Self = StObject.set(x, "onDidChangeInlayHints", js.undefined)
    
    inline def setProvideInlayHints(value: (ITextModel, Range, CancellationToken) => ProviderResult[InlayHintList]): Self = StObject.set(x, "provideInlayHints", js.Any.fromFunction3(value))
    
    inline def setResolveInlayHint(value: (/* hint */ InlayHint, /* token */ CancellationToken) => ProviderResult[InlayHint]): Self = StObject.set(x, "resolveInlayHint", js.Any.fromFunction2(value))
    
    inline def setResolveInlayHintUndefined: Self = StObject.set(x, "resolveInlayHint", js.undefined)
  }
}
