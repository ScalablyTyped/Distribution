package typings
package nodegitLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
object DiffNs extends js.Object {
  @js.native
  sealed trait DELTA extends js.Object
  
  @js.native
  sealed trait FIND extends js.Object
  
  @js.native
  sealed trait FLAG extends js.Object
  
  @js.native
  sealed trait FORMAT extends js.Object
  
  @js.native
  sealed trait FORMAT_EMAIL_FLAGS extends js.Object
  
  @js.native
  sealed trait LINE extends js.Object
  
  @js.native
  sealed trait OPTION extends js.Object
  
  @js.native
  sealed trait STATS_FORMAT extends js.Object
  
  @js.native
  object DELTA extends js.Object {
    @js.native
    sealed trait ADDED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait CONFLICTED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait COPIED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait DELETED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait IGNORED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait MODIFIED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait RENAMED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait TYPECHANGE
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait UNMODIFIED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait UNREADABLE
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    @js.native
    sealed trait UNTRACKED
      extends nodegitLib.diffMod.DiffNs.DELTA
    
    /* 1 */ val ADDED: ADDED with scala.Double = js.native
    /* 10 */ val CONFLICTED: CONFLICTED with scala.Double = js.native
    /* 5 */ val COPIED: COPIED with scala.Double = js.native
    /* 2 */ val DELETED: DELETED with scala.Double = js.native
    /* 6 */ val IGNORED: IGNORED with scala.Double = js.native
    /* 3 */ val MODIFIED: MODIFIED with scala.Double = js.native
    /* 4 */ val RENAMED: RENAMED with scala.Double = js.native
    /* 8 */ val TYPECHANGE: TYPECHANGE with scala.Double = js.native
    /* 0 */ val UNMODIFIED: UNMODIFIED with scala.Double = js.native
    /* 9 */ val UNREADABLE: UNREADABLE with scala.Double = js.native
    /* 7 */ val UNTRACKED: UNTRACKED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.DELTA with scala.Double] = js.native
  }
  
  @js.native
  object FIND extends js.Object {
    @js.native
    sealed trait ALL
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait AND_BREAK_REWRITES
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait BREAK_REWRITES
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait BREAK_REWRITES_FOR_RENAMES_ONLY
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait BY_CONFIG
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait COPIES
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait COPIES_FROM_UNMODIFIED
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait DONT_IGNORE_WHITESPACE
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait EXACT_MATCH_ONLY
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait FOR_UNTRACKED
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait IGNORE_LEADING_WHITESPACE
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait IGNORE_WHITESPACE
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait REMOVE_UNMODIFIED
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait RENAMES
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait RENAMES_FROM_REWRITES
      extends nodegitLib.diffMod.DiffNs.FIND
    
    @js.native
    sealed trait REWRITES
      extends nodegitLib.diffMod.DiffNs.FIND
    
    /* 255 */ val ALL: ALL with scala.Double = js.native
    /* 48 */ val AND_BREAK_REWRITES: AND_BREAK_REWRITES with scala.Double = js.native
    /* 32 */ val BREAK_REWRITES: BREAK_REWRITES with scala.Double = js.native
    /* 32768 */ val BREAK_REWRITES_FOR_RENAMES_ONLY: BREAK_REWRITES_FOR_RENAMES_ONLY with scala.Double = js.native
    /* 0 */ val BY_CONFIG: BY_CONFIG with scala.Double = js.native
    /* 4 */ val COPIES: COPIES with scala.Double = js.native
    /* 8 */ val COPIES_FROM_UNMODIFIED: COPIES_FROM_UNMODIFIED with scala.Double = js.native
    /* 8192 */ val DONT_IGNORE_WHITESPACE: DONT_IGNORE_WHITESPACE with scala.Double = js.native
    /* 16384 */ val EXACT_MATCH_ONLY: EXACT_MATCH_ONLY with scala.Double = js.native
    /* 64 */ val FOR_UNTRACKED: FOR_UNTRACKED with scala.Double = js.native
    /* 0 */ val IGNORE_LEADING_WHITESPACE: IGNORE_LEADING_WHITESPACE with scala.Double = js.native
    /* 4096 */ val IGNORE_WHITESPACE: IGNORE_WHITESPACE with scala.Double = js.native
    /* 65536 */ val REMOVE_UNMODIFIED: REMOVE_UNMODIFIED with scala.Double = js.native
    /* 1 */ val RENAMES: RENAMES with scala.Double = js.native
    /* 2 */ val RENAMES_FROM_REWRITES: RENAMES_FROM_REWRITES with scala.Double = js.native
    /* 16 */ val REWRITES: REWRITES with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FIND with scala.Double] = js.native
  }
  
  @js.native
  object FLAG extends js.Object {
    @js.native
    sealed trait BINARY
      extends nodegitLib.diffMod.DiffNs.FLAG
    
    @js.native
    sealed trait EXISTS
      extends nodegitLib.diffMod.DiffNs.FLAG
    
    @js.native
    sealed trait NOT_BINARY
      extends nodegitLib.diffMod.DiffNs.FLAG
    
    @js.native
    sealed trait VALID_ID
      extends nodegitLib.diffMod.DiffNs.FLAG
    
    /* 1 */ val BINARY: BINARY with scala.Double = js.native
    /* 8 */ val EXISTS: EXISTS with scala.Double = js.native
    /* 2 */ val NOT_BINARY: NOT_BINARY with scala.Double = js.native
    /* 4 */ val VALID_ID: VALID_ID with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FLAG with scala.Double] = js.native
  }
  
  @js.native
  object FORMAT extends js.Object {
    @js.native
    sealed trait NAME_ONLY
      extends nodegitLib.diffMod.DiffNs.FORMAT
    
    @js.native
    sealed trait NAME_STATUS
      extends nodegitLib.diffMod.DiffNs.FORMAT
    
    @js.native
    sealed trait PATCH
      extends nodegitLib.diffMod.DiffNs.FORMAT
    
    @js.native
    sealed trait PATCH_HEADER
      extends nodegitLib.diffMod.DiffNs.FORMAT
    
    @js.native
    sealed trait RAW
      extends nodegitLib.diffMod.DiffNs.FORMAT
    
    /* 4 */ val NAME_ONLY: NAME_ONLY with scala.Double = js.native
    /* 5 */ val NAME_STATUS: NAME_STATUS with scala.Double = js.native
    /* 1 */ val PATCH: PATCH with scala.Double = js.native
    /* 2 */ val PATCH_HEADER: PATCH_HEADER with scala.Double = js.native
    /* 3 */ val RAW: RAW with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FORMAT with scala.Double] = js.native
  }
  
  @js.native
  object FORMAT_EMAIL_FLAGS extends js.Object {
    @js.native
    sealed trait FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER
      extends nodegitLib.diffMod.DiffNs.FORMAT_EMAIL_FLAGS
    
    @js.native
    sealed trait FORMAT_EMAIL_NONE
      extends nodegitLib.diffMod.DiffNs.FORMAT_EMAIL_FLAGS
    
    /* 1 */ val FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER: FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER with scala.Double = js.native
    /* 0 */ val FORMAT_EMAIL_NONE: FORMAT_EMAIL_NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FORMAT_EMAIL_FLAGS with scala.Double] = js.native
  }
  
  @js.native
  object LINE extends js.Object {
    @js.native
    sealed trait ADDITION
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait ADD_EOFNL
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait BINARY
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait CONTEXT
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait CONTEXT_EOFNL
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait DELETION
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait DEL_EOFNL
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait FILE_HDR
      extends nodegitLib.diffMod.DiffNs.LINE
    
    @js.native
    sealed trait HUNK_HDR
      extends nodegitLib.diffMod.DiffNs.LINE
    
    /* 43 */ val ADDITION: ADDITION with scala.Double = js.native
    /* 62 */ val ADD_EOFNL: ADD_EOFNL with scala.Double = js.native
    /* 66 */ val BINARY: BINARY with scala.Double = js.native
    /* 32 */ val CONTEXT: CONTEXT with scala.Double = js.native
    /* 61 */ val CONTEXT_EOFNL: CONTEXT_EOFNL with scala.Double = js.native
    /* 45 */ val DELETION: DELETION with scala.Double = js.native
    /* 60 */ val DEL_EOFNL: DEL_EOFNL with scala.Double = js.native
    /* 70 */ val FILE_HDR: FILE_HDR with scala.Double = js.native
    /* 72 */ val HUNK_HDR: HUNK_HDR with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.LINE with scala.Double] = js.native
  }
  
  @js.native
  object OPTION extends js.Object {
    @js.native
    sealed trait DISABLE_PATHSPEC_MATCH
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait ENABLE_FAST_UNTRACKED_DIRS
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait FORCE_BINARY
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait FORCE_TEXT
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait IGNORE_CASE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait IGNORE_FILEMODE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait IGNORE_SUBMODULES
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait IGNORE_WHITESPACE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait IGNORE_WHITESPACE_CHANGE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait IGNORE_WHITESPACE_EOL
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_CASECHANGE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_IGNORED
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_TYPECHANGE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_TYPECHANGE_TREES
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_UNMODIFIED
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_UNREADABLE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_UNREADABLE_AS_UNTRACKED
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait INCLUDE_UNTRACKED
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait MINIMAL
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait NORMAL
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait PATIENCE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait RECURSE_IGNORED_DIRS
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait RECURSE_UNTRACKED_DIRS
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait REVERSE
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait SHOW_BINARY
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait SHOW_UNMODIFIED
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait SHOW_UNTRACKED_CONTENT
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait SKIP_BINARY_CHECK
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    @js.native
    sealed trait UPDATE_INDEX
      extends nodegitLib.diffMod.DiffNs.OPTION
    
    /* 4096 */ val DISABLE_PATHSPEC_MATCH: DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 16384 */ val ENABLE_FAST_UNTRACKED_DIRS: ENABLE_FAST_UNTRACKED_DIRS with scala.Double = js.native
    /* 2097152 */ val FORCE_BINARY: FORCE_BINARY with scala.Double = js.native
    /* 1048576 */ val FORCE_TEXT: FORCE_TEXT with scala.Double = js.native
    /* 1024 */ val IGNORE_CASE: IGNORE_CASE with scala.Double = js.native
    /* 256 */ val IGNORE_FILEMODE: IGNORE_FILEMODE with scala.Double = js.native
    /* 512 */ val IGNORE_SUBMODULES: IGNORE_SUBMODULES with scala.Double = js.native
    /* 4194304 */ val IGNORE_WHITESPACE: IGNORE_WHITESPACE with scala.Double = js.native
    /* 8388608 */ val IGNORE_WHITESPACE_CHANGE: IGNORE_WHITESPACE_CHANGE with scala.Double = js.native
    /* 16777216 */ val IGNORE_WHITESPACE_EOL: IGNORE_WHITESPACE_EOL with scala.Double = js.native
    /* 2048 */ val INCLUDE_CASECHANGE: INCLUDE_CASECHANGE with scala.Double = js.native
    /* 2 */ val INCLUDE_IGNORED: INCLUDE_IGNORED with scala.Double = js.native
    /* 64 */ val INCLUDE_TYPECHANGE: INCLUDE_TYPECHANGE with scala.Double = js.native
    /* 128 */ val INCLUDE_TYPECHANGE_TREES: INCLUDE_TYPECHANGE_TREES with scala.Double = js.native
    /* 32 */ val INCLUDE_UNMODIFIED: INCLUDE_UNMODIFIED with scala.Double = js.native
    /* 65536 */ val INCLUDE_UNREADABLE: INCLUDE_UNREADABLE with scala.Double = js.native
    /* 131072 */ val INCLUDE_UNREADABLE_AS_UNTRACKED: INCLUDE_UNREADABLE_AS_UNTRACKED with scala.Double = js.native
    /* 8 */ val INCLUDE_UNTRACKED: INCLUDE_UNTRACKED with scala.Double = js.native
    /* 536870912 */ val MINIMAL: MINIMAL with scala.Double = js.native
    /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
    /* 268435456 */ val PATIENCE: PATIENCE with scala.Double = js.native
    /* 4 */ val RECURSE_IGNORED_DIRS: RECURSE_IGNORED_DIRS with scala.Double = js.native
    /* 16 */ val RECURSE_UNTRACKED_DIRS: RECURSE_UNTRACKED_DIRS with scala.Double = js.native
    /* 1 */ val REVERSE: REVERSE with scala.Double = js.native
    /* 1073741824 */ val SHOW_BINARY: SHOW_BINARY with scala.Double = js.native
    /* 67108864 */ val SHOW_UNMODIFIED: SHOW_UNMODIFIED with scala.Double = js.native
    /* 33554432 */ val SHOW_UNTRACKED_CONTENT: SHOW_UNTRACKED_CONTENT with scala.Double = js.native
    /* 8192 */ val SKIP_BINARY_CHECK: SKIP_BINARY_CHECK with scala.Double = js.native
    /* 32768 */ val UPDATE_INDEX: UPDATE_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.OPTION with scala.Double] = js.native
  }
  
  @js.native
  object STATS_FORMAT extends js.Object {
    @js.native
    sealed trait STATS_FULL
      extends nodegitLib.diffMod.DiffNs.STATS_FORMAT
    
    @js.native
    sealed trait STATS_INCLUDE_SUMMARY
      extends nodegitLib.diffMod.DiffNs.STATS_FORMAT
    
    @js.native
    sealed trait STATS_NONE
      extends nodegitLib.diffMod.DiffNs.STATS_FORMAT
    
    @js.native
    sealed trait STATS_NUMBER
      extends nodegitLib.diffMod.DiffNs.STATS_FORMAT
    
    @js.native
    sealed trait STATS_SHORT
      extends nodegitLib.diffMod.DiffNs.STATS_FORMAT
    
    /* 1 */ val STATS_FULL: STATS_FULL with scala.Double = js.native
    /* 8 */ val STATS_INCLUDE_SUMMARY: STATS_INCLUDE_SUMMARY with scala.Double = js.native
    /* 0 */ val STATS_NONE: STATS_NONE with scala.Double = js.native
    /* 4 */ val STATS_NUMBER: STATS_NUMBER with scala.Double = js.native
    /* 2 */ val STATS_SHORT: STATS_SHORT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.STATS_FORMAT with scala.Double] = js.native
  }
  
}

