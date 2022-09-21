package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.removeFromGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'removeFromGroup',   nodes :std.Array<object> | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait tremoveFromGroupnodesArra
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: removeFromGroup
}
object tremoveFromGroupnodesArra {
  
  inline def apply(): tremoveFromGroupnodesArra = {
    val __obj = js.Dynamic.literal(t = "removeFromGroup")
    __obj.asInstanceOf[tremoveFromGroupnodesArra]
  }
  
  extension [Self <: tremoveFromGroupnodesArra](x: Self) {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setT(value: removeFromGroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
