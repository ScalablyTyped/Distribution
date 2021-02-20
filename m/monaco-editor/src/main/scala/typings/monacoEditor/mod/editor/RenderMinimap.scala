package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderMinimap extends StObject
@JSImport("monaco-editor", "editor.RenderMinimap")
@js.native
object RenderMinimap extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMinimap with Double] = js.native
  
  @js.native
  sealed trait Blocks extends RenderMinimap
  /* 2 */ val Blocks: typings.monacoEditor.mod.editor.RenderMinimap.Blocks with Double = js.native
  
  @js.native
  sealed trait None extends RenderMinimap
  /* 0 */ val None: typings.monacoEditor.mod.editor.RenderMinimap.None with Double = js.native
  
  @js.native
  sealed trait Text extends RenderMinimap
  /* 1 */ val Text: typings.monacoEditor.mod.editor.RenderMinimap.Text with Double = js.native
}
