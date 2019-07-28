package typings.nodegit.graphMod

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/graph", "Graph")
@js.native
class Graph () extends js.Object

/* static members */
@JSImport("nodegit/graph", "Graph")
@js.native
object Graph extends js.Object {
  def aheadBehind(repo: Repository, local: Oid, upstream: Oid): js.Promise[Double] = js.native
  def descendantOf(repo: Repository, commit: Oid, ancestor: Oid): js.Promise[Double] = js.native
}

