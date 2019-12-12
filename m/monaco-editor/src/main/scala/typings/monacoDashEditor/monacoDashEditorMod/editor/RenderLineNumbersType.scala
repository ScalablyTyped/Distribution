package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Custom
import typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Interval
import typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Off
import typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.On
import typings.monacoDashEditor.monacoDashEditorMod.editor.RenderLineNumbersType.Relative
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderLineNumbersType with Double] = js.native
  /* 4 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 3 */ @js.native
  object Interval extends TopLevel[Interval with Double]
  
  /* 0 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  /* 1 */ @js.native
  object On extends TopLevel[On with Double]
  
  /* 2 */ @js.native
  object Relative extends TopLevel[Relative with Double]
  
}

