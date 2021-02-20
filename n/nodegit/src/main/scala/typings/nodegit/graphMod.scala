package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  @JSImport("nodegit/graph", "Graph")
  @js.native
  class Graph () extends StObject
  /* static members */
  object Graph {
    
    @JSImport("nodegit/graph", "Graph.aheadBehind")
    @js.native
    def aheadBehind(repo: Repository, local: Oid, upstream: Oid): js.Promise[Double] = js.native
    
    @JSImport("nodegit/graph", "Graph.descendantOf")
    @js.native
    def descendantOf(repo: Repository, commit: Oid, ancestor: Oid): js.Promise[Double] = js.native
  }
}
