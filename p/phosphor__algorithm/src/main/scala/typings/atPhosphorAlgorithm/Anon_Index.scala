package typings.atPhosphorAlgorithm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends js.Object {
  var index: Double
  var value: js.UndefOr[T] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply[T](index: Double, value: T = null): Anon_Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

