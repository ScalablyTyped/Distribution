package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.reorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'reorder',   order :object | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait treorderorderobjectundefi
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var order: js.UndefOr[js.Object] = js.undefined
  
  var t: reorder
}
object treorderorderobjectundefi {
  
  inline def apply(): treorderorderobjectundefi = {
    val __obj = js.Dynamic.literal(t = "reorder")
    __obj.asInstanceOf[treorderorderobjectundefi]
  }
  
  extension [Self <: treorderorderobjectundefi](x: Self) {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setOrder(value: js.Object): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setT(value: reorder): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
