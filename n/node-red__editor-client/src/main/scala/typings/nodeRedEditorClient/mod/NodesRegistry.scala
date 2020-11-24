package typings.nodeRedEditorClient.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesRegistry extends js.Object {
  
  def addNodeSet(ns: js.Object): Unit = js.native
  
  def disableNodeSet(id: String): Unit = js.native
  
  def enableNodeSet(id: String): Unit = js.native
  
  def getIconSets(): Record[String, js.Array[String]] = js.native
  
  def getModule(module: String): js.Object = js.native
  
  def getModuleList(): js.Object = js.native
  
  def getNodeList(): js.Array[js.Object] = js.native
  
  def getNodeSet(id: String): js.Object = js.native
  
  def getNodeSetForType(nodeType: String): js.Object = js.native
  
  def getNodeType(nt: String): NodeDef[NodeProperties, js.UndefOr[scala.Nothing], NodeProperties] = js.native
  
  def getNodeTypes(): js.Array[String] = js.native
  
  /**
    * Registers a node with the editor.     *
    * @param nt The node type is used throughout the editor to identify the node. It must
    * match the value used by the call to RED.nodes.registerType in the corresponding runtime
    * script.
    * @param def The node definition contains all of the information about the node
    * needed by the editor.
    */
  def registerNodeType[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](
    nt: String,
     // tslint:disable-line:no-unnecessary-generics
  `def`: NodeDef[TProps, TCreds, TInstProps]
  ): Unit = js.native
  
  def removeNodeSet[T /* <: js.Object */](ns: T): T = js.native
  
  def removeNodeType(nt: String): Unit = js.native
  
  def setIconSets(sets: Record[String, js.Array[String]]): Unit = js.native
  
  def setModulePendingUpdated(module: String, version: String): Unit = js.native
  
  def setNodeList(list: js.Array[js.Object]): Unit = js.native
}
object NodesRegistry {
  
  @scala.inline
  def apply(
    addNodeSet: js.Object => Unit,
    disableNodeSet: String => Unit,
    enableNodeSet: String => Unit,
    getIconSets: () => Record[String, js.Array[String]],
    getModule: String => js.Object,
    getModuleList: () => js.Object,
    getNodeList: () => js.Array[js.Object],
    getNodeSet: String => js.Object,
    getNodeSetForType: String => js.Object,
    getNodeType: String => NodeDef[NodeProperties, js.UndefOr[scala.Nothing], NodeProperties],
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
  
  @scala.inline
  implicit class NodesRegistryOps[Self <: NodesRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddNodeSet(value: js.Object => Unit): Self = this.set("addNodeSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableNodeSet(value: String => Unit): Self = this.set("disableNodeSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableNodeSet(value: String => Unit): Self = this.set("enableNodeSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIconSets(value: () => Record[String, js.Array[String]]): Self = this.set("getIconSets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModule(value: String => js.Object): Self = this.set("getModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetModuleList(value: () => js.Object): Self = this.set("getModuleList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeList(value: () => js.Array[js.Object]): Self = this.set("getNodeList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeSet(value: String => js.Object): Self = this.set("getNodeSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeSetForType(value: String => js.Object): Self = this.set("getNodeSetForType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeType(value: String => NodeDef[NodeProperties, js.UndefOr[scala.Nothing], NodeProperties]): Self = this.set("getNodeType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeTypes(value: () => js.Array[String]): Self = this.set("getNodeTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterNodeType(value: (String, NodeDef[js.Any, js.Any, js.Any]) => Unit): Self = this.set("registerNodeType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveNodeSet(value: js.Any => js.Any): Self = this.set("removeNodeSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveNodeType(value: String => Unit): Self = this.set("removeNodeType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconSets(value: Record[String, js.Array[String]] => Unit): Self = this.set("setIconSets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModulePendingUpdated(value: (String, String) => Unit): Self = this.set("setModulePendingUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNodeList(value: js.Array[js.Object] => Unit): Self = this.set("setNodeList", js.Any.fromFunction1(value))
  }
}
