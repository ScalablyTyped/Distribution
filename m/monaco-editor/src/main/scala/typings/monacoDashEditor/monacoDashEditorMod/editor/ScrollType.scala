package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollType with Double] = js.native
  /* 1 */ @js.native
  object Immediate extends TopLevel[Immediate with Double]
  
  /* 0 */ @js.native
  object Smooth extends TopLevel[Smooth with Double]
  
}

