package typings.mendixmodelsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "utils")
@js.native
object utils extends js.Object {
  def assertNotNull[T](value: T, propertyName: String): Unit = js.native
  def assertNotNull[T](value: T, propertyName: String, listy: Boolean): Unit = js.native
  /**
    * Combines the given `parts` and returns them as an URL, avoiding duplicate slashes.
    */
  def combineUrl(parts: String*): String = js.native
  /**
    * Flattens an array of arrays of items of type `T`, returning a single array
    * that consists of the concatenation of the original arrays.
    */
  def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = js.native
  def isBrowser(): Boolean = js.native
  def isObject(data: js.Any): Boolean = js.native
  /**
    * Generates a random UUID to set the ID of an element or unit to.
    * There is no intrinsic ID collision detection/avoidance mechanism but it's good enough in practice.
    */
  def randomUuid(): String = js.native
  def removeFromArray[T](list: js.Array[T], item: T): Unit = js.native
  def shallowEquals(first: js.Array[_], second: js.Array[_]): Boolean = js.native
}

