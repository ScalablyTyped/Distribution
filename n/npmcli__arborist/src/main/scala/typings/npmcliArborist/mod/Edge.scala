package typings.npmcliArborist.mod

import typings.npmcliArborist.anon.PickEdgefromtypenamespec
import typings.npmcliArborist.npmcliArboristStrings.DETACHED
import typings.npmcliArborist.npmcliArboristStrings.INVALID
import typings.npmcliArborist.npmcliArboristStrings.MISSING
import typings.npmcliArborist.npmcliArboristStrings.`PEER LOCAL`
import typings.npmcliArborist.npmcliArboristStrings.peerOptional
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Edge objects represent a dependency relationship a package node to the
  * point in the tree where the dependency will be loaded.  As nodes are
  * moved within the tree, Edges automatically update to point to the
  * appropriate location.
  */
@JSImport("@npmcli/arborist", "Edge")
@js.native
open class Edge protected () extends StObject {
  /**
    * Creates a new edge with the specified fields.  After instantiation,
    * none of the fields can be changed directly.
    */
  def this(fields: PickEdgefromtypenamespec) = this()
  
  /**
    * A string indicating the type of error if there is a problem, or `null`
    * if it's valid.  Values, in order of precedence:
    * * `DETACHED` Indicates that the edge has been detached from its
    *   `edge.from` node, typically because a new edge was created when a
    *   dependency specifier was modified.
    * * `MISSING` Indicates that the dependency is unmet.  Note that this is
    *   _not_ set for unmet dependencies of the `optional` type.
    * * `PEER LOCAL` Indicates that a `peerDependency` is found in the
    *   node's local `node_modules` folder, and the node is not the top of
    *   the tree.  This violates the `peerDependency` contract, because it
    *   means that the dependency is not a peer.
    * * `INVALID` Indicates that the dependency does not satisfy `edge.spec`.
    */
  var error: DETACHED | MISSING | (`PEER LOCAL`) | INVALID | Null = js.native
  
  /** The node that has the dependency. */
  var from: Node = js.native
  
  /** The name of the dependency.  Ie, the key in the relevant `package.json` dependencies object. */
  var name: String = js.native
  
  def reload(): Unit = js.native
  def reload(hard: Boolean): Unit = js.native
  
  /**
    * The specifier that is required.  This can be a version, range, tag
    * name, git url, or tarball URL.  Any specifier allowed by npm is
    * supported.
    */
  var spec: String = js.native
  
  /** Automatically set to the node in the tree that matches the `name` field. */
  var to: Node = js.native
  
  /** The type of dependency. */
  var `type`: Exclude[SaveType, peerOptional] = js.native
  
  /** True if `edge.to` satisfies the specifier. */
  var valid: Boolean = js.native
}
