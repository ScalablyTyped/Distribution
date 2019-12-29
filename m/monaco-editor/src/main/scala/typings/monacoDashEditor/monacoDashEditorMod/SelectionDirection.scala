package typings.monacoDashEditor.monacoDashEditorMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
  /* 0 */ @js.native
  object LTR extends TopLevel[LTR with Double]
  
  /* 1 */ @js.native
  object RTL extends TopLevel[RTL with Double]
  
}

