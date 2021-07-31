package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "SimpleTextOperation")
@js.native
class SimpleTextOperation () extends StObject {
  
  @JSName("apply")
  def apply(doc: String): String = js.native
  
  def equals(other: SimpleTextOperation): Boolean = js.native
}
/* static members */
object SimpleTextOperation {
  
  @JSImport("ot", "SimpleTextOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Delete `count` many characters at the zero-based `position` in the document.
    */
  @JSImport("ot", "SimpleTextOperation.Delete")
  @js.native
  class Delete protected () extends SimpleTextOperation {
    def this(count: Double, position: Double) = this()
  }
  
  /**
    * Insert the string `str` at the zero-based `position` in the document.
    */
  @JSImport("ot", "SimpleTextOperation.Insert")
  @js.native
  class Insert protected () extends SimpleTextOperation {
    def this(str: String, position: Double) = this()
  }
  
  /**
    * An operation that does nothing. This is needed for the result of the
    * transformation of two deletions of the same character.
    */
  @JSImport("ot", "SimpleTextOperation.Noop")
  @js.native
  class Noop () extends SimpleTextOperation
  
  /**
    * Convert a normal, composable `TextOperation` into an array of
    * `SimpleTextOperation`s.
    * @param operation The op
    */
  @scala.inline
  def fromTextOperation(operation: TextOperation): js.Array[SimpleTextOperation] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTextOperation")(operation.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimpleTextOperation]]
  
  @scala.inline
  def transform(a: SimpleTextOperation, b: SimpleTextOperation): js.Tuple2[SimpleTextOperation, SimpleTextOperation] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[SimpleTextOperation, SimpleTextOperation]]
}
