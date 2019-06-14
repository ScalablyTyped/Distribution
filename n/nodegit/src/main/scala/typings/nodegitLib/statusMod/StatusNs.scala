package typings
package nodegitLib.statusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status", "Status")
@js.native
object StatusNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - INCLUDE_UNTRACKED: 1
  - INCLUDE_IGNORED: 2
  - INCLUDE_UNMODIFIED: 4
  - EXCLUDE_SUBMODULES: 8
  - RECURSE_UNTRACKED_DIRS: 16
  - DISABLE_PATHSPEC_MATCH: 32
  - RECURSE_IGNORED_DIRS: 64
  - RENAMES_HEAD_TO_INDEX: 128
  - RENAMES_INDEX_TO_WORKDIR: 256
  - SORT_CASE_SENSITIVELY: 512
  - SORT_CASE_INSENSITIVELY: 1024
  - RENAMES_FROM_REWRITES: 2048
  - NO_REFRESH: 4096
  - UPDATE_INDEX: 8192
  - INCLUDE_UNREADABLE: 16384
  - INCLUDE_UNREADABLE_AS_UNTRACKED: 32768
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`8`
    - nodegitLib.nodegitLibNumbers.`16`
    - nodegitLib.nodegitLibNumbers.`32`
    - nodegitLib.nodegitLibNumbers.`64`
    - nodegitLib.nodegitLibNumbers.`128`
    - nodegitLib.nodegitLibNumbers.`256`
    - nodegitLib.nodegitLibNumbers.`512`
    - nodegitLib.nodegitLibNumbers.`1024`
    - nodegitLib.nodegitLibNumbers.`2048`
    - nodegitLib.nodegitLibNumbers.`4096`
    - nodegitLib.nodegitLibNumbers.`8192`
    - nodegitLib.nodegitLibNumbers.`16384`
    - nodegitLib.nodegitLibNumbers.`32768`
  */
  trait OPT extends js.Object
  
  /* Inlined `const enum`. Members: 
  - INDEX_AND_WORKDIR: 0
  - INDEX_ONLY: 1
  - WORKDIR_ONLY: 2
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
  */
  trait SHOW extends js.Object
  
  /* Inlined `const enum`. Members: 
  - CURRENT: 0
  - INDEX_NEW: 1
  - INDEX_MODIFIED: 2
  - INDEX_DELETED: 4
  - INDEX_RENAMED: 8
  - INDEX_TYPECHANGE: 16
  - WT_NEW: 128
  - WT_MODIFIED: 256
  - WT_DELETED: 512
  - WT_TYPECHANGE: 1024
  - WT_RENAMED: 2048
  - WT_UNREADABLE: 4096
  - IGNORED: 16384
  - CONFLICTED: 32768
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`8`
    - nodegitLib.nodegitLibNumbers.`16`
    - nodegitLib.nodegitLibNumbers.`128`
    - nodegitLib.nodegitLibNumbers.`256`
    - nodegitLib.nodegitLibNumbers.`512`
    - nodegitLib.nodegitLibNumbers.`1024`
    - nodegitLib.nodegitLibNumbers.`2048`
    - nodegitLib.nodegitLibNumbers.`4096`
    - nodegitLib.nodegitLibNumbers.`16384`
    - nodegitLib.nodegitLibNumbers.`32768`
  */
  trait STATUS extends js.Object
  
}

