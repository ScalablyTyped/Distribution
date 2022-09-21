package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.ikeytiptreenodeMod.IKeytipTreeNode
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipTreeMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipTree", "KeytipTree")
  @js.native
  /**
    * KeytipTree constructor
    */
  open class KeytipTree () extends StObject {
    
    /* private */ var _createNode: Any = js.native
    
    /* private */ var _getFullSequence: Any = js.native
    
    /* private */ var _getNodeSequence: Any = js.native
    
    /* private */ var _getParentID: Any = js.native
    
    /**
      * Add a keytip node to this KeytipTree
      *
      * @param keytipProps - Keytip to add to the Tree
      * @param uniqueID - Unique ID for this keytip
      * @param persisted - T/F if this keytip should be marked as persisted
      */
    def addNode(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
    def addNode(keytipProps: IKeytipProps, uniqueID: String, persisted: Boolean): Unit = js.native
    
    var currentKeytip: js.UndefOr[IKeytipTreeNode] = js.native
    
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
    
    var nodeMap: StringDictionary[IKeytipTreeNode] = js.native
    
    /**
      * Removes a node from the KeytipTree
      *
      * @param sequence - full string of the node to remove
      */
    def removeNode(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
    
    var root: IKeytipTreeNode = js.native
    
    /**
      * Updates a node in the tree
      *
      * @param keytipProps - Keytip props to update
      * @param uniqueID - Unique ID for this keytip
      */
    def updateNode(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
  }
}
