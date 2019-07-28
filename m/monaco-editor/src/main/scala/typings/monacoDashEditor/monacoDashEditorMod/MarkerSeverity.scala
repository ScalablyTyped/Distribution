package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSeverity extends js.Object

@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends js.Object {
  @js.native
  sealed trait Error extends MarkerSeverity
  
  @js.native
  sealed trait Hint extends MarkerSeverity
  
  @js.native
  sealed trait Info extends MarkerSeverity
  
  @js.native
  sealed trait Warning extends MarkerSeverity
  
  /* 8 */ val Error: typings.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Error with Double = js.native
  /* 1 */ val Hint: typings.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Hint with Double = js.native
  /* 2 */ val Info: typings.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Info with Double = js.native
  /* 4 */ val Warning: typings.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSeverity with Double] = js.native
}

