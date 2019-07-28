package typings.nodegit.stashMod

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
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
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
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`3`
    - typings.nodegit.nodegitNumbers.`4`
    - typings.nodegit.nodegitNumbers.`5`
    - typings.nodegit.nodegitNumbers.`6`
    - typings.nodegit.nodegitNumbers.`7`
  */
  trait APPLY_PROGRESS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - DEFAULT: 0
  - KEEP_INDEX: 1
  - INCLUDE_UNTRACKED: 2
  - INCLUDE_IGNORED: 4
    */
  /* Rewritten from type alias, can be one of: 
    - typings.nodegit.nodegitNumbers.`0`
    - typings.nodegit.nodegitNumbers.`1`
    - typings.nodegit.nodegitNumbers.`2`
    - typings.nodegit.nodegitNumbers.`4`
  */
  trait FLAGS extends js.Object
  
}

