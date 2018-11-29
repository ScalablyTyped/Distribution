package typings
package officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerKeytipTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipTree", "KeytipTree")
@js.native
class KeytipTree () extends js.Object {
  var currentKeytip: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ] = js.native
  var nodeMap: ScalablyTyped.runtime.StringDictionary[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ] = js.native
  var root: officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode = js.native
  /* private */ def _createNode(id: js.Any, parentId: js.Any, children: js.Any, keytipProps: js.Any): js.Any = js.native
  /* private */ def _createNode(id: js.Any, parentId: js.Any, children: js.Any, keytipProps: js.Any, persisted: js.Any): js.Any = js.native
  /* private */ def _getFullSequence(keytipProps: js.Any): js.Any = js.native
  /* private */ def _getNodeSequence(node: js.Any): js.Any = js.native
  /* private */ def _getParentID(fullSequence: js.Any): js.Any = js.native
  /**
       * Add a keytip node to this KeytipTree
       *
       * @param keytipProps - Keytip to add to the Tree
       * @param uniqueID - Unique ID for this keytip
       * @param persisted - T/F if this keytip should be marked as persisted
       */
  def addNode(
    keytipProps: officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps,
    uniqueID: java.lang.String
  ): scala.Unit = js.native
  /**
       * Add a keytip node to this KeytipTree
       *
       * @param keytipProps - Keytip to add to the Tree
       * @param uniqueID - Unique ID for this keytip
       * @param persisted - T/F if this keytip should be marked as persisted
       */
  def addNode(
    keytipProps: officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps,
    uniqueID: java.lang.String,
    persisted: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Get the non-persisted children of the give node
       * If no node is given, will use the 'currentKeytip'
       *
       * @param node - Node to get the children for
       * @returns List of node IDs that are the children of the node
       */
  def getChildren(): js.Array[java.lang.String] = js.native
  /**
       * Get the non-persisted children of the give node
       * If no node is given, will use the 'currentKeytip'
       *
       * @param node - Node to get the children for
       * @returns List of node IDs that are the children of the node
       */
  def getChildren(
    node: officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ): js.Array[java.lang.String] = js.native
  /**
       * Searches the currentKeytip's children to exactly match a sequence. Will not match disabled nodes but
       * will match persisted nodes
       *
       * @param keySequence - string to match
       * @param currentKeytip - The keytip whose children will try to match
       * @returns The node that exactly matched the keySequence, or undefined if none matched
       */
  def getExactMatchedNode(
    keySequence: java.lang.String,
    currentKeytip: officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ] = js.native
  /**
       * Gets a single node from its ID
       *
       * @param id - ID of the node to get
       * @returns Node with the given ID, if found
       */
  def getNode(id: java.lang.String): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ] = js.native
  /**
       * Gets all nodes from their IDs
       *
       * @param ids List of keytip IDs
       * @returns Array of nodes that match the given IDs, can be empty
       */
  def getNodes(ids: js.Array[java.lang.String]): js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ] = js.native
  /**
       * Searches the currentKeytip's children to find nodes that start with the given sequence. Will not match
       * disabled nodes but will match persisted nodes
       *
       * @param keySequence - string to partially match
       * @param currentKeytip - The keytip whose children will try to partially match
       * @returns List of tree nodes that partially match the given sequence
       */
  def getPartiallyMatchedNodes(
    keySequence: java.lang.String,
    currentKeytip: officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ): js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerIKeytipTreeNodeMod.IKeytipTreeNode
  ] = js.native
  /**
       * Tests if the currentKeytip in this.keytipTree is the parent of 'keytipProps'
       *
       * @param keytipProps - Keytip to test the parent for
       * @returns T/F if the currentKeytip is this keytipProps' parent
       */
  def isCurrentKeytipParent(keytipProps: officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps): scala.Boolean = js.native
  /**
       * Removes a node from the KeytipTree
       *
       * @param sequence - full string of the node to remove
       */
  def removeNode(
    keytipProps: officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps,
    uniqueID: java.lang.String
  ): scala.Unit = js.native
  /**
       * Updates a node in the tree
       *
       * @param keytipProps - Keytip props to update
       * @param uniqueID - Unique ID for this keytip
       */
  def updateNode(
    keytipProps: officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps,
    uniqueID: java.lang.String
  ): scala.Unit = js.native
}

