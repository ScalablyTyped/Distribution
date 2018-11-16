package typings
package nodegitLib.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/fetch", "Fetch")
@js.native
object FetchNs extends js.Object {
  @js.native
  sealed trait PRUNE extends js.Object
  
  @js.native
  object PRUNE extends js.Object {
    @js.native
    sealed trait GIT_FETCH_NO_PRUNE
      extends nodegitLib.fetchMod.FetchNs.PRUNE
    
    @js.native
    sealed trait GIT_FETCH_PRUNE
      extends nodegitLib.fetchMod.FetchNs.PRUNE
    
    @js.native
    sealed trait GIT_FETCH_PRUNE_UNSPECIFIED
      extends nodegitLib.fetchMod.FetchNs.PRUNE
    
    /* 2 */ val GIT_FETCH_NO_PRUNE: GIT_FETCH_NO_PRUNE with scala.Double = js.native
    /* 1 */ val GIT_FETCH_PRUNE: GIT_FETCH_PRUNE with scala.Double = js.native
    /* 0 */ val GIT_FETCH_PRUNE_UNSPECIFIED: GIT_FETCH_PRUNE_UNSPECIFIED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.fetchMod.FetchNs.PRUNE with scala.Double] = js.native
  }
  
}

