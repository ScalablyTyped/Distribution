package typings
package nodegitLib.treeDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree-builder", "Treebuilder")
@js.native
class Treebuilder () extends js.Object {
  def clear(): scala.Unit = js.native
  def entrycount(): scala.Double = js.native
  def free(): scala.Unit = js.native
  def get(filename: java.lang.String): nodegitLib.treeDashEntryMod.TreeEntry = js.native
  def insert(filename: java.lang.String, id: nodegitLib.oidMod.Oid, filemode: scala.Double): stdLib.Promise[nodegitLib.treeDashEntryMod.TreeEntry] = js.native
  def remove(filename: java.lang.String): scala.Double = js.native
  def write(): nodegitLib.oidMod.Oid = js.native
}

@JSImport("nodegit/tree-builder", "Treebuilder")
@js.native
object Treebuilder extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository, source: nodegitLib.treeMod.Tree): stdLib.Promise[nodegitLib.treeDashBuilderMod.Treebuilder] = js.native
}

