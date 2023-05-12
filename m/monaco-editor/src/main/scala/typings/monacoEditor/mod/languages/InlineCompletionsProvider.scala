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
    * @param updatedInsertText Is useful to understand bracket completion.
    */
  var handleItemDidShow: js.UndefOr[
    js.Function3[
      /* completions */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T['items'][number] */ /* item */ js.Any, 
      /* updatedInsertText */ String, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Will be called when an item is partially accepted.
    */
  var handlePartialAccept: js.UndefOr[
    js.Function3[
      /* completions */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T['items'][number] */ /* item */ js.Any, 
      /* acceptedCharacters */ Double, 
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineCompletionsProvider[?], T /* <: InlineCompletions[InlineCompletion] */] (val x: Self & InlineCompletionsProvider[T]) extends AnyVal {
    
    inline def setFreeInlineCompletions(value: T => Unit): Self = StObject.set(x, "freeInlineCompletions", js.Any.fromFunction1(value))
    
    inline def setHandleItemDidShow(
      value: (/* completions */ T, /* import warning: importer.ImportType#apply Failed type conversion: T['items'][number] */ /* item */ js.Any, /* updatedInsertText */ String) => Unit
    ): Self = StObject.set(x, "handleItemDidShow", js.Any.fromFunction3(value))
    
    inline def setHandleItemDidShowUndefined: Self = StObject.set(x, "handleItemDidShow", js.undefined)
    
    inline def setHandlePartialAccept(
      value: (/* completions */ T, /* import warning: importer.ImportType#apply Failed type conversion: T['items'][number] */ /* item */ js.Any, /* acceptedCharacters */ Double) => Unit
    ): Self = StObject.set(x, "handlePartialAccept", js.Any.fromFunction3(value))
    
    inline def setHandlePartialAcceptUndefined: Self = StObject.set(x, "handlePartialAccept", js.undefined)
    
    inline def setProvideInlineCompletions(value: (ITextModel, Position, InlineCompletionContext, CancellationToken) => ProviderResult[T]): Self = StObject.set(x, "provideInlineCompletions", js.Any.fromFunction4(value))
  }
}
