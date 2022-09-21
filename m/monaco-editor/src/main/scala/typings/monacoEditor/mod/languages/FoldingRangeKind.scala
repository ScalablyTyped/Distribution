package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.FoldingRangeKind")
@js.native
open class FoldingRangeKind protected () extends StObject {
  /**
    * Creates a new {@link FoldingRangeKind}.
    *
    * @param value of the kind.
    */
  def this(value: String) = this()
  
  var value: String = js.native
}
/* static members */
object FoldingRangeKind {
  
  /**
    * Kind for folding range representing a comment. The value of the kind is 'comment'.
    */
  @JSImport("monaco-editor", "languages.FoldingRangeKind.Comment")
  @js.native
  val Comment: FoldingRangeKind = js.native
  
  /**
    * Kind for folding range representing a import. The value of the kind is 'imports'.
    */
  @JSImport("monaco-editor", "languages.FoldingRangeKind.Imports")
  @js.native
  val Imports: FoldingRangeKind = js.native
  
  /**
    * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
    * The value of the kind is 'region'.
    */
  @JSImport("monaco-editor", "languages.FoldingRangeKind.Region")
  @js.native
  val Region: FoldingRangeKind = js.native
}
