package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Stash")
@js.native
object StashNs extends js.Object {
  @js.native
  object APPLY_FLAGS extends js.Object {
    /* 0 */ val APPLY_DEFAULT: nodegitLib.stashMod.StashNs.APPLY_FLAGS.APPLY_DEFAULT with scala.Double = js.native
    /* 1 */ val APPLY_REINSTATE_INDEX: nodegitLib.stashMod.StashNs.APPLY_FLAGS.APPLY_REINSTATE_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.stashMod.StashNs.APPLY_FLAGS with scala.Double] = js.native
  }
  
  @js.native
  object APPLY_PROGRESS extends js.Object {
    /* 2 */ val ANALYZE_INDEX: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.ANALYZE_INDEX with scala.Double = js.native
    /* 3 */ val ANALYZE_MODIFIED: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.ANALYZE_MODIFIED with scala.Double = js.native
    /* 4 */ val ANALYZE_UNTRACKED: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.ANALYZE_UNTRACKED with scala.Double = js.native
    /* 6 */ val CHECKOUT_MODIFIED: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.CHECKOUT_MODIFIED with scala.Double = js.native
    /* 5 */ val CHECKOUT_UNTRACKED: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.CHECKOUT_UNTRACKED with scala.Double = js.native
    /* 7 */ val DONE: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.DONE with scala.Double = js.native
    /* 1 */ val LOADING_STASH: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.LOADING_STASH with scala.Double = js.native
    /* 0 */ val NONE: nodegitLib.stashMod.StashNs.APPLY_PROGRESS.NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.stashMod.StashNs.APPLY_PROGRESS with scala.Double] = js.native
  }
  
  @js.native
  object FLAGS extends js.Object {
    /* 0 */ val DEFAULT: nodegitLib.stashMod.StashNs.FLAGS.DEFAULT with scala.Double = js.native
    /* 4 */ val INCLUDE_IGNORED: nodegitLib.stashMod.StashNs.FLAGS.INCLUDE_IGNORED with scala.Double = js.native
    /* 2 */ val INCLUDE_UNTRACKED: nodegitLib.stashMod.StashNs.FLAGS.INCLUDE_UNTRACKED with scala.Double = js.native
    /* 1 */ val KEEP_INDEX: nodegitLib.stashMod.StashNs.FLAGS.KEEP_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.stashMod.StashNs.FLAGS with scala.Double] = js.native
  }
  
  type APPLY_FLAGS = nodegitLib.stashMod.StashNs.APPLY_FLAGS
  type APPLY_PROGRESS = nodegitLib.stashMod.StashNs.APPLY_PROGRESS
  type FLAGS = nodegitLib.stashMod.StashNs.FLAGS
}

