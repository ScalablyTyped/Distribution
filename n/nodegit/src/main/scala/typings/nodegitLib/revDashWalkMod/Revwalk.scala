package typings
package nodegitLib.revDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rev-walk", "Revwalk")
@js.native
class Revwalk () extends js.Object {
  def fastWalk(maxCount: scala.Double): js.Promise[_] = js.native
  def fileHistoryWalk(filePath: java.lang.String, maxCount: scala.Double): js.Promise[js.Array[_]] = js.native
  def getCommits(count: scala.Double): js.Promise[js.Array[nodegitLib.commitMod.Commit]] = js.native
  /**
       * Walk the history grabbing commits until the checkFn called with the current commit returns false.
       */
  def getCommitsUntil(checkFn: js.Function): js.Promise[js.Array[_]] = js.native
  def hide(commitId: nodegitLib.oidMod.Oid): scala.Double = js.native
  def hideGlob(glob: java.lang.String): scala.Double = js.native
  def hideHead(): scala.Double = js.native
  def hideRef(refname: java.lang.String): scala.Double = js.native
  def next(): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def push(id: nodegitLib.oidMod.Oid): scala.Double = js.native
  def pushGlob(glob: java.lang.String): scala.Double = js.native
  def pushHead(): scala.Double = js.native
  def pushRange(range: java.lang.String): scala.Double = js.native
  def pushRef(refname: java.lang.String): scala.Double = js.native
  def repository(): nodegitLib.repositoryMod.Repository = js.native
  def reset(): scala.Unit = js.native
  def simplifyFirstParent(): scala.Unit = js.native
  /**
       * Set the sort order for the revwalk. This function takes variable arguments like revwalk.sorting(NodeGit.RevWalk.Topological, NodeGit.RevWalk.Reverse).
       */
  def sorting(sort: scala.Double): scala.Unit = js.native
  /**
       * Walk the history from the given oid. The callback is invoked for each commit; When the walk is over, the callback is invoked with (null, null).
       */
  def walk(oid: nodegitLib.oidMod.Oid): nodegitLib.commitMod.Commit = js.native
  /**
       * Walk the history from the given oid. The callback is invoked for each commit; When the walk is over, the callback is invoked with (null, null).
       */
  def walk(oid: nodegitLib.oidMod.Oid, callback: js.Function): nodegitLib.commitMod.Commit = js.native
}

@JSImport("nodegit/rev-walk", "Revwalk")
@js.native
object Revwalk extends js.Object {
  def create(repo: nodegitLib.repositoryMod.Repository): nodegitLib.revDashWalkMod.Revwalk = js.native
}

