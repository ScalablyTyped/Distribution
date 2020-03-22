package typings.minappEnv

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor
  extends Instantiable0[Array[js.Any]]
     with Instantiable1[
      (/* arrayLength */ Double) | (/* items (repeated) */ js.Object), 
      Array[js.Any | js.Object]
    ] {
  def apply(): Array[_] = js.native
  def apply(arrayLength: Double): Array[_] = js.native
  def apply[T](items: T*): Array[T] = js.native
  /**
    * Creates an array from an array-like object.
    * @param arrayLike An array-like object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T, U](arrayLike: ArrayLike[T]): Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T, U](iterable: Iterable[T]): Array[U] = js.native
  def from[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def from[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  def isArray(arg: js.Any): /* is minapp-env.Array<any> */ scala.Boolean = js.native
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of[T](items: T*): Array[T] = js.native
}

