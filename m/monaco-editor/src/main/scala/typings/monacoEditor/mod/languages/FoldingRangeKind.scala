package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.FoldingRangeKind")
@js.native
class FoldingRangeKind protected () extends js.Object {
  /**
    * Creates a new [FoldingRangeKind](#FoldingRangeKind).
    *
    * @param value of the kind.
    */
  def this(value: String) = this()
  var value: String = js.native
}

/* static members */
@JSImport("monaco-editor", "languages.FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  /**
    * Kind for folding range representing a comment. The value of the kind is 'comment'.
    */
  val Comment: FoldingRangeKind = js.native
  /**
    * Kind for folding range representing a import. The value of the kind is 'imports'.
    */
  val Imports: FoldingRangeKind = js.native
  /**
    * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
    * The value of the kind is 'region'.
    */
  val Region: FoldingRangeKind = js.native
}

