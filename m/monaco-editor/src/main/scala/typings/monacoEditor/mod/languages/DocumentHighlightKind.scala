package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentHighlightKind with Double] = js.native
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
  
  /* 0 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /* 2 */ @js.native
  object Write extends TopLevel[Write with Double]
  
}

