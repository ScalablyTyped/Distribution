package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionDirection extends StObject
@JSImport("monaco-editor", "SelectionDirection")
@js.native
object SelectionDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
  
  /**
    * The selection starts above where it ends.
    */
  @js.native
  sealed trait LTR extends SelectionDirection
  /* 0 */ val LTR: typings.monacoEditor.mod.SelectionDirection.LTR with Double = js.native
  
  /**
    * The selection starts below where it ends.
    */
  @js.native
  sealed trait RTL extends SelectionDirection
  /* 1 */ val RTL: typings.monacoEditor.mod.SelectionDirection.RTL with Double = js.native
}
