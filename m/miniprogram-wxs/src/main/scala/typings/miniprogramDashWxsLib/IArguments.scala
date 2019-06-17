package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArguments
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  var callee: Function
  var length: scala.Double
}

object IArguments {
  @scala.inline
  def apply(
    callee: Function,
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null
  ): IArguments = {
    val __obj = js.Dynamic.literal(callee = callee, length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[IArguments]
  }
}

