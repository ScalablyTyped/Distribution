package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArguments
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  var callee: Function
  /** Iterator */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[_]]
  var length: scala.Double
}

object IArguments {
  @scala.inline
  def apply(
    callee: Function,
    iterator: js.Function0[IterableIterator[_]],
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null
  ): IArguments = {
    val __obj = js.Dynamic.literal(callee = callee, iterator = iterator, length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[IArguments]
  }
}

