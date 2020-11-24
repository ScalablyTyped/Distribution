package typings.ot.mod

import typings.ot.anon.Anchor
import typings.ot.mod.Selection.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "Selection")
@js.native
class Selection () extends js.Object {
  
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
@JSImport("ot", "Selection")
@js.native
object Selection extends js.Object {
  
  /**
    * Convenience method for creating selections only containing a single cursor
    * and no real selection range.
    * @param position The pos
    */
  def createCursor(position: Double): Selection = js.native
  
  def fromJSON(obj: String): Selection = js.native
  
  /*
    * Range has `anchor` and `head` properties, which are zero-based indices into
    * the document. The `anchor` is the side of the selection that stays fixed,
    * `head` is the side of the selection where the cursor is. When both are
    * equal, the range represents a cursor.
    */
  @js.native
  class Range protected () extends js.Object {
    def this(anchor: Double, head: Double) = this()
    
    var anchor: Double = js.native
    
    def equals(other: Range): Boolean = js.native
    
    var head: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def transform(operation: TextOperation): Range = js.native
  }
  /* static members */
  @js.native
  object Range extends js.Object {
    
    def fromJSON(`object`: Anchor): Range = js.native
  }
}
