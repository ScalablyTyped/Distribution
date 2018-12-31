package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "utils")
@js.native
object utilsNs extends js.Object {
  def assertNotNull[T](value: T, propertyName: java.lang.String): scala.Unit = js.native
  def assertNotNull[T](value: T, propertyName: java.lang.String, listy: scala.Boolean): scala.Unit = js.native
  /**
    * Combines the given `parts` and returns them as an URL, avoiding duplicate slashes.
    */
  def combineUrl(parts: java.lang.String*): java.lang.String = js.native
  /**
    * Flattens an array of arrays of items of type `T`, returning a single array
    * that consists of the concatenation of the original arrays.
    * This is especially useful for arrays of arrays of observables since the `lodash`
    * doesn't handle these correctly.
    */
  def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = js.native
  def isBrowser(): scala.Boolean = js.native
  def isObject(data: js.Any): scala.Boolean = js.native
  /**
    * Generates a random UUID to set the ID of an element or unit to.
    * There is no intrinsic ID collision detection/avoidance mechanism but it's good enough in practice.
    */
  def randomUuid(): java.lang.String = js.native
  def removeFromArray[T](list: js.Array[T], item: T): scala.Unit = js.native
  def shallowEquals(first: js.Array[_], second: js.Array[_]): scala.Boolean = js.native
}

