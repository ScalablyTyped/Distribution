package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Tree")
@js.native
class Tree ()
  extends nodegitLib.treeMod.Tree

@JSImport("nodegit", "Tree")
@js.native
object Tree extends js.Object {
  def entryCmp(tree1: nodegitLib.treeDashEntryMod.TreeEntry, tree2: nodegitLib.treeDashEntryMod.TreeEntry): scala.Double = js.native
  def entryDup(dest: nodegitLib.treeDashEntryMod.TreeEntry, source: nodegitLib.treeDashEntryMod.TreeEntry): scala.Double = js.native
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): js.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String, callback: js.Function): js.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, callback: js.Function): js.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.treeMod.Tree, callback: js.Function): js.Promise[nodegitLib.treeMod.Tree] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): js.Promise[nodegitLib.treeMod.Tree] = js.native
}

