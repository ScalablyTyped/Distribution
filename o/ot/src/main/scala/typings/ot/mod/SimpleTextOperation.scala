package typings.ot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "SimpleTextOperation")
@js.native
class SimpleTextOperation () extends js.Object {
  
  @JSName("apply")
  def apply(doc: String): String = js.native
  
  def equals(other: SimpleTextOperation): Boolean = js.native
}
/* static members */
@JSImport("ot", "SimpleTextOperation")
@js.native
object SimpleTextOperation extends js.Object {
  
  /**
    * Convert a normal, composable `TextOperation` into an array of
    * `SimpleTextOperation`s.
    * @param operation The op
    */
  def fromTextOperation(operation: TextOperation): js.Array[SimpleTextOperation] = js.native
  
  def transform(a: SimpleTextOperation, b: SimpleTextOperation): js.Tuple2[SimpleTextOperation, SimpleTextOperation] = js.native
  
  /**
    * Delete `count` many characters at the zero-based `position` in the document.
    */
  @js.native
  class Delete protected () extends SimpleTextOperation {
    def this(count: Double, position: Double) = this()
  }
  
  /**
    * Insert the string `str` at the zero-based `position` in the document.
    */
  @js.native
  class Insert protected () extends SimpleTextOperation {
    def this(str: String, position: Double) = this()
  }
  
  /**
    * An operation that does nothing. This is needed for the result of the
    * transformation of two deletions of the same character.
    */
  @js.native
  class Noop () extends SimpleTextOperation
}
