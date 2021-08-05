package typings.nodeRedEditorClient.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRegistry extends StObject {
  
  def addNodeSet(ns: js.Object): Unit
  
  def disableNodeSet(id: String): Unit
  
  def enableNodeSet(id: String): Unit
  
  def getIconSets(): Record[String, js.Array[String]]
  
  def getModule(module: String): js.Object
  
  def getModuleList(): js.Object
  
  def getNodeList(): js.Array[js.Object]
  
  def getNodeSet(id: String): js.Object
  
  def getNodeSetForType(nodeType: String): js.Object
  
  def getNodeType(nt: String): NodeDef[NodeProperties, Unit, NodeProperties]
  
  def getNodeTypes(): js.Array[String]
  
  /**
    * Registers a node with the editor.     *
    * @param nt The node type is used throughout the editor to identify the node. It must
    * match the value used by the call to RED.nodes.registerType in the corresponding runtime
    * script.
    * @param def The node definition contains all of the information about the node
    * needed by the editor.
    */
  def registerNodeType[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](nt: String, `def`: NodeDef[TProps, TCreds, TInstProps]): Unit
  
  def removeNodeSet[T /* <: js.Object */](ns: T): T
  
  def removeNodeType(nt: String): Unit
  
  def setIconSets(sets: Record[String, js.Array[String]]): Unit
  
  def setModulePendingUpdated(module: String, version: String): Unit
  
  def setNodeList(list: js.Array[js.Object]): Unit
}
object NodesRegistry {
  
  inline def apply(
    addNodeSet: js.Object => Unit,
    disableNodeSet: String => Unit,
    enableNodeSet: String => Unit,
    getIconSets: () => Record[String, js.Array[String]],
    getModule: String => js.Object,
    getModuleList: () => js.Object,
    getNodeList: () => js.Array[js.Object],
    getNodeSet: String => js.Object,
    getNodeSetForType: String => js.Object,
    getNodeType: String => NodeDef[NodeProperties, Unit, NodeProperties],
    getNodeTypes: () => js.Array[String],
    registerNodeType: (String, NodeDef[js.Any, js.Any, js.Any]) => Unit,
    removeNodeSet: js.Any => js.Any,
    removeNodeType: String => Unit,
    setIconSets: Record[String, js.Array[String]] => Unit,
    setModulePendingUpdated: (String, String) => Unit,
    setNodeList: js.Array[js.Object] => Unit
  ): NodesRegistry = {
    val __obj = js.Dynamic.literal(addNodeSet = js.Any.fromFunction1(addNodeSet), disableNodeSet = js.Any.fromFunction1(disableNodeSet), enableNodeSet = js.Any.fromFunction1(enableNodeSet), getIconSets = js.Any.fromFunction0(getIconSets), getModule = js.Any.fromFunction1(getModule), getModuleList = js.Any.fromFunction0(getModuleList), getNodeList = js.Any.fromFunction0(getNodeList), getNodeSet = js.Any.fromFunction1(getNodeSet), getNodeSetForType = js.Any.fromFunction1(getNodeSetForType), getNodeType = js.Any.fromFunction1(getNodeType), getNodeTypes = js.Any.fromFunction0(getNodeTypes), registerNodeType = js.Any.fromFunction2(registerNodeType), removeNodeSet = js.Any.fromFunction1(removeNodeSet), removeNodeType = js.Any.fromFunction1(removeNodeType), setIconSets = js.Any.fromFunction1(setIconSets), setModulePendingUpdated = js.Any.fromFunction2(setModulePendingUpdated), setNodeList = js.Any.fromFunction1(setNodeList))
    __obj.asInstanceOf[NodesRegistry]
  }
  
  extension [Self <: NodesRegistry](x: Self) {
    
    inline def setAddNodeSet(value: js.Object => Unit): Self = StObject.set(x, "addNodeSet", js.Any.fromFunction1(value))
    
    inline def setDisableNodeSet(value: String => Unit): Self = StObject.set(x, "disableNodeSet", js.Any.fromFunction1(value))
    
    inline def setEnableNodeSet(value: String => Unit): Self = StObject.set(x, "enableNodeSet", js.Any.fromFunction1(value))
    
    inline def setGetIconSets(value: () => Record[String, js.Array[String]]): Self = StObject.set(x, "getIconSets", js.Any.fromFunction0(value))
    
    inline def setGetModule(value: String => js.Object): Self = StObject.set(x, "getModule", js.Any.fromFunction1(value))
    
    inline def setGetModuleList(value: () => js.Object): Self = StObject.set(x, "getModuleList", js.Any.fromFunction0(value))
    
    inline def setGetNodeList(value: () => js.Array[js.Object]): Self = StObject.set(x, "getNodeList", js.Any.fromFunction0(value))
    
    inline def setGetNodeSet(value: String => js.Object): Self = StObject.set(x, "getNodeSet", js.Any.fromFunction1(value))
    
    inline def setGetNodeSetForType(value: String => js.Object): Self = StObject.set(x, "getNodeSetForType", js.Any.fromFunction1(value))
    
    inline def setGetNodeType(value: String => NodeDef[NodeProperties, Unit, NodeProperties]): Self = StObject.set(x, "getNodeType", js.Any.fromFunction1(value))
    
    inline def setGetNodeTypes(value: () => js.Array[String]): Self = StObject.set(x, "getNodeTypes", js.Any.fromFunction0(value))
    
    inline def setRegisterNodeType(value: (String, NodeDef[js.Any, js.Any, js.Any]) => Unit): Self = StObject.set(x, "registerNodeType", js.Any.fromFunction2(value))
    
    inline def setRemoveNodeSet(value: js.Any => js.Any): Self = StObject.set(x, "removeNodeSet", js.Any.fromFunction1(value))
    
    inline def setRemoveNodeType(value: String => Unit): Self = StObject.set(x, "removeNodeType", js.Any.fromFunction1(value))
    
    inline def setSetIconSets(value: Record[String, js.Array[String]] => Unit): Self = StObject.set(x, "setIconSets", js.Any.fromFunction1(value))
    
    inline def setSetModulePendingUpdated(value: (String, String) => Unit): Self = StObject.set(x, "setModulePendingUpdated", js.Any.fromFunction2(value))
    
    inline def setSetNodeList(value: js.Array[js.Object] => Unit): Self = StObject.set(x, "setNodeList", js.Any.fromFunction1(value))
  }
}
