package typings
package nodeDashRedLib.nodeDashRedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodes extends js.Object {
  /**
    * Adds a set of credentials for the given node id.
    * @param id the node id for the credentials
    * @param creds an object of credential key/value pairs
    */
  def addCredentials(id: NodeId, creds: js.Object): scala.Unit = js.native
  /**
    * Node constructor functions must call this to
    * finish setting up the node. Among other things
    * it adds the node credentials, which are stored
    * outside the flow.
    *
    * @param node - the node object under construction.
    * @param props - the node's properties object, aka.
    * the node instance definition.
    */
  def createNode(node: Node, props: NodeProperties): scala.Unit = js.native
  /**
    * Deletes the credentials for the given node id.
    * @param id the node id for the credentials
    */
  def deleteCredentials(id: NodeId): scala.Unit = js.native
  /**
    * Cycle through all node definition objects.
    *
    * To get the actual node, use getNode() with the id
    * from the definition object.
    */
  def eachNode(callback: js.Function1[/* node */ NodeProperties, _]): scala.Unit = js.native
  /**
    * Gets the credentials for the given node id.
    * @param id the node id for the credentials
    * @return the credentials
    */
  def getCredentials(id: NodeId): js.Object = js.native
  /**
    * Get a node by NodeID.
    *
    * If your node uses a configuration
    * node, this call is used to get access to the running
    * instance.
    * @param id - the id of the node.
    * @return - the node matching the given id, or null if it does not exist.
    */
  def getNode(id: NodeId): Node | scala.Null = js.native
  /**
    * Registers a node constructor.
    *
    * Node constructors should be declared as functions with an explicit this
    * argument of a type descending from the Node interface. You can extend
    * the NodeProperties interface also, to add your node's properties.
    *
    * Example, using in-line declaration:
    *
    * RED.nodes.registerType('my-node', function(this: MyNode, props: MyProperties)
    *  => { RED.nodes.createNode(this, props); ... }, { ... });
    * @param type - the string type name
    * @param constructor - the constructor function for this node type
    * @param opts - optional additional options for the node
    */
  // tslint:disable-next-line no-unnecessary-generics
  def registerType[T /* <: NodeProperties */](`type`: java.lang.String, constructor: js.Function1[/* props */ T, _]): scala.Unit = js.native
  def registerType[T /* <: NodeProperties */](`type`: java.lang.String, constructor: js.Function1[/* props */ T, _], opts: js.Any): scala.Unit = js.native
}

