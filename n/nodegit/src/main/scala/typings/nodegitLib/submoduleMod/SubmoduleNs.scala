package typings
package nodegitLib.submoduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/submodule", "Submodule")
@js.native
object SubmoduleNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - UNSPECIFIED: -1
  - NONE: 1
  - UNTRACKED: 2
  - DIRTY: 3
  - ALL: 4
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`-1`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`3`
    - nodegitLib.nodegitLibNumbers.`4`
  */
  trait IGNORE extends js.Object
  
  /* Inlined `const enum`. Members: 
  - NO: 0
  - YES: 1
  - ONDEMAND: 2
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
  */
  trait RECURSE extends js.Object
  
  /* Inlined `const enum`. Members: 
  - IN_HEAD: 1
  - IN_INDEX: 2
  - IN_CONFIG: 4
  - IN_WD: 8
  - INDEX_ADDED: 16
  - INDEX_DELETED: 32
  - INDEX_MODIFIED: 64
  - WD_UNINITIALIZED: 128
  - WD_ADDED: 256
  - WD_DELETED: 512
  - WD_MODIFIED: 1024
  - WD_INDEX_MODIFIED: 2048
  - WD_WD_MODIFIED: 4096
  - WD_UNTRACKED: 8192
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
  */
  trait STATUS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - CHECKOUT: 1
  - REBASE: 2
  - MERGE: 3
  - NONE: 4
  - DEFAULT: 0
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`3`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`0`
  */
  trait UPDATE extends js.Object
  
}

