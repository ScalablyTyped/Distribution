package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderMinimap extends StObject
@JSImport("monaco-editor", "editor.RenderMinimap")
@js.native
object RenderMinimap extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMinimap & Double] = js.native
  
  @js.native
  sealed trait Blocks
    extends StObject
       with RenderMinimap
  /* 2 */ val Blocks: typings.monacoEditor.mod.editor.RenderMinimap.Blocks & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with RenderMinimap
  /* 0 */ val None: typings.monacoEditor.mod.editor.RenderMinimap.None & Double = js.native
  
  @js.native
  sealed trait Text
    extends StObject
       with RenderMinimap
  /* 1 */ val Text: typings.monacoEditor.mod.editor.RenderMinimap.Text & Double = js.native
}
