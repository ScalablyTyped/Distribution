package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'move',   nodes :std.Array<object>,   links :std.Array<object> | undefined,   removedLinks :std.Array<object> | undefined,   addToGroup :object | undefined,   removeFromGroup :object | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait tmovenodesArrayobjectlink
  extends StObject
     with HistoryEvent {
  
  var addToGroup: js.UndefOr[js.Object] = js.undefined
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var nodes: js.Array[js.Object]
  
  var removeFromGroup: js.UndefOr[js.Object] = js.undefined
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: move
}
object tmovenodesArrayobjectlink {
  
  inline def apply(nodes: js.Array[js.Object]): tmovenodesArrayobjectlink = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], t = "move")
    __obj.asInstanceOf[tmovenodesArrayobjectlink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: tmovenodesArrayobjectlink] (val x: Self) extends AnyVal {
    
    inline def setAddToGroup(value: js.Object): Self = StObject.set(x, "addToGroup", value.asInstanceOf[js.Any])
    
    inline def setAddToGroupUndefined: Self = StObject.set(x, "addToGroup", js.undefined)
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setRemoveFromGroup(value: js.Object): Self = StObject.set(x, "removeFromGroup", value.asInstanceOf[js.Any])
    
    inline def setRemoveFromGroupUndefined: Self = StObject.set(x, "removeFromGroup", js.undefined)
    
    inline def setRemovedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "removedLinks", value.asInstanceOf[js.Any])
    
    inline def setRemovedLinksUndefined: Self = StObject.set(x, "removedLinks", js.undefined)
    
    inline def setRemovedLinksVarargs(value: js.Object*): Self = StObject.set(x, "removedLinks", js.Array(value*))
    
    inline def setT(value: move): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
