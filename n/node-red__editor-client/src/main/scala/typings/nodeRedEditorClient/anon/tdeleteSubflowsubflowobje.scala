package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.deleteSubflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'deleteSubflow',   subflow :object | undefined,   subflows :std.Array<object> | undefined,   movedNodes :std.Array<object> | undefined,   links :std.Array<object> | undefined,   createdLinks :std.Array<object> | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait tdeleteSubflowsubflowobje
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var movedNodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var subflow: js.UndefOr[js.Object] = js.undefined
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: deleteSubflow
}
object tdeleteSubflowsubflowobje {
  
  inline def apply(): tdeleteSubflowsubflowobje = {
    val __obj = js.Dynamic.literal(t = "deleteSubflow")
    __obj.asInstanceOf[tdeleteSubflowsubflowobje]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: tdeleteSubflowsubflowobje] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    inline def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    inline def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value*))
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setMovedNodes(value: js.Array[js.Object]): Self = StObject.set(x, "movedNodes", value.asInstanceOf[js.Any])
    
    inline def setMovedNodesUndefined: Self = StObject.set(x, "movedNodes", js.undefined)
    
    inline def setMovedNodesVarargs(value: js.Object*): Self = StObject.set(x, "movedNodes", js.Array(value*))
    
    inline def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    inline def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    inline def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    inline def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    inline def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value*))
    
    inline def setT(value: deleteSubflow): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
