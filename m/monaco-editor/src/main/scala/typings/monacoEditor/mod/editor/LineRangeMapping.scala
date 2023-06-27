package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.LineRangeMapping")
@js.native
open class LineRangeMapping protected () extends StObject {
  def this(originalRange: LineRange, modifiedRange: LineRange) = this()
  def this(originalRange: LineRange, modifiedRange: LineRange, innerChanges: js.Array[RangeMapping]) = this()
  
  def changedLineCount: Any = js.native
  
  /**
    * If inner changes have not been computed, this is set to undefined.
    * Otherwise, it represents the character-level diff in this line range.
    * The original range of each range mapping should be contained in the original line range (same for modified), exceptions are new-lines.
    * Must not be an empty array.
    */
  val innerChanges: js.UndefOr[js.Array[RangeMapping]] = js.native
  
  /**
    * The line range in the modified text model.
    */
  val modifiedRange: LineRange = js.native
  
  /**
    * The line range in the original text model.
    */
  val originalRange: LineRange = js.native
}
/* static members */
object LineRangeMapping {
  
  @JSImport("monaco-editor", "editor.LineRangeMapping")
  @js.native
  val ^ : js.Any = js.native
  
  inline def inverse(mapping: js.Array[LineRangeMapping], originalLineCount: Double, modifiedLineCount: Double): js.Array[LineRangeMapping] = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(mapping.asInstanceOf[js.Any], originalLineCount.asInstanceOf[js.Any], modifiedLineCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[LineRangeMapping]]
}
