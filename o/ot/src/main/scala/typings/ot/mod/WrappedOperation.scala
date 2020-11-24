package typings.ot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "WrappedOperation")
@js.native
class WrappedOperation[T] protected () extends js.Object {
  def this(operation: TextOperation) = this()
  def this(operation: TextOperation, meta: T) = this()
  
  @JSName("apply")
  def apply(doc: String): String = js.native
  
  def compose(operation: WrappedOperation[T]): WrappedOperation[T] = js.native
  
  def invert(doc: String): WrappedOperation[T] = js.native
  
  var meta: T = js.native
  
  var wrapped: TextOperation = js.native
}
/* static members */
@JSImport("ot", "WrappedOperation")
@js.native
object WrappedOperation extends js.Object {
  
  def transform[T](left: WrappedOperation[T], right: WrappedOperation[T]): WrappedOperation[T] = js.native
}
