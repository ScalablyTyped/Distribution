package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinimapPosition extends js.Object

@JSImport("monaco-editor", "editor.MinimapPosition")
@js.native
object MinimapPosition extends js.Object {
  @js.native
  sealed trait Inline extends MinimapPosition
  
  /* 1 */ val Inline: typings.monacoDashEditor.monacoDashEditorMod.editor.MinimapPosition.Inline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MinimapPosition with Double] = js.native
}

