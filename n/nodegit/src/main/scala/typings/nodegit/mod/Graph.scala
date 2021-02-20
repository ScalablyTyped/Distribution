package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Graph")
@js.native
class Graph ()
  extends typings.nodegit.graphMod.Graph
/* static members */
object Graph {
  
  @JSImport("nodegit", "Graph.aheadBehind")
  @js.native
  def aheadBehind(
    repo: typings.nodegit.repositoryMod.Repository,
    local: typings.nodegit.oidMod.Oid,
    upstream: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Graph.descendantOf")
  @js.native
  def descendantOf(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.oidMod.Oid,
    ancestor: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}
