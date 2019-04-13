package typings
package multisortLib.multisortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sorting function.
  */
@js.native
trait SortFunction[T] extends js.Object {
  def apply(toSort: js.Array[T]): scala.Unit = js.native
  /**
    * To allow this to plug in to other sorting mechanisms.
    */
  def comparator(a: T, b: T): scala.Double = js.native
}

