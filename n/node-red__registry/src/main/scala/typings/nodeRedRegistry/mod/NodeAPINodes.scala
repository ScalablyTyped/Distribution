package typings.nodeRedRegistry.mod

import typings.nodeRedRegistry.anon.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeAPINodes extends js.Object {
  
  /**
    * Adds a set of credentials for the given node id.
    * @param id the node id for the credentials
    * @param creds an object of credential key/value pairs
    * @returns a promise for backwards compatibility TODO: can this be removed?
    */
  def addCredentials(id: String, creds: js.Object): js.Promise[Unit] = js.native
  
  /**
    * Called from a Node's constructor function, invokes the super-class
    * constructor and attaches any credentials to the node.
    * @param node the node object being created
    * @param def the instance definition for the node
    */
  def createNode(node: Node[js.Object], `def`: NodeDef): Unit = js.native
  
  /**
    * Deletes the credentials for the given node id.
    * @param id the node id for the credentials
    */
  def deleteCredentials(id: String): Unit = js.native
  
  def eachNode(cb: js.Function1[/* node */ NodeDef, Unit]): Unit = js.native
  
  /**
    * Gets the credentials for the given node id.
    * @param id the node id for the credentials
    * @returns the credentials
    */
  def getCredentials(id: String): js.Object = js.native
  
  def getNode(id: String): Node[js.Object] = js.native
  
  /**
    * Registers a node constructor
    * @param type - the string type name
    * @param constructor - the constructor function for this node type
    * @param opts - optional additional options for the node
    */
  def registerType[TNode /* <: Node[TCreds] */, TNodeDef /* <: NodeDef */, TSets, TCreds](
    `type`: String,
     // tslint:disable-line:no-unnecessary-generics
  constructor: NodeConstructor[TNode, TNodeDef, TCreds]
  ): Unit = js.native
  def registerType[TNode /* <: Node[TCreds] */, TNodeDef /* <: NodeDef */, TSets, TCreds](
    `type`: String,
     // tslint:disable-line:no-unnecessary-generics
  constructor: NodeConstructor[TNode, TNodeDef, TCreds],
    opts: Credentials[TCreds, TSets]
  ): Unit = js.native
}
