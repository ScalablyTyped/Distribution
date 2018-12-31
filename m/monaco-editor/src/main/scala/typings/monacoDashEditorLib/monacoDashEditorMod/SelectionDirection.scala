package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionDirection extends js.Object

@JSImport("monaco-editor", "SelectionDirection")
@js.native
object SelectionDirection extends js.Object {
  /**
    * The selection starts above where it ends.
    */
  @js.native
  sealed trait LTR
    extends monacoDashEditorLib.monacoDashEditorMod.SelectionDirection
  
  /**
    * The selection starts below where it ends.
    */
  @js.native
  sealed trait RTL
    extends monacoDashEditorLib.monacoDashEditorMod.SelectionDirection
  
  /* 0 */ val LTR: LTR with scala.Double = js.native
  /* 1 */ val RTL: RTL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.SelectionDirection with scala.Double] = js.native
}

