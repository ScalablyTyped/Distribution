package typings.nodegit.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
object DiffNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - UNMODIFIED: 0
  - ADDED: 1
  - DELETED: 2
  - MODIFIED: 3
  - RENAMED: 4
  - COPIED: 5
  - IGNORED: 6
  - UNTRACKED: 7
  - TYPECHANGE: 8
  - UNREADABLE: 9
  - CONFLICTED: 10
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`3`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`5`
    - typings.nodegit.nodegitNumbers.`6`
    - typings.nodegit.nodegitNumbers.`7`
    - typings.nodegit.nodegitNumbers.`8`
    - typings.nodegit.nodegitNumbers.`9`
    - typings.nodegit.nodegitNumbers.`10`
  */
  trait DELTA extends js.Object
  
  /* Inlined `const enum`. Members: 
  - BY_CONFIG: 0
  - RENAMES: 1
  - RENAMES_FROM_REWRITES: 2
  - COPIES: 4
  - COPIES_FROM_UNMODIFIED: 8
  - REWRITES: 16
  - BREAK_REWRITES: 32
  - AND_BREAK_REWRITES: 48
  - FOR_UNTRACKED: 64
  - ALL: 255
  - IGNORE_LEADING_WHITESPACE: 0
  - IGNORE_WHITESPACE: 4096
  - DONT_IGNORE_WHITESPACE: 8192
  - EXACT_MATCH_ONLY: 16384
  - BREAK_REWRITES_FOR_RENAMES_ONLY: 32768
  - REMOVE_UNMODIFIED: 65536
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`8`
    - typings.nodegit.nodegitNumbers.`16`
    - typings.nodegit.nodegitNumbers.`32`
    - typings.nodegit.nodegitNumbers.`48`
    - typings.nodegit.nodegitNumbers.`64`
    - typings.nodegit.nodegitNumbers.`255`
    - typings.nodegit.nodegitNumbers.`4096`
    - typings.nodegit.nodegitNumbers.`8192`
    - typings.nodegit.nodegitNumbers.`16384`
    - typings.nodegit.nodegitNumbers.`32768`
    - typings.nodegit.nodegitNumbers.`65536`
  */
  trait FIND extends js.Object
  
  /* Inlined `const enum`. Members: 
  - BINARY: 1
  - NOT_BINARY: 2
  - VALID_ID: 4
  - EXISTS: 8
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`8`
  */
  trait FLAG extends js.Object
  
  /* Inlined `const enum`. Members: 
  - PATCH: 1
  - PATCH_HEADER: 2
  - RAW: 3
  - NAME_ONLY: 4
  - NAME_STATUS: 5
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`3`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`5`
  */
  trait FORMAT extends js.Object
  
  /* Inlined `const enum`. Members: 
  - FORMAT_EMAIL_NONE: 0
  - FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER: 1
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
  */
  trait FORMAT_EMAIL_FLAGS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - CONTEXT: 32
  - ADDITION: 43
  - DELETION: 45
  - CONTEXT_EOFNL: 61
  - ADD_EOFNL: 62
  - DEL_EOFNL: 60
  - FILE_HDR: 70
  - HUNK_HDR: 72
  - BINARY: 66
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`32`
    - typings.nodegit.nodegitNumbers.`43`
    - typings.nodegit.nodegitNumbers.`45`
    - typings.nodegit.nodegitNumbers.`61`
    - typings.nodegit.nodegitNumbers.`62`
    - typings.nodegit.nodegitNumbers.`60`
    - typings.nodegit.nodegitNumbers.`70`
    - typings.nodegit.nodegitNumbers.`72`
    - typings.nodegit.nodegitNumbers.`66`
  */
  trait LINE extends js.Object
  
  /* Inlined `const enum`. Members: 
  - NORMAL: 0
  - REVERSE: 1
  - INCLUDE_IGNORED: 2
  - RECURSE_IGNORED_DIRS: 4
  - INCLUDE_UNTRACKED: 8
  - RECURSE_UNTRACKED_DIRS: 16
  - INCLUDE_UNMODIFIED: 32
  - INCLUDE_TYPECHANGE: 64
  - INCLUDE_TYPECHANGE_TREES: 128
  - IGNORE_FILEMODE: 256
  - IGNORE_SUBMODULES: 512
  - IGNORE_CASE: 1024
  - INCLUDE_CASECHANGE: 2048
  - DISABLE_PATHSPEC_MATCH: 4096
  - SKIP_BINARY_CHECK: 8192
  - ENABLE_FAST_UNTRACKED_DIRS: 16384
  - UPDATE_INDEX: 32768
  - INCLUDE_UNREADABLE: 65536
  - INCLUDE_UNREADABLE_AS_UNTRACKED: 131072
  - FORCE_TEXT: 1048576
  - FORCE_BINARY: 2097152
  - IGNORE_WHITESPACE: 4194304
  - IGNORE_WHITESPACE_CHANGE: 8388608
  - IGNORE_WHITESPACE_EOL: 16777216
  - SHOW_UNTRACKED_CONTENT: 33554432
  - SHOW_UNMODIFIED: 67108864
  - PATIENCE: 268435456
  - MINIMAL: 536870912
  - SHOW_BINARY: 1073741824
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`8`
    - typings.nodegit.nodegitNumbers.`16`
    - typings.nodegit.nodegitNumbers.`32`
    - typings.nodegit.nodegitNumbers.`64`
    - typings.nodegit.nodegitNumbers.`128`
    - typings.nodegit.nodegitNumbers.`256`
    - typings.nodegit.nodegitNumbers.`512`
    - typings.nodegit.nodegitNumbers.`1024`
    - typings.nodegit.nodegitNumbers.`2048`
    - typings.nodegit.nodegitNumbers.`4096`
    - typings.nodegit.nodegitNumbers.`8192`
    - typings.nodegit.nodegitNumbers.`16384`
    - typings.nodegit.nodegitNumbers.`32768`
    - typings.nodegit.nodegitNumbers.`65536`
    - typings.nodegit.nodegitNumbers.`131072`
    - typings.nodegit.nodegitNumbers.`1048576`
    - typings.nodegit.nodegitNumbers.`2097152`
    - typings.nodegit.nodegitNumbers.`4194304`
    - typings.nodegit.nodegitNumbers.`8388608`
    - typings.nodegit.nodegitNumbers.`16777216`
    - typings.nodegit.nodegitNumbers.`33554432`
    - typings.nodegit.nodegitNumbers.`67108864`
    - typings.nodegit.nodegitNumbers.`268435456`
    - typings.nodegit.nodegitNumbers.`536870912`
    - typings.nodegit.nodegitNumbers.`1073741824`
  */
  trait OPTION extends js.Object
  
  /* Inlined `const enum`. Members: 
  - STATS_NONE: 0
  - STATS_FULL: 1
  - STATS_SHORT: 2
  - STATS_NUMBER: 4
  - STATS_INCLUDE_SUMMARY: 8
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`8`
  */
  trait STATS_FORMAT extends js.Object
  
}

