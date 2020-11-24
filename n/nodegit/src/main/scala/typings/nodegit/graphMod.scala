package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/graph", JSImport.Namespace)
@js.native
object graphMod extends js.Object {
  
  @js.native
  class Graph () extends js.Object
  /* static members */
  @js.native
  object Graph extends js.Object {
    
    def aheadBehind(repo: Repository, local: Oid, upstream: Oid): js.Promise[Double] = js.native
    
    def descendantOf(repo: Repository, commit: Oid, ancestor: Oid): js.Promise[Double] = js.native
  }
}
