package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinimapPosition extends js.Object

@JSImport("monaco-editor", "editor.MinimapPosition")
@js.native
object MinimapPosition extends js.Object {
  @js.native
  sealed trait Gutter extends MinimapPosition
  
  @js.native
  sealed trait Inline extends MinimapPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MinimapPosition with Double] = js.native
  /* 2 */ @js.native
  object Gutter extends TopLevel[Gutter with Double]
  
  /* 1 */ @js.native
  object Inline extends TopLevel[Inline with Double]
  
}

