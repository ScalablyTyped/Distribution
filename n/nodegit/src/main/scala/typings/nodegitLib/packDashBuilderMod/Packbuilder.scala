package typings
package nodegitLib.packDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/pack-builder", "Packbuilder")
@js.native
class Packbuilder () extends js.Object {
  def free(): scala.Unit = js.native
  def hash(): nodegitLib.oidMod.Oid = js.native
  def insert(id: nodegitLib.oidMod.Oid, name: java.lang.String): scala.Double = js.native
  def insertCommit(id: nodegitLib.oidMod.Oid): scala.Double = js.native
  def insertRecur(id: nodegitLib.oidMod.Oid, name: java.lang.String): scala.Double = js.native
  def insertTree(id: nodegitLib.oidMod.Oid): scala.Double = js.native
  def insertWalk(walk: nodegitLib.revDashWalkMod.Revwalk): scala.Double = js.native
  def objectCount(): scala.Double = js.native
  def setThreads(n: scala.Double): scala.Double = js.native
  def written(): scala.Double = js.native
}

/* static members */
@JSImport("nodegit/pack-builder", "Packbuilder")
@js.native
object Packbuilder extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository): nodegitLib.packDashBuilderMod.Packbuilder = js.native
}

