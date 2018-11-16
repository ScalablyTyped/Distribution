package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Checkout")
@js.native
object CheckoutNs extends js.Object {
  @js.native
  object NOTIFY extends js.Object {
    /* 65535 */ val ALL: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.ALL with scala.Double = js.native
    /* 1 */ val CONFLICT: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.CONFLICT with scala.Double = js.native
    /* 2 */ val DIRTY: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.DIRTY with scala.Double = js.native
    /* 16 */ val IGNORED: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.IGNORED with scala.Double = js.native
    /* 0 */ val NONE: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.NONE with scala.Double = js.native
    /* 8 */ val UNTRACKED: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.UNTRACKED with scala.Double = js.native
    /* 4 */ val UPDATED: nodegitLib.checkoutMod.CheckoutNs.NOTIFY.UPDATED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.checkoutMod.CheckoutNs.NOTIFY with scala.Double] = js.native
  }
  
  @js.native
  object STRATEGY extends js.Object {
    /* 16 */ val ALLOW_CONFLICTS: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.ALLOW_CONFLICTS with scala.Double = js.native
    /* 2097152 */ val CONFLICT_STYLE_DIFF3: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.CONFLICT_STYLE_DIFF3 with scala.Double = js.native
    /* 1048576 */ val CONFLICT_STYLE_MERGE: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.CONFLICT_STYLE_MERGE with scala.Double = js.native
    /* 8192 */ val DISABLE_PATHSPEC_MATCH: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 524288 */ val DONT_OVERWRITE_IGNORED: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.DONT_OVERWRITE_IGNORED with scala.Double = js.native
    /* 4194304 */ val DONT_REMOVE_EXISTING: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.DONT_REMOVE_EXISTING with scala.Double = js.native
    /* 256 */ val DONT_UPDATE_INDEX: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.DONT_UPDATE_INDEX with scala.Double = js.native
    /* 8388608 */ val DONT_WRITE_INDEX: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.DONT_WRITE_INDEX with scala.Double = js.native
    /* 2 */ val FORCE: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.FORCE with scala.Double = js.native
    /* 0 */ val NONE: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.NONE with scala.Double = js.native
    /* 512 */ val NO_REFRESH: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.NO_REFRESH with scala.Double = js.native
    /* 4 */ val RECREATE_MISSING: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.RECREATE_MISSING with scala.Double = js.native
    /* 64 */ val REMOVE_IGNORED: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.REMOVE_IGNORED with scala.Double = js.native
    /* 32 */ val REMOVE_UNTRACKED: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.REMOVE_UNTRACKED with scala.Double = js.native
    /* 1 */ val SAFE: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.SAFE with scala.Double = js.native
    /* 262144 */ val SKIP_LOCKED_DIRECTORIES: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.SKIP_LOCKED_DIRECTORIES with scala.Double = js.native
    /* 1024 */ val SKIP_UNMERGED: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.SKIP_UNMERGED with scala.Double = js.native
    /* 128 */ val UPDATE_ONLY: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.UPDATE_ONLY with scala.Double = js.native
    /* 65536 */ val UPDATE_SUBMODULES: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.UPDATE_SUBMODULES with scala.Double = js.native
    /* 131072 */ val UPDATE_SUBMODULES_IF_CHANGED: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.UPDATE_SUBMODULES_IF_CHANGED with scala.Double = js.native
    /* 2048 */ val USE_OURS: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.USE_OURS with scala.Double = js.native
    /* 4096 */ val USE_THEIRS: nodegitLib.checkoutMod.CheckoutNs.STRATEGY.USE_THEIRS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.checkoutMod.CheckoutNs.STRATEGY with scala.Double] = js.native
  }
  
  type NOTIFY = nodegitLib.checkoutMod.CheckoutNs.NOTIFY
  type STRATEGY = nodegitLib.checkoutMod.CheckoutNs.STRATEGY
}

