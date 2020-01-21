package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag with Double] = js.native
  /* 1 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
  
}

