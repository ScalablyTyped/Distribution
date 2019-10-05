package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderLineNumbersType extends js.Object

@JSImport("monaco-editor", "editor.RenderLineNumbersType")
@js.native
object RenderLineNumbersType extends js.Object {
  @js.native
  sealed trait Custom extends RenderLineNumbersType
  
  @js.native
  sealed trait Interval extends RenderLineNumbersType
  
  @js.native
  sealed trait Off extends RenderLineNumbersType
  
  @js.native
  sealed trait On extends RenderLineNumbersType
  
  @js.native
  sealed trait Relative extends RenderLineNumbersType
  
  /* 4 */ val Custom: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Custom with Double = js.native
  /* 3 */ val Interval: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Interval with Double = js.native
  /* 0 */ val Off: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Off with Double = js.native
  /* 1 */ val On: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.On with Double = js.native
  /* 2 */ val Relative: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Relative with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderLineNumbersType with Double] = js.native
}

