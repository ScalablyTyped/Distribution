package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditorAutoIndentStrategy extends StObject
@JSImport("monaco-editor", "editor.EditorAutoIndentStrategy")
@js.native
object EditorAutoIndentStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorAutoIndentStrategy with Double] = js.native
  
  @js.native
  sealed trait Advanced extends EditorAutoIndentStrategy
  /* 3 */ val Advanced: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Advanced with Double = js.native
  
  @js.native
  sealed trait Brackets extends EditorAutoIndentStrategy
  /* 2 */ val Brackets: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Brackets with Double = js.native
  
  @js.native
  sealed trait Full extends EditorAutoIndentStrategy
  /* 4 */ val Full: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Full with Double = js.native
  
  @js.native
  sealed trait Keep extends EditorAutoIndentStrategy
  /* 1 */ val Keep: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Keep with Double = js.native
  
  @js.native
  sealed trait None extends EditorAutoIndentStrategy
  /* 0 */ val None: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.None with Double = js.native
}
