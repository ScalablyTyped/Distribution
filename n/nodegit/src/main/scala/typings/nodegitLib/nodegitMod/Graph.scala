package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Graph")
@js.native
class Graph ()
  extends nodegitLib.graphMod.Graph

/* static members */
@JSImport("nodegit", "Graph")
@js.native
object Graph extends js.Object {
  def aheadBehind(
    repo: nodegitLib.repositoryMod.Repository,
    local: nodegitLib.oidMod.Oid,
    upstream: nodegitLib.oidMod.Oid
  ): js.Promise[scala.Double] = js.native
  def descendantOf(
    repo: nodegitLib.repositoryMod.Repository,
    commit: nodegitLib.oidMod.Oid,
    ancestor: nodegitLib.oidMod.Oid
  ): js.Promise[scala.Double] = js.native
}

