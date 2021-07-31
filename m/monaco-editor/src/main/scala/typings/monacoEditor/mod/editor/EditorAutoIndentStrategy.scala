package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditorAutoIndentStrategy extends StObject
@JSImport("monaco-editor", "editor.EditorAutoIndentStrategy")
@js.native
object EditorAutoIndentStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorAutoIndentStrategy & Double] = js.native
  
  @js.native
  sealed trait Advanced
    extends StObject
       with EditorAutoIndentStrategy
  /* 3 */ val Advanced: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Advanced & Double = js.native
  
  @js.native
  sealed trait Brackets
    extends StObject
       with EditorAutoIndentStrategy
  /* 2 */ val Brackets: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Brackets & Double = js.native
  
  @js.native
  sealed trait Full
    extends StObject
       with EditorAutoIndentStrategy
  /* 4 */ val Full: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Full & Double = js.native
  
  @js.native
  sealed trait Keep
    extends StObject
       with EditorAutoIndentStrategy
  /* 1 */ val Keep: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Keep & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EditorAutoIndentStrategy
  /* 0 */ val None: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.None & Double = js.native
}
