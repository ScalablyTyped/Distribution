package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeRedEditorClient.anon.tmultieventsArrayHistoryE
  - typings.nodeRedEditorClient.anon.treplaceconfigobjectchang
  - typings.nodeRedEditorClient.anon.taddnodesArrayobjectundef
  - typings.nodeRedEditorClient.anon.tdeleteworkspacesArrayobj
  - typings.nodeRedEditorClient.anon.tmovenodesArrayobjectlink
  - typings.nodeRedEditorClient.anon.teditnodeobjectchangesArr
  - typings.nodeRedEditorClient.anon.tcreateSubflownodesArrayo
  - typings.nodeRedEditorClient.anon.tdeleteSubflowsubflowobje
  - typings.nodeRedEditorClient.anon.treorderorderobjectundefi
  - typings.nodeRedEditorClient.anon.tcreateGroupgroupsArrayob
  - typings.nodeRedEditorClient.anon.tungroupgroupsArrayobject
  - typings.nodeRedEditorClient.anon.taddToGroupnodesArrayobje
  - typings.nodeRedEditorClient.anon.tremoveFromGroupnodesArra
*/
trait HistoryEvent extends StObject
object HistoryEvent {
  
  inline def taddToGroupnodesArrayobje(): typings.nodeRedEditorClient.anon.taddToGroupnodesArrayobje = {
    val __obj = js.Dynamic.literal(t = "addToGroup")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.taddToGroupnodesArrayobje]
  }
  
  inline def taddnodesArrayobjectundef(): typings.nodeRedEditorClient.anon.taddnodesArrayobjectundef = {
    val __obj = js.Dynamic.literal(t = "add")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.taddnodesArrayobjectundef]
  }
  
  inline def tcreateGroupgroupsArrayob(): typings.nodeRedEditorClient.anon.tcreateGroupgroupsArrayob = {
    val __obj = js.Dynamic.literal(t = "createGroup")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tcreateGroupgroupsArrayob]
  }
  
  inline def tcreateSubflownodesArrayo(subflow: js.Object): typings.nodeRedEditorClient.anon.tcreateSubflownodesArrayo = {
    val __obj = js.Dynamic.literal(subflow = subflow.asInstanceOf[js.Any], t = "createSubflow")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tcreateSubflownodesArrayo]
  }
  
  inline def tdeleteSubflowsubflowobje(): typings.nodeRedEditorClient.anon.tdeleteSubflowsubflowobje = {
    val __obj = js.Dynamic.literal(t = "deleteSubflow")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tdeleteSubflowsubflowobje]
  }
  
  inline def tdeleteworkspacesArrayobj(): typings.nodeRedEditorClient.anon.tdeleteworkspacesArrayobj = {
    val __obj = js.Dynamic.literal(t = "delete")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tdeleteworkspacesArrayobj]
  }
  
  inline def teditnodeobjectchangesArr(changes: js.Array[js.Object], node: js.Object): typings.nodeRedEditorClient.anon.teditnodeobjectchangesArr = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], t = "edit")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.teditnodeobjectchangesArr]
  }
  
  inline def tmovenodesArrayobjectlink(nodes: js.Array[js.Object]): typings.nodeRedEditorClient.anon.tmovenodesArrayobjectlink = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], t = "move")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tmovenodesArrayobjectlink]
  }
  
  inline def tmultieventsArrayHistoryE(events: js.Array[HistoryEvent]): typings.nodeRedEditorClient.anon.tmultieventsArrayHistoryE = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], t = "multi")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tmultieventsArrayHistoryE]
  }
  
  inline def tremoveFromGroupnodesArra(): typings.nodeRedEditorClient.anon.tremoveFromGroupnodesArra = {
    val __obj = js.Dynamic.literal(t = "removeFromGroup")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tremoveFromGroupnodesArra]
  }
  
  inline def treorderorderobjectundefi(): typings.nodeRedEditorClient.anon.treorderorderobjectundefi = {
    val __obj = js.Dynamic.literal(t = "reorder")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.treorderorderobjectundefi]
  }
  
  inline def treplaceconfigobjectchang(changed: js.Object, config: js.Object, rev: String): typings.nodeRedEditorClient.anon.treplaceconfigobjectchang = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], t = "replace")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.treplaceconfigobjectchang]
  }
  
  inline def tungroupgroupsArrayobject(): typings.nodeRedEditorClient.anon.tungroupgroupsArrayobject = {
    val __obj = js.Dynamic.literal(t = "ungroup")
    __obj.asInstanceOf[typings.nodeRedEditorClient.anon.tungroupgroupsArrayobject]
  }
}
