package typings.monacoEditor.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionDirection extends js.Object
@JSImport("monaco-editor", "SelectionDirection")
@js.native
object SelectionDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
  
  /**
    * The selection starts above where it ends.
    */
  @js.native
  sealed trait LTR extends SelectionDirection
  /* 0 */ @js.native
  object LTR extends TopLevel[LTR with Double]
  
  /**
    * The selection starts below where it ends.
    */
  @js.native
  sealed trait RTL extends SelectionDirection
  /* 1 */ @js.native
  object RTL extends TopLevel[RTL with Double]
}
