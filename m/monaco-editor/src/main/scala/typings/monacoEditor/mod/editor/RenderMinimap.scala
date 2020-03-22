package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderMinimap extends js.Object

@JSImport("monaco-editor", "editor.RenderMinimap")
@js.native
object RenderMinimap extends js.Object {
  @js.native
  sealed trait Blocks extends RenderMinimap
  
  @js.native
  sealed trait None extends RenderMinimap
  
  @js.native
  sealed trait Text extends RenderMinimap
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMinimap with Double] = js.native
  /* 2 */ @js.native
  object Blocks extends TopLevel[Blocks with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

