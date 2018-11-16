package typings
package nodegitLib.statusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status", "Status")
@js.native
object StatusNs extends js.Object {
  @js.native
  sealed trait OPT extends js.Object
  
  @js.native
  sealed trait SHOW extends js.Object
  
  @js.native
  sealed trait STATUS extends js.Object
  
  @js.native
  object OPT extends js.Object {
    @js.native
    sealed trait DISABLE_PATHSPEC_MATCH
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait EXCLUDE_SUBMODULES
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait INCLUDE_IGNORED
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait INCLUDE_UNMODIFIED
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait INCLUDE_UNREADABLE
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait INCLUDE_UNREADABLE_AS_UNTRACKED
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait INCLUDE_UNTRACKED
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait NO_REFRESH
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait RECURSE_IGNORED_DIRS
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait RECURSE_UNTRACKED_DIRS
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait RENAMES_FROM_REWRITES
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait RENAMES_HEAD_TO_INDEX
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait RENAMES_INDEX_TO_WORKDIR
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait SORT_CASE_INSENSITIVELY
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait SORT_CASE_SENSITIVELY
      extends nodegitLib.statusMod.StatusNs.OPT
    
    @js.native
    sealed trait UPDATE_INDEX
      extends nodegitLib.statusMod.StatusNs.OPT
    
    /* 32 */ val DISABLE_PATHSPEC_MATCH: DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 8 */ val EXCLUDE_SUBMODULES: EXCLUDE_SUBMODULES with scala.Double = js.native
    /* 2 */ val INCLUDE_IGNORED: INCLUDE_IGNORED with scala.Double = js.native
    /* 4 */ val INCLUDE_UNMODIFIED: INCLUDE_UNMODIFIED with scala.Double = js.native
    /* 16384 */ val INCLUDE_UNREADABLE: INCLUDE_UNREADABLE with scala.Double = js.native
    /* 32768 */ val INCLUDE_UNREADABLE_AS_UNTRACKED: INCLUDE_UNREADABLE_AS_UNTRACKED with scala.Double = js.native
    /* 1 */ val INCLUDE_UNTRACKED: INCLUDE_UNTRACKED with scala.Double = js.native
    /* 4096 */ val NO_REFRESH: NO_REFRESH with scala.Double = js.native
    /* 64 */ val RECURSE_IGNORED_DIRS: RECURSE_IGNORED_DIRS with scala.Double = js.native
    /* 16 */ val RECURSE_UNTRACKED_DIRS: RECURSE_UNTRACKED_DIRS with scala.Double = js.native
    /* 2048 */ val RENAMES_FROM_REWRITES: RENAMES_FROM_REWRITES with scala.Double = js.native
    /* 128 */ val RENAMES_HEAD_TO_INDEX: RENAMES_HEAD_TO_INDEX with scala.Double = js.native
    /* 256 */ val RENAMES_INDEX_TO_WORKDIR: RENAMES_INDEX_TO_WORKDIR with scala.Double = js.native
    /* 1024 */ val SORT_CASE_INSENSITIVELY: SORT_CASE_INSENSITIVELY with scala.Double = js.native
    /* 512 */ val SORT_CASE_SENSITIVELY: SORT_CASE_SENSITIVELY with scala.Double = js.native
    /* 8192 */ val UPDATE_INDEX: UPDATE_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.statusMod.StatusNs.OPT with scala.Double] = js.native
  }
  
  @js.native
  object SHOW extends js.Object {
    @js.native
    sealed trait INDEX_AND_WORKDIR
      extends nodegitLib.statusMod.StatusNs.SHOW
    
    @js.native
    sealed trait INDEX_ONLY
      extends nodegitLib.statusMod.StatusNs.SHOW
    
    @js.native
    sealed trait WORKDIR_ONLY
      extends nodegitLib.statusMod.StatusNs.SHOW
    
    /* 0 */ val INDEX_AND_WORKDIR: INDEX_AND_WORKDIR with scala.Double = js.native
    /* 1 */ val INDEX_ONLY: INDEX_ONLY with scala.Double = js.native
    /* 2 */ val WORKDIR_ONLY: WORKDIR_ONLY with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.statusMod.StatusNs.SHOW with scala.Double] = js.native
  }
  
  @js.native
  object STATUS extends js.Object {
    @js.native
    sealed trait CONFLICTED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait CURRENT
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait IGNORED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait INDEX_DELETED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait INDEX_MODIFIED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait INDEX_NEW
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait INDEX_RENAMED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait INDEX_TYPECHANGE
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait WT_DELETED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait WT_MODIFIED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait WT_NEW
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait WT_RENAMED
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait WT_TYPECHANGE
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    @js.native
    sealed trait WT_UNREADABLE
      extends nodegitLib.statusMod.StatusNs.STATUS
    
    /* 32768 */ val CONFLICTED: CONFLICTED with scala.Double = js.native
    /* 0 */ val CURRENT: CURRENT with scala.Double = js.native
    /* 16384 */ val IGNORED: IGNORED with scala.Double = js.native
    /* 4 */ val INDEX_DELETED: INDEX_DELETED with scala.Double = js.native
    /* 2 */ val INDEX_MODIFIED: INDEX_MODIFIED with scala.Double = js.native
    /* 1 */ val INDEX_NEW: INDEX_NEW with scala.Double = js.native
    /* 8 */ val INDEX_RENAMED: INDEX_RENAMED with scala.Double = js.native
    /* 16 */ val INDEX_TYPECHANGE: INDEX_TYPECHANGE with scala.Double = js.native
    /* 512 */ val WT_DELETED: WT_DELETED with scala.Double = js.native
    /* 256 */ val WT_MODIFIED: WT_MODIFIED with scala.Double = js.native
    /* 128 */ val WT_NEW: WT_NEW with scala.Double = js.native
    /* 2048 */ val WT_RENAMED: WT_RENAMED with scala.Double = js.native
    /* 1024 */ val WT_TYPECHANGE: WT_TYPECHANGE with scala.Double = js.native
    /* 4096 */ val WT_UNREADABLE: WT_UNREADABLE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.statusMod.StatusNs.STATUS with scala.Double] = js.native
  }
  
}

