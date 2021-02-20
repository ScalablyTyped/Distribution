package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WrappingIndent extends StObject
@JSImport("monaco-editor", "editor.WrappingIndent")
@js.native
object WrappingIndent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrappingIndent with Double] = js.native
  
  /**
    * DeepIndent => wrapped lines get +2 indentation toward the parent.
    */
  @js.native
  sealed trait DeepIndent extends WrappingIndent
  /* 3 */ val DeepIndent: typings.monacoEditor.mod.editor.WrappingIndent.DeepIndent with Double = js.native
  
  /**
    * Indent => wrapped lines get +1 indentation toward the parent.
    */
  @js.native
  sealed trait Indent extends WrappingIndent
  /* 2 */ val Indent: typings.monacoEditor.mod.editor.WrappingIndent.Indent with Double = js.native
  
  /**
    * No indentation => wrapped lines begin at column 1.
    */
  @js.native
  sealed trait None extends WrappingIndent
  /* 0 */ val None: typings.monacoEditor.mod.editor.WrappingIndent.None with Double = js.native
  
  /**
    * Same => wrapped lines get the same indentation as the parent.
    */
  @js.native
  sealed trait Same extends WrappingIndent
  /* 1 */ val Same: typings.monacoEditor.mod.editor.WrappingIndent.Same with Double = js.native
}
