package typings
package nodegitLib.graphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/graph", "Graph")
@js.native
class Graph () extends js.Object

@JSImport("nodegit/graph", "Graph")
@js.native
object Graph extends js.Object {
  def aheadBehind(
    repo: nodegitLib.repositoryMod.Repository,
    local: nodegitLib.oidMod.Oid,
    upstream: nodegitLib.oidMod.Oid
  ): stdLib.Promise[scala.Double] = js.native
  def descendantOf(
    repo: nodegitLib.repositoryMod.Repository,
    commit: nodegitLib.oidMod.Oid,
    ancestor: nodegitLib.oidMod.Oid
  ): stdLib.Promise[scala.Double] = js.native
}

