package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'edit',   node :object,   changes :std.Array<object>,   links :std.Array<object> | undefined,   createdLinks :std.Array<object> | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait teditnodeobjectchangesArr
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var changes: js.Array[js.Object]
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var links: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var node: js.Object
  
  var t: edit
}
object teditnodeobjectchangesArr {
  
  inline def apply(changes: js.Array[js.Object], node: js.Object): teditnodeobjectchangesArr = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], t = "edit")
    __obj.asInstanceOf[teditnodeobjectchangesArr]
  }
  
  extension [Self <: teditnodeobjectchangesArr](x: Self) {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setChanges(value: js.Array[js.Object]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: js.Object*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    inline def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    inline def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value*))
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNode(value: js.Object): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setT(value: edit): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
