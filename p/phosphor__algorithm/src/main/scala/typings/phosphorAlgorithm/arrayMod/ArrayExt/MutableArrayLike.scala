package typings.phosphorAlgorithm.arrayMod.ArrayExt

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array-like object which supports item assignment.
  */
trait MutableArrayLike[T] extends /* index */ NumberDictionary[T] {
  val length: Double
}

object MutableArrayLike {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): MutableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[MutableArrayLike[T]]
  }
}

