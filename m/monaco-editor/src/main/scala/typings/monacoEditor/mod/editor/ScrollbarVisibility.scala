package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollbarVisibility extends StObject
@JSImport("monaco-editor", "editor.ScrollbarVisibility")
@js.native
object ScrollbarVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollbarVisibility with Double] = js.native
  
  @js.native
  sealed trait Auto extends ScrollbarVisibility
  /* 1 */ val Auto: typings.monacoEditor.mod.editor.ScrollbarVisibility.Auto with Double = js.native
  
  @js.native
  sealed trait Hidden extends ScrollbarVisibility
  /* 2 */ val Hidden: typings.monacoEditor.mod.editor.ScrollbarVisibility.Hidden with Double = js.native
  
  @js.native
  sealed trait Visible extends ScrollbarVisibility
  /* 3 */ val Visible: typings.monacoEditor.mod.editor.ScrollbarVisibility.Visible with Double = js.native
}
