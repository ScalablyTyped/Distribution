package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Diff")
@js.native
object DiffNs extends js.Object {
  @js.native
  object DELTA extends js.Object {
    /* 1 */ val ADDED: nodegitLib.diffMod.DiffNs.DELTA.ADDED with scala.Double = js.native
    /* 10 */ val CONFLICTED: nodegitLib.diffMod.DiffNs.DELTA.CONFLICTED with scala.Double = js.native
    /* 5 */ val COPIED: nodegitLib.diffMod.DiffNs.DELTA.COPIED with scala.Double = js.native
    /* 2 */ val DELETED: nodegitLib.diffMod.DiffNs.DELTA.DELETED with scala.Double = js.native
    /* 6 */ val IGNORED: nodegitLib.diffMod.DiffNs.DELTA.IGNORED with scala.Double = js.native
    /* 3 */ val MODIFIED: nodegitLib.diffMod.DiffNs.DELTA.MODIFIED with scala.Double = js.native
    /* 4 */ val RENAMED: nodegitLib.diffMod.DiffNs.DELTA.RENAMED with scala.Double = js.native
    /* 8 */ val TYPECHANGE: nodegitLib.diffMod.DiffNs.DELTA.TYPECHANGE with scala.Double = js.native
    /* 0 */ val UNMODIFIED: nodegitLib.diffMod.DiffNs.DELTA.UNMODIFIED with scala.Double = js.native
    /* 9 */ val UNREADABLE: nodegitLib.diffMod.DiffNs.DELTA.UNREADABLE with scala.Double = js.native
    /* 7 */ val UNTRACKED: nodegitLib.diffMod.DiffNs.DELTA.UNTRACKED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.DELTA with scala.Double] = js.native
  }
  
  @js.native
  object FIND extends js.Object {
    /* 255 */ val ALL: nodegitLib.diffMod.DiffNs.FIND.ALL with scala.Double = js.native
    /* 48 */ val AND_BREAK_REWRITES: nodegitLib.diffMod.DiffNs.FIND.AND_BREAK_REWRITES with scala.Double = js.native
    /* 32 */ val BREAK_REWRITES: nodegitLib.diffMod.DiffNs.FIND.BREAK_REWRITES with scala.Double = js.native
    /* 32768 */ val BREAK_REWRITES_FOR_RENAMES_ONLY: nodegitLib.diffMod.DiffNs.FIND.BREAK_REWRITES_FOR_RENAMES_ONLY with scala.Double = js.native
    /* 0 */ val BY_CONFIG: nodegitLib.diffMod.DiffNs.FIND.BY_CONFIG with scala.Double = js.native
    /* 4 */ val COPIES: nodegitLib.diffMod.DiffNs.FIND.COPIES with scala.Double = js.native
    /* 8 */ val COPIES_FROM_UNMODIFIED: nodegitLib.diffMod.DiffNs.FIND.COPIES_FROM_UNMODIFIED with scala.Double = js.native
    /* 8192 */ val DONT_IGNORE_WHITESPACE: nodegitLib.diffMod.DiffNs.FIND.DONT_IGNORE_WHITESPACE with scala.Double = js.native
    /* 16384 */ val EXACT_MATCH_ONLY: nodegitLib.diffMod.DiffNs.FIND.EXACT_MATCH_ONLY with scala.Double = js.native
    /* 64 */ val FOR_UNTRACKED: nodegitLib.diffMod.DiffNs.FIND.FOR_UNTRACKED with scala.Double = js.native
    /* 0 */ val IGNORE_LEADING_WHITESPACE: nodegitLib.diffMod.DiffNs.FIND.IGNORE_LEADING_WHITESPACE with scala.Double = js.native
    /* 4096 */ val IGNORE_WHITESPACE: nodegitLib.diffMod.DiffNs.FIND.IGNORE_WHITESPACE with scala.Double = js.native
    /* 65536 */ val REMOVE_UNMODIFIED: nodegitLib.diffMod.DiffNs.FIND.REMOVE_UNMODIFIED with scala.Double = js.native
    /* 1 */ val RENAMES: nodegitLib.diffMod.DiffNs.FIND.RENAMES with scala.Double = js.native
    /* 2 */ val RENAMES_FROM_REWRITES: nodegitLib.diffMod.DiffNs.FIND.RENAMES_FROM_REWRITES with scala.Double = js.native
    /* 16 */ val REWRITES: nodegitLib.diffMod.DiffNs.FIND.REWRITES with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FIND with scala.Double] = js.native
  }
  
  @js.native
  object FLAG extends js.Object {
    /* 1 */ val BINARY: nodegitLib.diffMod.DiffNs.FLAG.BINARY with scala.Double = js.native
    /* 8 */ val EXISTS: nodegitLib.diffMod.DiffNs.FLAG.EXISTS with scala.Double = js.native
    /* 2 */ val NOT_BINARY: nodegitLib.diffMod.DiffNs.FLAG.NOT_BINARY with scala.Double = js.native
    /* 4 */ val VALID_ID: nodegitLib.diffMod.DiffNs.FLAG.VALID_ID with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FLAG with scala.Double] = js.native
  }
  
  @js.native
  object FORMAT extends js.Object {
    /* 4 */ val NAME_ONLY: nodegitLib.diffMod.DiffNs.FORMAT.NAME_ONLY with scala.Double = js.native
    /* 5 */ val NAME_STATUS: nodegitLib.diffMod.DiffNs.FORMAT.NAME_STATUS with scala.Double = js.native
    /* 1 */ val PATCH: nodegitLib.diffMod.DiffNs.FORMAT.PATCH with scala.Double = js.native
    /* 2 */ val PATCH_HEADER: nodegitLib.diffMod.DiffNs.FORMAT.PATCH_HEADER with scala.Double = js.native
    /* 3 */ val RAW: nodegitLib.diffMod.DiffNs.FORMAT.RAW with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FORMAT with scala.Double] = js.native
  }
  
  @js.native
  object FORMAT_EMAIL_FLAGS extends js.Object {
    /* 1 */ val FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER: nodegitLib.diffMod.DiffNs.FORMAT_EMAIL_FLAGS.FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER with scala.Double = js.native
    /* 0 */ val FORMAT_EMAIL_NONE: nodegitLib.diffMod.DiffNs.FORMAT_EMAIL_FLAGS.FORMAT_EMAIL_NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.FORMAT_EMAIL_FLAGS with scala.Double] = js.native
  }
  
  @js.native
  object LINE extends js.Object {
    /* 43 */ val ADDITION: nodegitLib.diffMod.DiffNs.LINE.ADDITION with scala.Double = js.native
    /* 62 */ val ADD_EOFNL: nodegitLib.diffMod.DiffNs.LINE.ADD_EOFNL with scala.Double = js.native
    /* 66 */ val BINARY: nodegitLib.diffMod.DiffNs.LINE.BINARY with scala.Double = js.native
    /* 32 */ val CONTEXT: nodegitLib.diffMod.DiffNs.LINE.CONTEXT with scala.Double = js.native
    /* 61 */ val CONTEXT_EOFNL: nodegitLib.diffMod.DiffNs.LINE.CONTEXT_EOFNL with scala.Double = js.native
    /* 45 */ val DELETION: nodegitLib.diffMod.DiffNs.LINE.DELETION with scala.Double = js.native
    /* 60 */ val DEL_EOFNL: nodegitLib.diffMod.DiffNs.LINE.DEL_EOFNL with scala.Double = js.native
    /* 70 */ val FILE_HDR: nodegitLib.diffMod.DiffNs.LINE.FILE_HDR with scala.Double = js.native
    /* 72 */ val HUNK_HDR: nodegitLib.diffMod.DiffNs.LINE.HUNK_HDR with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.LINE with scala.Double] = js.native
  }
  
  @js.native
  object OPTION extends js.Object {
    /* 4096 */ val DISABLE_PATHSPEC_MATCH: nodegitLib.diffMod.DiffNs.OPTION.DISABLE_PATHSPEC_MATCH with scala.Double = js.native
    /* 16384 */ val ENABLE_FAST_UNTRACKED_DIRS: nodegitLib.diffMod.DiffNs.OPTION.ENABLE_FAST_UNTRACKED_DIRS with scala.Double = js.native
    /* 2097152 */ val FORCE_BINARY: nodegitLib.diffMod.DiffNs.OPTION.FORCE_BINARY with scala.Double = js.native
    /* 1048576 */ val FORCE_TEXT: nodegitLib.diffMod.DiffNs.OPTION.FORCE_TEXT with scala.Double = js.native
    /* 1024 */ val IGNORE_CASE: nodegitLib.diffMod.DiffNs.OPTION.IGNORE_CASE with scala.Double = js.native
    /* 256 */ val IGNORE_FILEMODE: nodegitLib.diffMod.DiffNs.OPTION.IGNORE_FILEMODE with scala.Double = js.native
    /* 512 */ val IGNORE_SUBMODULES: nodegitLib.diffMod.DiffNs.OPTION.IGNORE_SUBMODULES with scala.Double = js.native
    /* 4194304 */ val IGNORE_WHITESPACE: nodegitLib.diffMod.DiffNs.OPTION.IGNORE_WHITESPACE with scala.Double = js.native
    /* 8388608 */ val IGNORE_WHITESPACE_CHANGE: nodegitLib.diffMod.DiffNs.OPTION.IGNORE_WHITESPACE_CHANGE with scala.Double = js.native
    /* 16777216 */ val IGNORE_WHITESPACE_EOL: nodegitLib.diffMod.DiffNs.OPTION.IGNORE_WHITESPACE_EOL with scala.Double = js.native
    /* 2048 */ val INCLUDE_CASECHANGE: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_CASECHANGE with scala.Double = js.native
    /* 2 */ val INCLUDE_IGNORED: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_IGNORED with scala.Double = js.native
    /* 64 */ val INCLUDE_TYPECHANGE: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_TYPECHANGE with scala.Double = js.native
    /* 128 */ val INCLUDE_TYPECHANGE_TREES: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_TYPECHANGE_TREES with scala.Double = js.native
    /* 32 */ val INCLUDE_UNMODIFIED: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_UNMODIFIED with scala.Double = js.native
    /* 65536 */ val INCLUDE_UNREADABLE: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_UNREADABLE with scala.Double = js.native
    /* 131072 */ val INCLUDE_UNREADABLE_AS_UNTRACKED: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_UNREADABLE_AS_UNTRACKED with scala.Double = js.native
    /* 8 */ val INCLUDE_UNTRACKED: nodegitLib.diffMod.DiffNs.OPTION.INCLUDE_UNTRACKED with scala.Double = js.native
    /* 536870912 */ val MINIMAL: nodegitLib.diffMod.DiffNs.OPTION.MINIMAL with scala.Double = js.native
    /* 0 */ val NORMAL: nodegitLib.diffMod.DiffNs.OPTION.NORMAL with scala.Double = js.native
    /* 268435456 */ val PATIENCE: nodegitLib.diffMod.DiffNs.OPTION.PATIENCE with scala.Double = js.native
    /* 4 */ val RECURSE_IGNORED_DIRS: nodegitLib.diffMod.DiffNs.OPTION.RECURSE_IGNORED_DIRS with scala.Double = js.native
    /* 16 */ val RECURSE_UNTRACKED_DIRS: nodegitLib.diffMod.DiffNs.OPTION.RECURSE_UNTRACKED_DIRS with scala.Double = js.native
    /* 1 */ val REVERSE: nodegitLib.diffMod.DiffNs.OPTION.REVERSE with scala.Double = js.native
    /* 1073741824 */ val SHOW_BINARY: nodegitLib.diffMod.DiffNs.OPTION.SHOW_BINARY with scala.Double = js.native
    /* 67108864 */ val SHOW_UNMODIFIED: nodegitLib.diffMod.DiffNs.OPTION.SHOW_UNMODIFIED with scala.Double = js.native
    /* 33554432 */ val SHOW_UNTRACKED_CONTENT: nodegitLib.diffMod.DiffNs.OPTION.SHOW_UNTRACKED_CONTENT with scala.Double = js.native
    /* 8192 */ val SKIP_BINARY_CHECK: nodegitLib.diffMod.DiffNs.OPTION.SKIP_BINARY_CHECK with scala.Double = js.native
    /* 32768 */ val UPDATE_INDEX: nodegitLib.diffMod.DiffNs.OPTION.UPDATE_INDEX with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.OPTION with scala.Double] = js.native
  }
  
  @js.native
  object STATS_FORMAT extends js.Object {
    /* 1 */ val STATS_FULL: nodegitLib.diffMod.DiffNs.STATS_FORMAT.STATS_FULL with scala.Double = js.native
    /* 8 */ val STATS_INCLUDE_SUMMARY: nodegitLib.diffMod.DiffNs.STATS_FORMAT.STATS_INCLUDE_SUMMARY with scala.Double = js.native
    /* 0 */ val STATS_NONE: nodegitLib.diffMod.DiffNs.STATS_FORMAT.STATS_NONE with scala.Double = js.native
    /* 4 */ val STATS_NUMBER: nodegitLib.diffMod.DiffNs.STATS_FORMAT.STATS_NUMBER with scala.Double = js.native
    /* 2 */ val STATS_SHORT: nodegitLib.diffMod.DiffNs.STATS_FORMAT.STATS_SHORT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffMod.DiffNs.STATS_FORMAT with scala.Double] = js.native
  }
  
}

