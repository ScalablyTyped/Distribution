package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentHighlightKind extends js.Object

@JSImport("monaco-editor", "languages.DocumentHighlightKind")
@js.native
object DocumentHighlightKind extends js.Object {
  /**
    * Read-access of a symbol, like reading a variable.
    */
  @js.native
  sealed trait Read extends DocumentHighlightKind
  
  /**
    * A textual occurrence.
    */
  @js.native
  sealed trait Text extends DocumentHighlightKind
  
  /**
    * Write-access of a symbol, like writing to a variable.
    */
  @js.native
  sealed trait Write extends DocumentHighlightKind
  
  /* 1 */ val Read: typings.monacoDashEditor.monacoDashEditorMod.languages.DocumentHighlightKind.Read with Double = js.native
  /* 0 */ val Text: typings.monacoDashEditor.monacoDashEditorMod.languages.DocumentHighlightKind.Text with Double = js.native
  /* 2 */ val Write: typings.monacoDashEditor.monacoDashEditorMod.languages.DocumentHighlightKind.Write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentHighlightKind with Double] = js.native
}

