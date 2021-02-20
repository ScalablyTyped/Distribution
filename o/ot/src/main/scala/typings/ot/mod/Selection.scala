package typings.ot.mod

import typings.ot.anon.Anchor
import typings.ot.mod.Selection.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "Selection")
@js.native
class Selection () extends StObject {
  
  /**
    * Return the more current selection information.
    * @param operation The op
    */
  def compose(operation: TextOperation): Selection = js.native
  
  def equals(other: Selection): Boolean = js.native
  
  var position: Double = js.native
  
  var ranges: js.Array[Range] = js.native
  
  var selectionEnd: js.UndefOr[js.Any] = js.native
  
  def somethingSelected(): Boolean = js.native
  
  /**
    * Update the selection with respect to an operation.
    * @param operation The op
    */
  def transform(operation: TextOperation): Selection = js.native
}
/* static members */
object Selection {
  
  /*
    * Range has `anchor` and `head` properties, which are zero-based indices into
    * the document. The `anchor` is the side of the selection that stays fixed,
    * `head` is the side of the selection where the cursor is. When both are
    * equal, the range represents a cursor.
    */
  @JSImport("ot", "Selection.Range")
  @js.native
  class Range protected () extends StObject {
    def this(anchor: Double, head: Double) = this()
    
    var anchor: Double = js.native
    
    def equals(other: Range): Boolean = js.native
    
    var head: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def transform(operation: TextOperation): Range = js.native
  }
  object Range {
    
    /* static member */
    @JSImport("ot", "Selection.Range.fromJSON")
    @js.native
    def fromJSON(`object`: Anchor): Range = js.native
  }
  
  /**
    * Convenience method for creating selections only containing a single cursor
    * and no real selection range.
    * @param position The pos
    */
  @JSImport("ot", "Selection.createCursor")
  @js.native
  def createCursor(position: Double): Selection = js.native
  
  @JSImport("ot", "Selection.fromJSON")
  @js.native
  def fromJSON(obj: String): Selection = js.native
}
