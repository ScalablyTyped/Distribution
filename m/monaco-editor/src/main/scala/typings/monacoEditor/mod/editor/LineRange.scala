package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.LineRange")
@js.native
open class LineRange protected () extends StObject {
  def this(startLineNumber: Double, endLineNumberExclusive: Double) = this()
  
  /**
    * Indicates if this line range contains the given line number.
    */
  def contains(lineNumber: Double): Boolean = js.native
  
  /**
    * Moves this line range by the given offset of line numbers.
    */
  def delta(offset: Double): LineRange = js.native
  
  /**
    * The end line number (exclusive).
    */
  val endLineNumberExclusive: Double = js.native
  
  def equals(b: LineRange): Boolean = js.native
  
  /**
    * The resulting range is empty if the ranges do not intersect, but touch.
    * If the ranges don't even touch, the result is undefined.
    */
  def intersect(other: LineRange): js.UndefOr[LineRange] = js.native
  
  /**
    * Indicates if this line range is empty.
    */
  def isEmpty: Boolean = js.native
  
  /**
    * Creates a line range that combines this and the given line range.
    */
  def join(other: LineRange): LineRange = js.native
  
  /**
    * The number of lines this line range spans.
    */
  def length: Double = js.native
  
  def overlapOrTouch(other: LineRange): Boolean = js.native
  
  /**
    * The start line number.
    */
  val startLineNumber: Double = js.native
}
/* static members */
object LineRange {
  
  @JSImport("monaco-editor", "editor.LineRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param lineRanges1 Must be sorted.
    * @param lineRanges2 Must be sorted.
    */
  inline def join(lineRanges1: js.Array[LineRange], lineRanges2: js.Array[LineRange]): js.Array[LineRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(lineRanges1.asInstanceOf[js.Any], lineRanges2.asInstanceOf[js.Any])).asInstanceOf[js.Array[LineRange]]
  
  /**
    * @param lineRanges An array of sorted line ranges.
    */
  inline def joinMany(lineRanges: js.Array[js.Array[LineRange]]): js.Array[LineRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("joinMany")(lineRanges.asInstanceOf[js.Any]).asInstanceOf[js.Array[LineRange]]
}
