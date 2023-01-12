package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionProvider extends StObject {
  
  /**
    * Provide commands for the given document and range.
    */
  def provideCodeActions(model: ITextModel, range: Range, context: CodeActionContext, token: CancellationToken): ProviderResult[CodeActionList]
  
  /**
    * Given a code action fill in the edit. Will only invoked when missing.
    */
  var resolveCodeAction: js.UndefOr[
    js.Function2[
      /* codeAction */ CodeAction, 
      /* token */ CancellationToken, 
      ProviderResult[CodeAction]
    ]
  ] = js.undefined
}
object CodeActionProvider {
  
  inline def apply(
    provideCodeActions: (ITextModel, Range, CodeActionContext, CancellationToken) => ProviderResult[CodeActionList]
  ): CodeActionProvider = {
    val __obj = js.Dynamic.literal(provideCodeActions = js.Any.fromFunction4(provideCodeActions))
    __obj.asInstanceOf[CodeActionProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionProvider] (val x: Self) extends AnyVal {
    
    inline def setProvideCodeActions(value: (ITextModel, Range, CodeActionContext, CancellationToken) => ProviderResult[CodeActionList]): Self = StObject.set(x, "provideCodeActions", js.Any.fromFunction4(value))
    
    inline def setResolveCodeAction(value: (/* codeAction */ CodeAction, /* token */ CancellationToken) => ProviderResult[CodeAction]): Self = StObject.set(x, "resolveCodeAction", js.Any.fromFunction2(value))
    
    inline def setResolveCodeActionUndefined: Self = StObject.set(x, "resolveCodeAction", js.undefined)
  }
}
