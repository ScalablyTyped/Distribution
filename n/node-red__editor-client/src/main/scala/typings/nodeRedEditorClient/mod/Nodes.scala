package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.GroupsLinks
import typings.nodeRedEditorClient.anon.LinksNodes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nodes extends StObject {
  
  def add(n: js.Object): Unit = js.native
  
  def addGroup(group: js.Object): Unit = js.native
  
  def addLink(l: js.Object): Unit = js.native
  
  def addSubflow(sf: js.Object): Unit = js.native
  def addSubflow(sf: js.Object, createNewIds: Boolean): Unit = js.native
  
  def addWorkspace(ws: js.Object): Unit = js.native
  def addWorkspace(ws: js.Object, targetIndex: Double): Unit = js.native
  
  def clear(): Unit = js.native
  
  /**
    * Converts a node to an exportable JSON Object
    */
  def convertNode(n: js.Object, exportCreds: Boolean): js.Object = js.native
  
  def createCompleteNodeSet(): js.Array[js.Object] = js.native
  def createCompleteNodeSet(exportCredentials: Boolean): js.Array[js.Object] = js.native
  
  /**
    * Converts the current node selection to an exportable JSON Object
    */
  def createExportableNodeSet(set: js.Array[js.Object]): js.Array[js.Object] = js.native
  def createExportableNodeSet(set: js.Array[js.Object], exportedIds: js.Object): js.Array[js.Object] = js.native
  def createExportableNodeSet(set: js.Array[js.Object], exportedIds: js.Object, exportedSubflows: js.Object): js.Array[js.Object] = js.native
  def createExportableNodeSet(
    set: js.Array[js.Object],
    exportedIds: js.Object,
    exportedSubflows: js.Object,
    exportedConfigNodes: js.Object
  ): js.Array[js.Object] = js.native
  def createExportableNodeSet(
    set: js.Array[js.Object],
    exportedIds: js.Object,
    exportedSubflows: Unit,
    exportedConfigNodes: js.Object
  ): js.Array[js.Object] = js.native
  def createExportableNodeSet(set: js.Array[js.Object], exportedIds: Unit, exportedSubflows: js.Object): js.Array[js.Object] = js.native
  def createExportableNodeSet(
    set: js.Array[js.Object],
    exportedIds: Unit,
    exportedSubflows: js.Object,
    exportedConfigNodes: js.Object
  ): js.Array[js.Object] = js.native
  def createExportableNodeSet(
    set: js.Array[js.Object],
    exportedIds: Unit,
    exportedSubflows: Unit,
    exportedConfigNodes: js.Object
  ): js.Array[js.Object] = js.native
  
  def dirty(): Boolean = js.native
  def dirty(d: Boolean): Unit = js.native
  
  def disableNodeSet(id: String): Unit = js.native
  @JSName("disableNodeSet")
  var disableNodeSet_Original: js.Function1[/* id */ String, Unit] = js.native
  
  def eachConfig(cb: js.Function1[/* conf */ js.Object, Boolean]): Unit = js.native
  
  def eachLink(cb: js.Function1[/* l */ js.Object, Boolean]): Unit = js.native
  
  def eachNode(cb: js.Function1[/* n */ js.Object, Boolean]): Unit = js.native
  
  def eachSubflow(cb: js.Function1[/* subf */ js.Object, Boolean]): Unit = js.native
  
  def eachWorkspace(cb: js.Function1[/* w */ js.Object, Boolean]): Unit = js.native
  
  def enableNodeSet(id: String): Unit = js.native
  @JSName("enableNodeSet")
  var enableNodeSet_Original: js.Function1[/* id */ String, Unit] = js.native
  
  def filterLinks(filter: js.Object): js.Array[js.Object] = js.native
  
  def filterNodes(filter: js.Object): js.Array[js.Object] = js.native
  
  var fontAwesome: NodesFontAwesome = js.native
  
  def getAllFlowNodes(node: js.Object): js.Array[js.Object] = js.native
  
  def getIconSets(): Record[String, js.Array[String]] = js.native
  @JSName("getIconSets")
  var getIconSets_Original: js.Function0[Record[String, js.Array[String]]] = js.native
  
  def getNodeList(): js.Array[js.Object] = js.native
  @JSName("getNodeList")
  var getNodeList_Original: js.Function0[js.Array[js.Object]] = js.native
  
  def getType(nt: String): NodeDef[NodeProperties, Unit, NodeProperties] = js.native
  @JSName("getType")
  var getType_Original: js.Function1[/* nt */ String, NodeDef[NodeProperties, Unit, NodeProperties]] = js.native
  
  def getWorkspaceOrder(): js.Array[js.Object] = js.native
  
  def group(id: String): js.Object = js.native
  
  def groups(z: String): js.Object = js.native
  
  def id(): String = js.native
  
  /**
    * @returns [new_nodes,new_links,new_groups,new_workspaces,new_subflows,missingWorkspace]
    */
  def `import`(newNodesObj: String): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: String, createNewIds: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: String, createNewIds: Boolean, createMissingWorkspace: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: String, createNewIds: Unit, createMissingWorkspace: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Array[js.Object]): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Array[js.Object], createNewIds: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Array[js.Object], createNewIds: Boolean, createMissingWorkspace: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Array[js.Object], createNewIds: Unit, createMissingWorkspace: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Object): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Object, createNewIds: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Object, createNewIds: Boolean, createMissingWorkspace: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  def `import`(newNodesObj: js.Object, createNewIds: Unit, createMissingWorkspace: Boolean): js.Tuple6[
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Array[js.Object], 
    js.Object
  ] = js.native
  
  def moveNodeToTab(node: js.Object, z: String): Unit = js.native
  
  /**
    * @param id Node id
    * @returns node or config node, or null if no nodes with such id
    */
  def node(id: String): js.Object | Null = js.native
  
  def originalFlow(): js.Object = js.native
  def originalFlow(flow: js.Object): Unit = js.native
  
  /**
    * Registers a node with the editor.     *
    * @param nt The node type is used throughout the editor to identify the node. It must
    * match the value used by the call to RED.nodes.registerType in the corresponding runtime
    * script.
    * @param def The node definition contains all of the information about the node
    * needed by the editor.
    */
  def registerType[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](nt: String, `def`: NodeDef[TProps, TCreds, TInstProps]): Unit = js.native
  /**
    * Registers a node with the editor.     *
    * @param nt The node type is used throughout the editor to identify the node. It must
    * match the value used by the call to RED.nodes.registerType in the corresponding runtime
    * script.
    * @param def The node definition contains all of the information about the node
    * needed by the editor.
    */
  @JSName("registerType")
  var registerType_Original: js.Function2[/* nt */ String, /* def */ NodeDef[NodeProperties, Unit, NodeProperties], Unit] = js.native
  
  var registry: NodesRegistry = js.native
  
  def remove(id: String): LinksNodes = js.native
  
  def removeGroup(group: js.Object): Unit = js.native
  
  def removeLink(l: js.Object): Unit = js.native
  
  def removeNodeSet[T /* <: js.Object */](ns: T): T = js.native
  @JSName("removeNodeSet")
  var removeNodeSet_Original: js.Function1[/* ns */ js.Object, js.Object] = js.native
  
  def removeSubflow(sf: js.Object): Unit = js.native
  
  def removeWorkspace(id: String): GroupsLinks = js.native
  
  def setIconSets(sets: Record[String, js.Array[String]]): Unit = js.native
  @JSName("setIconSets")
  var setIconSets_Original: js.Function1[/* sets */ Record[String, js.Array[String]], Unit] = js.native
  
  def setNodeList(list: js.Array[js.Object]): Unit = js.native
  @JSName("setNodeList")
  var setNodeList_Original: js.Function1[/* list */ js.Array[js.Object], Unit] = js.native
  
  def setWorkspaceOrder(): Unit = js.native
  
  def subflow(id: String): js.Object = js.native
  
  def subflowContains(sfid: String, nodeid: String): Boolean = js.native
  
  def updateConfigNodeUsers(n: js.Object): Unit = js.native
  
  def version(): String = js.native
  def version(version: String): Unit = js.native
  
  def workspace(): js.Object = js.native
}
