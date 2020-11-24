package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolTag extends js.Object
@JSImport("monaco-editor", "languages.SymbolTag")
@js.native
object SymbolTag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag with Double] = js.native
  
  @js.native
  sealed trait Deprecated extends SymbolTag
  /* 1 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
}
