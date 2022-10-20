package typings.npmcliArborist.mod

import typings.npmcliArborist.npmcliArboristBooleans.`false`
import typings.npmcliPackageJson.mod.PackageJson
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All arborist trees are `Node` objects.  A `Node` refers
  * to a package folder, which may have children in `node_modules`.
  */
@JSImport("@npmcli/arborist", "Node")
@js.native
open class Node protected () extends StObject {
  /* protected */ def this(options: scala.Nothing) = this()
  
  /** The contents of this node's `package.json` file. */
  @JSName("package")
  val _package: PackageJson = js.native
  
  /** Map of packages located in the node's `node_modules` folder. */
  var children: Map[String, Node | Link] = js.native
  
  /** Indicates if this node is a dev dependency. */
  var dev: Boolean = js.native
  
  /** Indicates if this node is an optional dev dependency. */
  var devOptional: Boolean = js.native
  
  /** Edges in the dependency graph indicating nodes that depend on this node. */
  var edgesIn: js.Array[Edge] = js.native
  
  /**
    * Edges in the dependency graph indicating nodes that this node depends
    * on, which resolve its dependencies.
    */
  var edgesOut: js.Array[Edge] = js.native
  
  /** Errors encountered while parsing package.json or version specifiers. */
  var errors: js.Array[js.Error] = js.native
  
  /** True if this package is not required by any other for any reason.  False for top of tree. */
  var extraneous: Boolean = js.native
  
  /**
    * Package nodes that are underneath this folder, but not in `node_modules`.
    * Usually, these are workspaces, but can also be other `file:` dependencies
    */
  var fsChildren: Set[Node] = js.native
  
  /**
    * Package nodes are not only found in `node_modules` folders.  They can be
    * symlinked into place from anywhere on the file system.
    *
    * If a package is underneath the folder of another Node, we call that it's
    * file system parent node, or `fsParent`.  This is relevant when looking for
    * dependencies, because Node's `require()` lookup algorithm will walk up the
    * file system looking for resolutions.
    */
  var fsParent: Node | Null = js.native
  
  def inBundle: Boolean = js.native
  
  def inNodeModules(): String | `false` = js.native
  
  /** The integrity value for the package artifact. */
  var integrity: String | Null = js.native
  
  /** An index for the package objects in the lockfile. */
  var inventory: Inventory = js.native
  
  /** Whether this represents a symlink.  Always `false` for Node objects, always `true` for Link objects. */
  var isLink: Boolean = js.native
  
  /** True if this node is a root node.  (Ie, if `node.root === node`.) */
  var isRoot: Boolean = js.native
  
  /** True if this node is the top of its tree (ie, has no `parent`, false otherwise). */
  var isTop: String = js.native
  
  /** A slash-normalized relative path from the root node to this node's path. */
  var location: String = js.native
  
  /**
    * A `Shrinkwrap` object which looks up `resolved` and `integrity` values
    * for all modules in this tree.  Only relevant on `root` nodes.
    */
  var meta: js.UndefOr[Shrinkwrap] = js.native
  
  /** The name of this node's folder in `node_modules`. */
  var name: String = js.native
  
  /** Indicates if this node is an optional dependency. */
  var optional: Boolean = js.native
  
  /**
    * Physical parent node in the tree.  The package in whose `node_modules`
    * folder this package lives.  Null if node is top of tree.
    *
    * Setting `node.parent` will automatically update `node.location` and all
    * graph edges affected by the move.
    */
  var parent: Node | Null = js.native
  
  /**
    * File path to this package.  If the node is a link, then this is the
    * path to the link, not to the link target.  If the node is _not_ a link,
    * then this matches `node.realpath`.
    */
  var path: String = js.native
  
  /** Indicates if this node is a peer dependency. */
  var peer: Boolean = js.native
  
  /** The canonical spec of this package version: `name@version` */
  def pkgid: String = js.native
  
  def querySelectorAll(query: String): js.Promise[js.Array[Node]] = js.native
  
  /** The full real filepath on disk where this node lives. */
  var realpath: String = js.native
  
  /** Identify the node that will be returned when code in this package runs `require(name)` */
  def resolve(name: String): Node = js.native
  
  /** The tarball url or file path where the package artifact can be found. */
  var resolved: String | Null = js.native
  
  /**
    * The root node where we are working. If not assigned to some other
    * value, resolves to the node itself. (Ie, the root node's `root`
    * property refers to itself.)
    */
  def root: Node = js.native
  def root_=(value: Node | Null): Unit = js.native
  
  /** If this is a Link, this is the node it  */
  var target: Node = js.native
  
  def toJSON(): Node = js.native
  
  /**
    * The top node in this node's tree.  This will be equal to `node.root`
    * for simple trees, but link targets will frequently be outside of (or
    * nested somewhere within) a `node_modules` hierarchy, and so will have
    * a different `top`.
    */
  var top: String = js.native
  
  var workspaces: (Map[String, String]) | Null = js.native
}
