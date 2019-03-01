package typings
package onetimeLib.onetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onetime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Ensure a function is only called once. When called multiple times it will return the return value from the first call.
    *
    * @param fn Function that should only be called once.
    * @returns A function that only calls `fn` once.
    */
  def apply[T /* <: js.Array[_] */, R](fn: js.Function1[/* args */ T, R]): js.Function1[/* args */ T, R] = js.native
  def apply[T /* <: js.Array[_] */, R](fn: js.Function1[/* args */ T, R], options: onetimeLib.onetimeMod.oneTimeNs.Options): js.Function1[/* args */ T, R] = js.native
  /**
    * Get the number of times `fn` has been called.
    *
    * @param fn Function to get call count from.
    * @returns A number representing how many times `fn` has been called.
    *
    * @example
    * const foo = onetime(() => {});
    * foo();
    * foo();
    * foo();
    *
    * console.log(onetime.callCount(foo));
    * //=> 3
    */
  def callCount(fn: js.Function1[/* repeated */ js.Any, _]): js.UndefOr[scala.Double] = js.native
}

