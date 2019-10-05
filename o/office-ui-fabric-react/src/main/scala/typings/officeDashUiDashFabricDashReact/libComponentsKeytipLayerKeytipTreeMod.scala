package typings.officeDashUiDashFabricDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipTree", JSImport.Namespace)
@js.native
object libComponentsKeytipLayerKeytipTreeMod extends js.Object {
  @js.native
  /**
    * KeytipTree constructor
    */
  class KeytipTree () extends js.Object {
    var _createNode: js.Any = js.native
    var _getFullSequence: js.Any = js.native
    var _getNodeSequence: js.Any = js.native
    var _getParentID: js.Any = js.native
    var currentKeytip: js.UndefOr[IKeytipTreeNode] = js.native
    var nodeMap: StringDictionary[IKeytipTreeNode] = js.native
    var root: IKeytipTreeNode = js.native
    /**
      * Add a keytip node to this KeytipTree
      *
      * @param keytipProps - Keytip to add to the Tree
      * @param uniqueID - Unique ID for this keytip
      * @param persisted - T/F if this keytip should be marked as persisted
      */
    def addNode(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
    def addNode(keytipProps: IKeytipProps, uniqueID: String, persisted: Boolean): Unit = js.native
    /**
      * Get the non-persisted children of the give node
      * If no node is given, will use the 'currentKeytip'
      *
      * @param node - Node to get the children for
      * @returns List of node IDs that are the children of the node
      */
    def getChildren(): js.Array[String] = js.native
    def getChildren(node: IKeytipTreeNode): js.Array[String] = js.native
    /**
      * Searches the currentKeytip's children to exactly match a sequence. Will not match disabled nodes but
      * will match persisted nodes
      *
      * @param keySequence - string to match
      * @param currentKeytip - The keytip whose children will try to match
      * @returns The node that exactly matched the keySequence, or undefined if none matched
      */
    def getExactMatchedNode(keySequence: String, currentKeytip: IKeytipTreeNode): js.UndefOr[IKeytipTreeNode] = js.native
    /**
      * Gets a single node from its ID
      *
      * @param id - ID of the node to get
      * @returns Node with the given ID, if found
      */
    def getNode(id: String): js.UndefOr[IKeytipTreeNode] = js.native
    /**
      * Gets all nodes from their IDs
      *
      * @param ids - List of keytip IDs
      * @returns Array of nodes that match the given IDs, can be empty
      */
    def getNodes(ids: js.Array[String]): js.Array[IKeytipTreeNode] = js.native
    /**
      * Searches the currentKeytip's children to find nodes that start with the given sequence. Will not match
      * disabled nodes but will match persisted nodes
      *
      * @param keySequence - string to partially match
      * @param currentKeytip - The keytip whose children will try to partially match
      * @returns List of tree nodes that partially match the given sequence
      */
    def getPartiallyMatchedNodes(keySequence: String, currentKeytip: IKeytipTreeNode): js.Array[IKeytipTreeNode] = js.native
    /**
      * Tests if the currentKeytip in this.keytipTree is the parent of 'keytipProps'
      *
      * @param keytipProps - Keytip to test the parent for
      * @returns T/F if the currentKeytip is this keytipProps' parent
      */
    def isCurrentKeytipParent(keytipProps: IKeytipProps): Boolean = js.native
    /**
      * Removes a node from the KeytipTree
      *
      * @param sequence - full string of the node to remove
      */
    def removeNode(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
    /**
      * Updates a node in the tree
      *
      * @param keytipProps - Keytip props to update
      * @param uniqueID - Unique ID for this keytip
      */
    def updateNode(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
  }
  
}

