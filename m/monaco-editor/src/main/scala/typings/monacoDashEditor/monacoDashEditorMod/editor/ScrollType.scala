package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollType extends js.Object

@JSImport("monaco-editor", "editor.ScrollType")
@js.native
object ScrollType extends js.Object {
  @js.native
  sealed trait Immediate extends ScrollType
  
  @js.native
  sealed trait Smooth extends ScrollType
  
  /* 1 */ val Immediate: typings.monacoDashEditor.monacoDashEditorMod.editor.ScrollType.Immediate with Double = js.native
  /* 0 */ val Smooth: typings.monacoDashEditor.monacoDashEditorMod.editor.ScrollType.Smooth with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollType with Double] = js.native
}

