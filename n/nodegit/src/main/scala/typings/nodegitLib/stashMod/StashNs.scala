package typings
package nodegitLib.stashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/stash", "Stash")
@js.native
object StashNs extends js.Object {
  @js.native
  sealed trait APPLY_FLAGS extends js.Object
  
  @js.native
  sealed trait APPLY_PROGRESS extends js.Object
  
  @js.native
  sealed trait FLAGS extends js.Object
  
  @js.native
  object APPLY_FLAGS extends js.Object {
    @js.native
    sealed trait APPLY_DEFAULT
      extends nodegitLib.stashMod.StashNs.APPLY_FLAGS
    
    @js.native
    sealed trait APPLY_REINSTATE_INDEX
      extends nodegitLib.stashMod.StashNs.APPLY_FLAGS
    
    /* 0 */ val APPLY_DEFAULT: APPLY_DEFAULT with scala.Double = js.native
    /* 1 */ val APPLY_REINSTATE_INDEX: APPLY_REINSTATE_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.stashMod.StashNs.APPLY_FLAGS with scala.Double] = js.native
  }
  
  @js.native
  object APPLY_PROGRESS extends js.Object {
    @js.native
    sealed trait ANALYZE_INDEX
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait ANALYZE_MODIFIED
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait ANALYZE_UNTRACKED
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait CHECKOUT_MODIFIED
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait CHECKOUT_UNTRACKED
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait DONE
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait LOADING_STASH
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    @js.native
    sealed trait NONE
      extends nodegitLib.stashMod.StashNs.APPLY_PROGRESS
    
    /* 2 */ val ANALYZE_INDEX: ANALYZE_INDEX with scala.Double = js.native
    /* 3 */ val ANALYZE_MODIFIED: ANALYZE_MODIFIED with scala.Double = js.native
    /* 4 */ val ANALYZE_UNTRACKED: ANALYZE_UNTRACKED with scala.Double = js.native
    /* 6 */ val CHECKOUT_MODIFIED: CHECKOUT_MODIFIED with scala.Double = js.native
    /* 5 */ val CHECKOUT_UNTRACKED: CHECKOUT_UNTRACKED with scala.Double = js.native
    /* 7 */ val DONE: DONE with scala.Double = js.native
    /* 1 */ val LOADING_STASH: LOADING_STASH with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.stashMod.StashNs.APPLY_PROGRESS with scala.Double] = js.native
  }
  
  @js.native
  object FLAGS extends js.Object {
    @js.native
    sealed trait DEFAULT
      extends nodegitLib.stashMod.StashNs.FLAGS
    
    @js.native
    sealed trait INCLUDE_IGNORED
      extends nodegitLib.stashMod.StashNs.FLAGS
    
    @js.native
    sealed trait INCLUDE_UNTRACKED
      extends nodegitLib.stashMod.StashNs.FLAGS
    
    @js.native
    sealed trait KEEP_INDEX
      extends nodegitLib.stashMod.StashNs.FLAGS
    
    /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
    /* 4 */ val INCLUDE_IGNORED: INCLUDE_IGNORED with scala.Double = js.native
    /* 2 */ val INCLUDE_UNTRACKED: INCLUDE_UNTRACKED with scala.Double = js.native
    /* 1 */ val KEEP_INDEX: KEEP_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.stashMod.StashNs.FLAGS with scala.Double] = js.native
  }
  
}

