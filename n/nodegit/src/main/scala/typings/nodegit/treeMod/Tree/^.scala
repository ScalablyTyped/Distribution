package typings.nodegit.treeMod.Tree

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeEntryMod.TreeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree", "Tree")
@js.native
object ^ extends js.Object {
  def entryCmp(tree1: TreeEntry, tree2: TreeEntry): Double = js.native
  def entryDup(dest: TreeEntry, source: TreeEntry): Double = js.native
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: Repository, id: String): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: Oid): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: Oid, callback: js.Function): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: typings.nodegit.treeMod.Tree, callback: js.Function): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[typings.nodegit.treeMod.Tree] = js.native
}

