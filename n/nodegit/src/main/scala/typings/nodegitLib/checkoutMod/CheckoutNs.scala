package typings
package nodegitLib.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/checkout", "Checkout")
@js.native
object CheckoutNs extends js.Object {
  @js.native
  sealed trait NOTIFY extends js.Object
  
  @js.native
  sealed trait STRATEGY extends js.Object
  
  @js.native
  object NOTIFY extends js.Object {
    @js.native
    sealed trait ALL
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    @js.native
    sealed trait CONFLICT
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    @js.native
    sealed trait DIRTY
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    @js.native
    sealed trait IGNORED
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    @js.native
    sealed trait NONE
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    @js.native
    sealed trait UNTRACKED
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    @js.native
    sealed trait UPDATED
      extends nodegitLib.checkoutMod.CheckoutNs.NOTIFY
    
    /* 65535 */ val ALL: ALL with scala.Double = js.native
    /* 1 */ val CONFLICT: CONFLICT with scala.Double = js.native
    /* 2 */ val DIRTY: DIRTY with scala.Double = js.native
    /* 16 */ val IGNORED: IGNORED with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 8 */ val UNTRACKED: UNTRACKED with scala.Double = js.native
    /* 4 */ val UPDATED: UPDATED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.checkoutMod.CheckoutNs.NOTIFY with scala.Double] = js.native
  }
  
  @js.native
  object STRATEGY extends js.Object {
    @js.native
    sealed trait ALLOW_CONFLICTS
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait CONFLICT_STYLE_DIFF3
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait CONFLICT_STYLE_MERGE
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait DISABLE_PATHSPEC_MATCH
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait DONT_OVERWRITE_IGNORED
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait DONT_REMOVE_EXISTING
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait DONT_UPDATE_INDEX
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait DONT_WRITE_INDEX
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait FORCE
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait NONE
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait NO_REFRESH
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait RECREATE_MISSING
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait REMOVE_IGNORED
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait REMOVE_UNTRACKED
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait SAFE
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait SKIP_LOCKED_DIRECTORIES
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait SKIP_UNMERGED
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait UPDATE_ONLY
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait UPDATE_SUBMODULES
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait UPDATE_SUBMODULES_IF_CHANGED
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait USE_OURS
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    @js.native
    sealed trait USE_THEIRS
      extends nodegitLib.checkoutMod.CheckoutNs.STRATEGY
    
    /* 16 */ val ALLOW_CONFLICTS: ALLOW_CONFLICTS with scala.Double = js.native
    /* 2097152 */ val CONFLICT_STYLE_DIFF3: CONFLICT_STYLE_DIFF3 with scala.Double = js.native
    /* 1048576 */ val CONFLICT_STYLE_MERGE: CONFLICT_STYLE_MERGE with scala.Double = js.native
    /* 8192 */ val DISABLE_PATHSPEC_MATCH: DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 524288 */ val DONT_OVERWRITE_IGNORED: DONT_OVERWRITE_IGNORED with scala.Double = js.native
    /* 4194304 */ val DONT_REMOVE_EXISTING: DONT_REMOVE_EXISTING with scala.Double = js.native
    /* 256 */ val DONT_UPDATE_INDEX: DONT_UPDATE_INDEX with scala.Double = js.native
    /* 8388608 */ val DONT_WRITE_INDEX: DONT_WRITE_INDEX with scala.Double = js.native
    /* 2 */ val FORCE: FORCE with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 512 */ val NO_REFRESH: NO_REFRESH with scala.Double = js.native
    /* 4 */ val RECREATE_MISSING: RECREATE_MISSING with scala.Double = js.native
    /* 64 */ val REMOVE_IGNORED: REMOVE_IGNORED with scala.Double = js.native
    /* 32 */ val REMOVE_UNTRACKED: REMOVE_UNTRACKED with scala.Double = js.native
    /* 1 */ val SAFE: SAFE with scala.Double = js.native
    /* 262144 */ val SKIP_LOCKED_DIRECTORIES: SKIP_LOCKED_DIRECTORIES with scala.Double = js.native
    /* 1024 */ val SKIP_UNMERGED: SKIP_UNMERGED with scala.Double = js.native
    /* 128 */ val UPDATE_ONLY: UPDATE_ONLY with scala.Double = js.native
    /* 65536 */ val UPDATE_SUBMODULES: UPDATE_SUBMODULES with scala.Double = js.native
    /* 131072 */ val UPDATE_SUBMODULES_IF_CHANGED: UPDATE_SUBMODULES_IF_CHANGED with scala.Double = js.native
    /* 2048 */ val USE_OURS: USE_OURS with scala.Double = js.native
    /* 4096 */ val USE_THEIRS: USE_THEIRS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.checkoutMod.CheckoutNs.STRATEGY with scala.Double] = js.native
  }
  
}

