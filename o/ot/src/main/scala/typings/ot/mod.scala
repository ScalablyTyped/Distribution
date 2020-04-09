package typings.ot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Selection () extends js.Object {
    def createCursor(position: Double): Selection = js.native
  }
  
  @js.native
  class TextOperation () extends js.Object {
    var baseLength: Double = js.native
    var targetLength: Double = js.native
    @JSName("apply")
    def apply(code: String): String = js.native
    def compose(operation: TextOperation): TextOperation = js.native
    def delete(length: Double): TextOperation = js.native
    def insert(str: String): TextOperation = js.native
    def retain(length: Double): TextOperation = js.native
    def toJSON(): SerializedTextOperation = js.native
  }
  
  @js.native
  object Selection extends js.Object {
    @js.native
    class Range protected () extends js.Object {
      def this(anchor: Double, head: Double) = this()
      var anchor: Double = js.native
      var head: Double = js.native
      def transform(operation: TextOperation): Range = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object TextOperation extends js.Object {
    def fromJSON(operation: SerializedTextOperation): TextOperation = js.native
    def isDelete(operation: TextOperation): Boolean = js.native
    def isInsert(operation: TextOperation): Boolean = js.native
    def isRetain(operation: TextOperation): Boolean = js.native
    def transform(left: TextOperation, right: TextOperation): TextOperation = js.native
  }
  
  type SerializedTextOperation = js.Array[String | Double]
}

