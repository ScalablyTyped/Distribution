package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: js.UndefOr[
    js.Function1[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @node-red/editor-client.@node-red/editor-client.HistoryEvent */ /* ev */ js.Object, 
      Unit
    ]
  ] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
}
object Callback {
  
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @node-red/editor-client.@node-red/editor-client.HistoryEvent */ /* ev */ js.Object => Unit
    ): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
  }
}
