package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Graph")
@js.native
class Graph ()
  extends typings.nodegit.graphMod.Graph

/* static members */
@JSImport("nodegit", "Graph")
@js.native
object Graph extends js.Object {
  def aheadBehind(
    repo: typings.nodegit.repositoryMod.Repository,
    local: typings.nodegit.oidMod.Oid,
    upstream: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
  def descendantOf(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.oidMod.Oid,
    ancestor: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}

