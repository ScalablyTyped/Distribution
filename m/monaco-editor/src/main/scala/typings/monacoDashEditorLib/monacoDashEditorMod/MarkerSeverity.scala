package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSeverity extends js.Object

@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends js.Object {
  @js.native
  sealed trait Error
    extends monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity
  
  @js.native
  sealed trait Hint
    extends monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity
  
  @js.native
  sealed trait Info
    extends monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity
  
  @js.native
  sealed trait Warning
    extends monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity
  
  /* 8 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Hint: Hint with scala.Double = js.native
  /* 2 */ val Info: Info with scala.Double = js.native
  /* 4 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.MarkerSeverity with scala.Double] = js.native
}

