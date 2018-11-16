package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Status")
@js.native
object StatusNs extends js.Object {
  @js.native
  object OPT extends js.Object {
    /* 32 */ val DISABLE_PATHSPEC_MATCH: nodegitLib.statusMod.StatusNs.OPT.DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 8 */ val EXCLUDE_SUBMODULES: nodegitLib.statusMod.StatusNs.OPT.EXCLUDE_SUBMODULES with scala.Double = js.native
    /* 2 */ val INCLUDE_IGNORED: nodegitLib.statusMod.StatusNs.OPT.INCLUDE_IGNORED with scala.Double = js.native
    /* 4 */ val INCLUDE_UNMODIFIED: nodegitLib.statusMod.StatusNs.OPT.INCLUDE_UNMODIFIED with scala.Double = js.native
    /* 16384 */ val INCLUDE_UNREADABLE: nodegitLib.statusMod.StatusNs.OPT.INCLUDE_UNREADABLE with scala.Double = js.native
    /* 32768 */ val INCLUDE_UNREADABLE_AS_UNTRACKED: nodegitLib.statusMod.StatusNs.OPT.INCLUDE_UNREADABLE_AS_UNTRACKED with scala.Double = js.native
    /* 1 */ val INCLUDE_UNTRACKED: nodegitLib.statusMod.StatusNs.OPT.INCLUDE_UNTRACKED with scala.Double = js.native
    /* 4096 */ val NO_REFRESH: nodegitLib.statusMod.StatusNs.OPT.NO_REFRESH with scala.Double = js.native
    /* 64 */ val RECURSE_IGNORED_DIRS: nodegitLib.statusMod.StatusNs.OPT.RECURSE_IGNORED_DIRS with scala.Double = js.native
    /* 16 */ val RECURSE_UNTRACKED_DIRS: nodegitLib.statusMod.StatusNs.OPT.RECURSE_UNTRACKED_DIRS with scala.Double = js.native
    /* 2048 */ val RENAMES_FROM_REWRITES: nodegitLib.statusMod.StatusNs.OPT.RENAMES_FROM_REWRITES with scala.Double = js.native
    /* 128 */ val RENAMES_HEAD_TO_INDEX: nodegitLib.statusMod.StatusNs.OPT.RENAMES_HEAD_TO_INDEX with scala.Double = js.native
    /* 256 */ val RENAMES_INDEX_TO_WORKDIR: nodegitLib.statusMod.StatusNs.OPT.RENAMES_INDEX_TO_WORKDIR with scala.Double = js.native
    /* 1024 */ val SORT_CASE_INSENSITIVELY: nodegitLib.statusMod.StatusNs.OPT.SORT_CASE_INSENSITIVELY with scala.Double = js.native
    /* 512 */ val SORT_CASE_SENSITIVELY: nodegitLib.statusMod.StatusNs.OPT.SORT_CASE_SENSITIVELY with scala.Double = js.native
    /* 8192 */ val UPDATE_INDEX: nodegitLib.statusMod.StatusNs.OPT.UPDATE_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.statusMod.StatusNs.OPT with scala.Double] = js.native
  }
  
  @js.native
  object SHOW extends js.Object {
    /* 0 */ val INDEX_AND_WORKDIR: nodegitLib.statusMod.StatusNs.SHOW.INDEX_AND_WORKDIR with scala.Double = js.native
    /* 1 */ val INDEX_ONLY: nodegitLib.statusMod.StatusNs.SHOW.INDEX_ONLY with scala.Double = js.native
    /* 2 */ val WORKDIR_ONLY: nodegitLib.statusMod.StatusNs.SHOW.WORKDIR_ONLY with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.statusMod.StatusNs.SHOW with scala.Double] = js.native
  }
  
  @js.native
  object STATUS extends js.Object {
    /* 32768 */ val CONFLICTED: nodegitLib.statusMod.StatusNs.STATUS.CONFLICTED with scala.Double = js.native
    /* 0 */ val CURRENT: nodegitLib.statusMod.StatusNs.STATUS.CURRENT with scala.Double = js.native
    /* 16384 */ val IGNORED: nodegitLib.statusMod.StatusNs.STATUS.IGNORED with scala.Double = js.native
    /* 4 */ val INDEX_DELETED: nodegitLib.statusMod.StatusNs.STATUS.INDEX_DELETED with scala.Double = js.native
    /* 2 */ val INDEX_MODIFIED: nodegitLib.statusMod.StatusNs.STATUS.INDEX_MODIFIED with scala.Double = js.native
    /* 1 */ val INDEX_NEW: nodegitLib.statusMod.StatusNs.STATUS.INDEX_NEW with scala.Double = js.native
    /* 8 */ val INDEX_RENAMED: nodegitLib.statusMod.StatusNs.STATUS.INDEX_RENAMED with scala.Double = js.native
    /* 16 */ val INDEX_TYPECHANGE: nodegitLib.statusMod.StatusNs.STATUS.INDEX_TYPECHANGE with scala.Double = js.native
    /* 512 */ val WT_DELETED: nodegitLib.statusMod.StatusNs.STATUS.WT_DELETED with scala.Double = js.native
    /* 256 */ val WT_MODIFIED: nodegitLib.statusMod.StatusNs.STATUS.WT_MODIFIED with scala.Double = js.native
    /* 128 */ val WT_NEW: nodegitLib.statusMod.StatusNs.STATUS.WT_NEW with scala.Double = js.native
    /* 2048 */ val WT_RENAMED: nodegitLib.statusMod.StatusNs.STATUS.WT_RENAMED with scala.Double = js.native
    /* 1024 */ val WT_TYPECHANGE: nodegitLib.statusMod.StatusNs.STATUS.WT_TYPECHANGE with scala.Double = js.native
    /* 4096 */ val WT_UNREADABLE: nodegitLib.statusMod.StatusNs.STATUS.WT_UNREADABLE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.statusMod.StatusNs.STATUS with scala.Double] = js.native
  }
  
  type OPT = nodegitLib.statusMod.StatusNs.OPT
  type SHOW = nodegitLib.statusMod.StatusNs.SHOW
  type STATUS = nodegitLib.statusMod.StatusNs.STATUS
}

