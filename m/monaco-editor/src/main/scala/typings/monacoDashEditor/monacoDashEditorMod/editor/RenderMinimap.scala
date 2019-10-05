package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderMinimap extends js.Object

@JSImport("monaco-editor", "editor.RenderMinimap")
@js.native
object RenderMinimap extends js.Object {
  @js.native
  sealed trait Large extends RenderMinimap
  
  @js.native
  sealed trait LargeBlocks extends RenderMinimap
  
  @js.native
  sealed trait None extends RenderMinimap
  
  @js.native
  sealed trait Small extends RenderMinimap
  
  @js.native
  sealed trait SmallBlocks extends RenderMinimap
  
  /* 2 */ val Large: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderMinimap.Large with Double = js.native
  /* 4 */ val LargeBlocks: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderMinimap.LargeBlocks with Double = js.native
  /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderMinimap.None with Double = js.native
  /* 1 */ val Small: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderMinimap.Small with Double = js.native
  /* 3 */ val SmallBlocks: typings.monacoDashEditor.monacoDashEditorMod.editor.RenderMinimap.SmallBlocks with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMinimap with Double] = js.native
}

