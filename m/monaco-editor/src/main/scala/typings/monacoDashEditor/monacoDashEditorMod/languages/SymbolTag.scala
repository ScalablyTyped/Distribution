package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolTag extends js.Object

@JSImport("monaco-editor", "languages.SymbolTag")
@js.native
object SymbolTag extends js.Object {
  @js.native
  sealed trait Deprecated extends SymbolTag
  
  /* 1 */ val Deprecated: typings.monacoDashEditor.monacoDashEditorMod.languages.SymbolTag.Deprecated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag with Double] = js.native
}

