package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/diff-stats", JSImport.Namespace)
@js.native
object diffStatsMod extends js.Object {
  
  @js.native
  class DiffStats () extends js.Object {
    
    /**
      * @returns - total number of deletions in the diff
      */
    def deletions(): Number = js.native
    
    /**
      * @returns - total number of files changed in the diff
      */
    def filesChanged(): Number = js.native
    
    /**
      * @returns - total number of insertions in the diff
      */
    def insertions(): Number = js.native
    
    /**
      * @param format - Formatting option.
      * @param width - Target width for output (only affects GIT_DIFF_STATS_FULL)
      * @returns - buffer to store the formatted diff statistics in.
      */
    def toBuf(format: Number, width: Number): js.Promise[Buf] = js.native
  }
}
