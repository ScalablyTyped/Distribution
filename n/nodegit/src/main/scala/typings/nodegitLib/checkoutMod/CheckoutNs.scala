package typings
package nodegitLib.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/checkout", "Checkout")
@js.native
object CheckoutNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - NONE: 0
  - CONFLICT: 1
  - DIRTY: 2
  - UPDATED: 4
  - UNTRACKED: 8
  - IGNORED: 16
  - ALL: 65535
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`8`
    - nodegitLib.nodegitLibNumbers.`16`
    - nodegitLib.nodegitLibNumbers.`65535`
  */
  trait NOTIFY extends js.Object
  
  /* Inlined `const enum`. Members: 
  - NONE: 0
  - SAFE: 1
  - FORCE: 2
  - RECREATE_MISSING: 4
  - ALLOW_CONFLICTS: 16
  - REMOVE_UNTRACKED: 32
  - REMOVE_IGNORED: 64
  - UPDATE_ONLY: 128
  - DONT_UPDATE_INDEX: 256
  - NO_REFRESH: 512
  - SKIP_UNMERGED: 1024
  - USE_OURS: 2048
  - USE_THEIRS: 4096
  - DISABLE_PATHSPEC_MATCH: 8192
  - SKIP_LOCKED_DIRECTORIES: 262144
  - DONT_OVERWRITE_IGNORED: 524288
  - CONFLICT_STYLE_MERGE: 1048576
  - CONFLICT_STYLE_DIFF3: 2097152
  - DONT_REMOVE_EXISTING: 4194304
  - DONT_WRITE_INDEX: 8388608
  - UPDATE_SUBMODULES: 65536
  - UPDATE_SUBMODULES_IF_CHANGED: 131072
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
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
    - nodegitLib.nodegitLibNumbers.`262144`
    - nodegitLib.nodegitLibNumbers.`524288`
    - nodegitLib.nodegitLibNumbers.`1048576`
    - nodegitLib.nodegitLibNumbers.`2097152`
    - nodegitLib.nodegitLibNumbers.`4194304`
    - nodegitLib.nodegitLibNumbers.`8388608`
    - nodegitLib.nodegitLibNumbers.`65536`
    - nodegitLib.nodegitLibNumbers.`131072`
  */
  trait STRATEGY extends js.Object
  
}

