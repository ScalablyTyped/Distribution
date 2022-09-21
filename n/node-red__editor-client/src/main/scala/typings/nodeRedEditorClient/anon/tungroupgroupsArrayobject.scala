package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.HistoryEvent
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.ungroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'ungroup',   groups :std.Array<object> | undefined} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait tungroupgroupsArrayobject
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: ungroup
}
object tungroupgroupsArrayobject {
  
  inline def apply(): tungroupgroupsArrayobject = {
    val __obj = js.Dynamic.literal(t = "ungroup")
    __obj.asInstanceOf[tungroupgroupsArrayobject]
  }
  
  extension [Self <: tungroupgroupsArrayobject](x: Self) {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setT(value: ungroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
