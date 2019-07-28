package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerTag extends js.Object

@JSImport("monaco-editor", "MarkerTag")
@js.native
object MarkerTag extends js.Object {
  @js.native
  sealed trait Unnecessary extends MarkerTag
  
  /* 1 */ val Unnecessary: typings.monacoDashEditor.monacoDashEditorMod.MarkerTag.Unnecessary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerTag with Double] = js.native
}

