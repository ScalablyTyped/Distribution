package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollbarVisibility with Double] = js.native
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 2 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 3 */ @js.native
  object Visible extends TopLevel[Visible with Double]
  
}

