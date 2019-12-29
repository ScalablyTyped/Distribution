package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrappingIndent with Double] = js.native
  /* 3 */ @js.native
  object DeepIndent extends TopLevel[DeepIndent with Double]
  
  /* 2 */ @js.native
  object Indent extends TopLevel[Indent with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Same extends TopLevel[Same with Double]
  
}

