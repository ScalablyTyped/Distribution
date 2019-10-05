package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrappingIndent extends js.Object

@JSImport("monaco-editor", "editor.WrappingIndent")
@js.native
object WrappingIndent extends js.Object {
  /**
    * DeepIndent => wrapped lines get +2 indentation toward the parent.
    */
  @js.native
  sealed trait DeepIndent extends WrappingIndent
  
  /**
    * Indent => wrapped lines get +1 indentation toward the parent.
    */
  @js.native
  sealed trait Indent extends WrappingIndent
  
  /**
    * No indentation => wrapped lines begin at column 1.
    */
  @js.native
  sealed trait None extends WrappingIndent
  
  /**
    * Same => wrapped lines get the same indentation as the parent.
    */
  @js.native
  sealed trait Same extends WrappingIndent
  
  /* 3 */ val DeepIndent: typings.monacoDashEditor.monacoDashEditorMod.editor.WrappingIndent.DeepIndent with Double = js.native
  /* 2 */ val Indent: typings.monacoDashEditor.monacoDashEditorMod.editor.WrappingIndent.Indent with Double = js.native
  /* 0 */ val None: typings.monacoDashEditor.monacoDashEditorMod.editor.WrappingIndent.None with Double = js.native
  /* 1 */ val Same: typings.monacoDashEditor.monacoDashEditorMod.editor.WrappingIndent.Same with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrappingIndent with Double] = js.native
}

