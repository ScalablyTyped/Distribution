package typings.monacoDashEditor.monacoDashEditorMod

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
  sealed trait LTR extends SelectionDirection
  
  /**
    * The selection starts below where it ends.
    */
  @js.native
  sealed trait RTL extends SelectionDirection
  
  /* 0 */ val LTR: typings.monacoDashEditor.monacoDashEditorMod.SelectionDirection.LTR with Double = js.native
  /* 1 */ val RTL: typings.monacoDashEditor.monacoDashEditorMod.SelectionDirection.RTL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
}

