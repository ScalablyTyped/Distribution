package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Blame")
@js.native
object BlameNs extends js.Object {
  @js.native
  object FLAG extends js.Object {
    /* 16 */ val FIRST_PARENT: nodegitLib.blameMod.BlameNs.FLAG.FIRST_PARENT with scala.Double = js.native
    /* 0 */ val NORMAL: nodegitLib.blameMod.BlameNs.FLAG.NORMAL with scala.Double = js.native
    /* 8 */ val TRACK_COPIES_ANY_COMMIT_COPIES: nodegitLib.blameMod.BlameNs.FLAG.TRACK_COPIES_ANY_COMMIT_COPIES with scala.Double = js.native
    /* 4 */ val TRACK_COPIES_SAME_COMMIT_COPIES: nodegitLib.blameMod.BlameNs.FLAG.TRACK_COPIES_SAME_COMMIT_COPIES with scala.Double = js.native
    /* 2 */ val TRACK_COPIES_SAME_COMMIT_MOVES: nodegitLib.blameMod.BlameNs.FLAG.TRACK_COPIES_SAME_COMMIT_MOVES with scala.Double = js.native
    /* 1 */ val TRACK_COPIES_SAME_FILE: nodegitLib.blameMod.BlameNs.FLAG.TRACK_COPIES_SAME_FILE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.blameMod.BlameNs.FLAG with scala.Double] = js.native
  }
  
  type FLAG = nodegitLib.blameMod.BlameNs.FLAG
}

