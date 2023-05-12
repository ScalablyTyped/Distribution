package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDocumentDiffProvider extends StObject {
  
  /**
    * Computes the diff between the text models `original` and `modified`.
    */
  def computeDiff(original: ITextModel, modified: ITextModel, options: IDocumentDiffProviderOptions): js.Promise[IDocumentDiff]
  
  /**
    * Is fired when settings of the diff algorithm change that could alter the result of the diffing computation.
    * Any user of this provider should recompute the diff when this event is fired.
    */
  def onDidChange(listener: js.Function1[/* e */ Unit, Any]): IDisposable
  def onDidChange(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable
  /**
    * Is fired when settings of the diff algorithm change that could alter the result of the diffing computation.
    * Any user of this provider should recompute the diff when this event is fired.
    */
  @JSName("onDidChange")
  var onDidChange_Original: IEvent[Unit]
}
object IDocumentDiffProvider {
  
  inline def apply(
    computeDiff: (ITextModel, ITextModel, IDocumentDiffProviderOptions) => js.Promise[IDocumentDiff],
    onDidChange: (/* listener */ js.Function1[Unit, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable
  ): IDocumentDiffProvider = {
    val __obj = js.Dynamic.literal(computeDiff = js.Any.fromFunction3(computeDiff), onDidChange = js.Any.fromFunction2(onDidChange))
    __obj.asInstanceOf[IDocumentDiffProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDocumentDiffProvider] (val x: Self) extends AnyVal {
    
    inline def setComputeDiff(value: (ITextModel, ITextModel, IDocumentDiffProviderOptions) => js.Promise[IDocumentDiff]): Self = StObject.set(x, "computeDiff", js.Any.fromFunction3(value))
    
    inline def setOnDidChange(value: (/* listener */ js.Function1[Unit, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
  }
}
