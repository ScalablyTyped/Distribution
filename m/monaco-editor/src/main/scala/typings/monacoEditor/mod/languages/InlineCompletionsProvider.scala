package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCompletionsProvider[T /* <: InlineCompletions[InlineCompletion] */] extends StObject {
  
  /**
    * Will be called when a completions list is no longer in use and can be garbage-collected.
    */
  def freeInlineCompletions(completions: T): Unit
  
  /**
    * Will be called when an item is shown.
    */
  var handleItemDidShow: js.UndefOr[
    js.Function2[
      /* completions */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T['items'][number] */ /* item */ js.Any, 
      Unit
    ]
  ] = js.undefined
  
  def provideInlineCompletions(model: ITextModel, position: Position, context: InlineCompletionContext, token: CancellationToken): ProviderResult[T]
}
object InlineCompletionsProvider {
  
  inline def apply[T /* <: InlineCompletions[InlineCompletion] */](
    freeInlineCompletions: T => Unit,
    provideInlineCompletions: (ITextModel, Position, InlineCompletionContext, CancellationToken) => ProviderResult[T]
  ): InlineCompletionsProvider[T] = {
    val __obj = js.Dynamic.literal(freeInlineCompletions = js.Any.fromFunction1(freeInlineCompletions), provideInlineCompletions = js.Any.fromFunction4(provideInlineCompletions))
    __obj.asInstanceOf[InlineCompletionsProvider[T]]
  }
  
  extension [Self <: InlineCompletionsProvider[?], T /* <: InlineCompletions[InlineCompletion] */](x: Self & InlineCompletionsProvider[T]) {
    
    inline def setFreeInlineCompletions(value: T => Unit): Self = StObject.set(x, "freeInlineCompletions", js.Any.fromFunction1(value))
    
    inline def setHandleItemDidShow(
      value: (/* completions */ T, /* import warning: importer.ImportType#apply Failed type conversion: T['items'][number] */ /* item */ js.Any) => Unit
    ): Self = StObject.set(x, "handleItemDidShow", js.Any.fromFunction2(value))
    
    inline def setHandleItemDidShowUndefined: Self = StObject.set(x, "handleItemDidShow", js.undefined)
    
    inline def setProvideInlineCompletions(value: (ITextModel, Position, InlineCompletionContext, CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "provideInlineCompletions", js.Any.fromFunction4(value))
  }
}
