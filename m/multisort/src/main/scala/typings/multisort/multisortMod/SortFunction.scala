package typings.multisort.multisortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sorting function.
  */
@js.native
trait SortFunction[T] extends js.Object {
  def apply(toSort: js.Array[T]): Unit = js.native
  /**
    * To allow this to plug in to other sorting mechanisms.
    */
  def comparator(a: T, b: T): Double = js.native
}

