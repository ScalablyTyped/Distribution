package typings
package nodegitLib.stashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/stash", "Stash")
@js.native
object StashNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - APPLY_DEFAULT: 0
  - APPLY_REINSTATE_INDEX: 1
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
  */
  trait APPLY_FLAGS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - NONE: 0
  - LOADING_STASH: 1
  - ANALYZE_INDEX: 2
  - ANALYZE_MODIFIED: 3
  - ANALYZE_UNTRACKED: 4
  - CHECKOUT_UNTRACKED: 5
  - CHECKOUT_MODIFIED: 6
  - DONE: 7
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`3`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`5`
    - nodegitLib.nodegitLibNumbers.`6`
    - nodegitLib.nodegitLibNumbers.`7`
  */
  trait APPLY_PROGRESS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - DEFAULT: 0
  - KEEP_INDEX: 1
  - INCLUDE_UNTRACKED: 2
  - INCLUDE_IGNORED: 4
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
  */
  trait FLAGS extends js.Object
  
}

