package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollbarVisibility extends js.Object

@JSImport("monaco-editor", "editor.ScrollbarVisibility")
@js.native
object ScrollbarVisibility extends js.Object {
  @js.native
  sealed trait Auto extends ScrollbarVisibility
  
  @js.native
  sealed trait Hidden extends ScrollbarVisibility
  
  @js.native
  sealed trait Visible extends ScrollbarVisibility
  
  /* 1 */ val Auto: typings.monacoDashEditor.monacoDashEditorMod.editor.ScrollbarVisibility.Auto with Double = js.native
  /* 2 */ val Hidden: typings.monacoDashEditor.monacoDashEditorMod.editor.ScrollbarVisibility.Hidden with Double = js.native
  /* 3 */ val Visible: typings.monacoDashEditor.monacoDashEditorMod.editor.ScrollbarVisibility.Visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollbarVisibility with Double] = js.native
}

