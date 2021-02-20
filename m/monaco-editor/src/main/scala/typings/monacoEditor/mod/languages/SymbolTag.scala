package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolTag extends StObject
@JSImport("monaco-editor", "languages.SymbolTag")
@js.native
object SymbolTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag with Double] = js.native
  
  @js.native
  sealed trait Deprecated extends SymbolTag
  /* 1 */ val Deprecated: typings.monacoEditor.mod.languages.SymbolTag.Deprecated with Double = js.native
}
