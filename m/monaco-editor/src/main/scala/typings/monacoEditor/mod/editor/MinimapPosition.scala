package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MinimapPosition extends StObject
@JSImport("monaco-editor", "editor.MinimapPosition")
@js.native
object MinimapPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MinimapPosition & Double] = js.native
  
  @js.native
  sealed trait Gutter
    extends StObject
       with MinimapPosition
  /* 2 */ val Gutter: typings.monacoEditor.mod.editor.MinimapPosition.Gutter & Double = js.native
  
  @js.native
  sealed trait Inline
    extends StObject
       with MinimapPosition
  /* 1 */ val Inline: typings.monacoEditor.mod.editor.MinimapPosition.Inline & Double = js.native
}
