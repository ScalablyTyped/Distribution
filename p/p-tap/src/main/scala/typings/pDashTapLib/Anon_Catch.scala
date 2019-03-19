package typings
package pDashTapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Catch extends js.Object {
  /**
  	 * Tap into a promise chain without affecting its value or state. Use this in a `.then()` method.
  	 *
  	 * @param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
  	 * @returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	 */
  def apply[ValueType](tapHandler: js.Function1[/* value */ ValueType, _]): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  /**
  	 * Tap into a promise chain without affecting its value or state. Use this in a `.catch()` method.
  	 *
  	 * @param tapHandler - Any return value is ignored. Exceptions thrown in `tapHandler` are relayed back to the original promise chain. If `tapHandler` returns a `Promise`, it will be awaited before passing through the original value.
  	 * @returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	 */
  def `catch`[ErrorType](tapHandler: js.Function1[/* error */ ErrorType, _]): js.Function1[/* error */ ErrorType, js.Promise[scala.Nothing]] = js.native
}

