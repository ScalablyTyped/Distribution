package typings.phosphorCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/coreutils/lib/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  @js.native
  /**
    * Construct a new promise delegate.
    */
  class PromiseDelegate[T] () extends js.Object {
    var _reject: js.Any = js.native
    var _resolve: js.Any = js.native
    /**
      * The promise wrapped by the delegate.
      */
    val promise: js.Promise[T] = js.native
    /**
      * Reject the wrapped promise with the given value.
      *
      * @reason - The reason for rejecting the promise.
      */
    def reject(reason: js.Any): Unit = js.native
    /**
      * Resolve the wrapped promise with the given value.
      *
      * @param value - The value to use for resolving the promise.
      */
    def resolve(value: T): Unit = js.native
    def resolve(value: js.Thenable[T]): Unit = js.native
  }
  
}

