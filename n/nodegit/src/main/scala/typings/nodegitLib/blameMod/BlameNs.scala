package typings
package nodegitLib.blameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/blame", "Blame")
@js.native
object BlameNs extends js.Object {
  @js.native
  sealed trait FLAG extends js.Object
  
  @js.native
  object FLAG extends js.Object {
    @js.native
    sealed trait FIRST_PARENT
      extends nodegitLib.blameMod.BlameNs.FLAG
    
    @js.native
    sealed trait NORMAL
      extends nodegitLib.blameMod.BlameNs.FLAG
    
    @js.native
    sealed trait TRACK_COPIES_ANY_COMMIT_COPIES
      extends nodegitLib.blameMod.BlameNs.FLAG
    
    @js.native
    sealed trait TRACK_COPIES_SAME_COMMIT_COPIES
      extends nodegitLib.blameMod.BlameNs.FLAG
    
    @js.native
    sealed trait TRACK_COPIES_SAME_COMMIT_MOVES
      extends nodegitLib.blameMod.BlameNs.FLAG
    
    @js.native
    sealed trait TRACK_COPIES_SAME_FILE
      extends nodegitLib.blameMod.BlameNs.FLAG
    
    /* 16 */ val FIRST_PARENT: FIRST_PARENT with scala.Double = js.native
    /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
    /* 8 */ val TRACK_COPIES_ANY_COMMIT_COPIES: TRACK_COPIES_ANY_COMMIT_COPIES with scala.Double = js.native
    /* 4 */ val TRACK_COPIES_SAME_COMMIT_COPIES: TRACK_COPIES_SAME_COMMIT_COPIES with scala.Double = js.native
    /* 2 */ val TRACK_COPIES_SAME_COMMIT_MOVES: TRACK_COPIES_SAME_COMMIT_MOVES with scala.Double = js.native
    /* 1 */ val TRACK_COPIES_SAME_FILE: TRACK_COPIES_SAME_FILE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.blameMod.BlameNs.FLAG with scala.Double] = js.native
  }
  
}

