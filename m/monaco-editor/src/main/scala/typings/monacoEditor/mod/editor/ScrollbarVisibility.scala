package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollbarVisibility extends js.Object
@JSImport("monaco-editor", "editor.ScrollbarVisibility")
@js.native
object ScrollbarVisibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollbarVisibility with Double] = js.native
  
  @js.native
  sealed trait Auto extends ScrollbarVisibility
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  @js.native
  sealed trait Hidden extends ScrollbarVisibility
  /* 2 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  @js.native
  sealed trait Visible extends ScrollbarVisibility
  /* 3 */ @js.native
  object Visible extends TopLevel[Visible with Double]
}
