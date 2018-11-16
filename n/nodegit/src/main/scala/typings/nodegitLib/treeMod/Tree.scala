package typings
package nodegitLib.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree", "Tree")
@js.native
class Tree () extends js.Object {
  def _entryByIndex(idx: scala.Double): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  def _entryByName(filename: java.lang.String): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  /**
       * Make builder. This is helpful for modifying trees.
       */
  def builder(): nodegitLib.treeDashBuilderMod.Treebuilder = js.native
  def createUpdated(
    repo: nodegitLib.repositoryMod.Repository,
    nUpdates: scala.Double,
    updates: nodegitLib.treeDashUpdateMod.TreeUpdate
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  /**
       * Diff two trees
       */
  def diff(tree: Tree): stdLib.Promise[js.Array[nodegitLib.diffDashFileMod.DiffFile]] = js.native
  /**
       * Diff two trees
       */
  def diff(tree: Tree, callback: js.Function): stdLib.Promise[js.Array[nodegitLib.diffDashFileMod.DiffFile]] = js.native
  /**
       * Diff two trees with options
       */
  def diffWithOptions(tree: Tree): stdLib.Promise[js.Array[nodegitLib.diffDashFileMod.DiffFile]] = js.native
  /**
       * Diff two trees with options
       */
  def diffWithOptions(tree: Tree, options: js.Object): stdLib.Promise[js.Array[nodegitLib.diffDashFileMod.DiffFile]] = js.native
  /**
       * Diff two trees with options
       */
  def diffWithOptions(tree: Tree, options: js.Object, callback: js.Function): stdLib.Promise[js.Array[nodegitLib.diffDashFileMod.DiffFile]] = js.native
  def dup(): stdLib.Promise[Tree] = js.native
  /**
       * Return an array of the entries in this tree (excluding its children).
       */
  def entries(): js.Array[nodegitLib.treeDashEntryMod.TreeEntry] = js.native
  def entryById(id: nodegitLib.oidMod.Oid): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  /**
       * Get an entry at the ith position.
       */
  def entryByIndex(i: scala.Double): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  /**
       * Get an entry by name; if the tree is a directory, the name is the filename.
       */
  def entryByName(name: java.lang.String): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  def entryByPath(path: java.lang.String): stdLib.Promise[nodegitLib.treeDashEntryMod.TreeEntry] = js.native
  def entryCount(): scala.Double = js.native
  def free(): scala.Unit = js.native
  /**
       * Get an entry at a path. Unlike by name, this takes a fully qualified path, like /foo/bar/baz.javascript
       */
  def getEntry(filePath: java.lang.String): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  /**
       * Return the path of this tree, like /lib/foo/bar
       *
       *
       */
  def path(): java.lang.String = js.native
  /**
       * Recursively walk the tree in breadth-first order. Fires an event for each entry.
       */
  def walk(): nodeLib.NodeJSNs.EventEmitter = js.native
  /**
       * Recursively walk the tree in breadth-first order. Fires an event for each entry.
       */
  def walk(blobsOnly: scala.Boolean): nodeLib.NodeJSNs.EventEmitter = js.native
}

@JSImport("nodegit/tree", "Tree")
@js.native
object Tree extends js.Object {
  def entryCmp(tree1: nodegitLib.treeDashEntryMod.TreeEntry, tree2: nodegitLib.treeDashEntryMod.TreeEntry): scala.Double = js.native
  def entryDup(dest: nodegitLib.treeDashEntryMod.TreeEntry, source: nodegitLib.treeDashEntryMod.TreeEntry): scala.Double = js.native
  /**
       * Retrieves the tree pointed to by the oid
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  /**
       * Retrieves the tree pointed to by the oid
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String, callback: js.Function): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  /**
       * Retrieves the tree pointed to by the oid
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  /**
       * Retrieves the tree pointed to by the oid
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, callback: js.Function): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  /**
       * Retrieves the tree pointed to by the oid
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.treeMod.Tree): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  /**
       * Retrieves the tree pointed to by the oid
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.treeMod.Tree, callback: js.Function): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
}

