package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  @JSImport("nodegit/graph", "Graph")
  @js.native
  open class Graph () extends StObject
  /* static members */
  object Graph {
    
    @JSImport("nodegit/graph", "Graph")
    @js.native
    val ^ : js.Any = js.native
    
    inline def aheadBehind(repo: Repository, local: Oid, upstream: Oid): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("aheadBehind")(repo.asInstanceOf[js.Any], local.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def descendantOf(repo: Repository, commit: Oid, ancestor: Oid): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("descendantOf")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  }
}
