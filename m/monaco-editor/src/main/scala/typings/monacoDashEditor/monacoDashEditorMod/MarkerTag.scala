package typings.monacoDashEditor.monacoDashEditorMod

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.MarkerTag.Deprecated
import typings.monacoDashEditor.monacoDashEditorMod.MarkerTag.Unnecessary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerTag extends js.Object

@JSImport("monaco-editor", "MarkerTag")
@js.native
object MarkerTag extends js.Object {
  @js.native
  sealed trait Deprecated extends MarkerTag
  
  @js.native
  sealed trait Unnecessary extends MarkerTag
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerTag with Double] = js.native
  /* 2 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
  
  /* 1 */ @js.native
  object Unnecessary extends TopLevel[Unnecessary with Double]
  
}

