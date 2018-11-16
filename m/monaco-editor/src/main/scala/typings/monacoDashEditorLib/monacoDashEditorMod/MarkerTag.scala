package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerTag extends js.Object

@JSImport("monaco-editor", "MarkerTag")
@js.native
object MarkerTag extends js.Object {
  @js.native
  sealed trait Unnecessary
    extends monacoDashEditorLib.monacoDashEditorMod.MarkerTag
  
  /* 1 */ val Unnecessary: Unnecessary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.MarkerTag with scala.Double] = js.native
}

