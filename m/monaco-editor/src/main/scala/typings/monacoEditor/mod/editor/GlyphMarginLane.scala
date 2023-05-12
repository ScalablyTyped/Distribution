package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GlyphMarginLane extends StObject
@JSImport("monaco-editor", "editor.GlyphMarginLane")
@js.native
object GlyphMarginLane extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GlyphMarginLane & Double] = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with GlyphMarginLane
  /* 1 */ val Left: typings.monacoEditor.mod.editor.GlyphMarginLane.Left & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with GlyphMarginLane
  /* 2 */ val Right: typings.monacoEditor.mod.editor.GlyphMarginLane.Right & Double = js.native
}
