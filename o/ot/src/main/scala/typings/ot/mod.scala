package typings.ot

import typings.ot.anon.Anchor
import typings.ot.mod.Selection.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Selection () extends js.Object {
    var ranges: js.Array[Range] = js.native
    def equals(other: Selection): Boolean = js.native
  }
  
  @js.native
  class TextOperation () extends js.Object {
    var baseLength: Double = js.native
    var ops: SerializedTextOperation = js.native
    var targetLength: Double = js.native
    @JSName("apply")
    def apply(code: String): String = js.native
    def compose(operation: TextOperation): TextOperation = js.native
    def delete(length: Double): TextOperation = js.native
    def insert(str: String): TextOperation = js.native
    def retain(length: Double): TextOperation = js.native
    def toJSON(): SerializedTextOperation = js.native
  }
  
  val version: String = js.native
  /* static members */
  @js.native
  object Selection extends js.Object {
    @js.native
    class Range protected () extends js.Object {
      def this(anchor: Double, head: Double) = this()
      var anchor: Double = js.native
      var head: Double = js.native
      def equals(other: Range): Boolean = js.native
      def isEmpty(): Boolean = js.native
      def transform(operation: TextOperation): Range = js.native
    }
    
    def createCursor(position: Double): Selection = js.native
    /* static members */
    @js.native
    object Range extends js.Object {
      def fromJSON(`object`: Anchor): Range = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object TextOperation extends js.Object {
    def fromJSON(operation: SerializedTextOperation): TextOperation = js.native
    def isDelete(operation: String): Boolean = js.native
    def isDelete(operation: Double): Boolean = js.native
    def isInsert(operation: String): Boolean = js.native
    def isInsert(operation: Double): Boolean = js.native
    def isRetain(operation: String): Boolean = js.native
    def isRetain(operation: Double): Boolean = js.native
    def transform(left: TextOperation, right: TextOperation): TextOperation = js.native
  }
  
  type SerializedTextOperation = js.Array[String | Double]
}

