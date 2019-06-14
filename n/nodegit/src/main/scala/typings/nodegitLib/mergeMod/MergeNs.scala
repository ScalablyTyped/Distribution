package typings
package nodegitLib.mergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/merge", "Merge")
@js.native
object MergeNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - NONE: 0
  - NORMAL: 1
  - UP_TO_DATE: 2
  - FASTFORWARD: 4
  - UNBORN: 8
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`8`
  */
  trait ANALYSIS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - NORMAL: 0
  - OURS: 1
  - THEIRS: 2
  - UNION: 3
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`3`
  */
  trait FILE_FAVOR extends js.Object
  
  /* Inlined `const enum`. Members: 
  - FILE_DEFAULT: 0
  - FILE_STYLE_MERGE: 1
  - FILE_STYLE_DIFF3: 2
  - FILE_SIMPLIFY_ALNUM: 4
  - FILE_IGNORE_WHITESPACE: 8
  - FILE_IGNORE_WHITESPACE_CHANGE: 16
  - FILE_IGNORE_WHITESPACE_EOL: 32
  - FILE_DIFF_PATIENCE: 64
  - FILE_DIFF_MINIMAL: 128
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
    - nodegitLib.nodegitLibNumbers.`4`
    - nodegitLib.nodegitLibNumbers.`8`
    - nodegitLib.nodegitLibNumbers.`16`
    - nodegitLib.nodegitLibNumbers.`32`
    - nodegitLib.nodegitLibNumbers.`64`
    - nodegitLib.nodegitLibNumbers.`128`
  */
  trait FILE_FLAGS extends js.Object
  
  /* Inlined `const enum`. Members: 
  - NONE: 0
  - NO_FASTFORWARD: 1
  - FASTFORWARD_ONLY: 2
    */
  /* Rewritten from type alias, can be one of: 
    - nodegitLib.nodegitLibNumbers.`0`
    - nodegitLib.nodegitLibNumbers.`1`
    - nodegitLib.nodegitLibNumbers.`2`
  */
  trait PREFERENCE extends js.Object
  
  /* Inlined `const enum`. Members: 
  - TREE_FIND_RENAMES: 1
    */
  type TREE_FLAG = nodegitLib.nodegitLibNumbers.`1`
}

