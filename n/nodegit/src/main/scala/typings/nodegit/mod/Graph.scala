package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Graph")
@js.native
open class Graph ()
  extends typings.nodegit.graphMod.Graph
/* static members */
object Graph {
  
  @JSImport("nodegit", "Graph")
  @js.native
  val ^ : js.Any = js.native
  
  inline def aheadBehind(
    repo: typings.nodegit.repositoryMod.Repository,
    local: typings.nodegit.oidMod.Oid,
    upstream: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("aheadBehind")(repo.asInstanceOf[js.Any], local.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def descendantOf(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.oidMod.Oid,
    ancestor: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("descendantOf")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
