package typings.miniprogramDashWxs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArguments
  extends /* index */ NumberDictionary[js.Any] {
  var callee: Function
  var length: Double
}

object IArguments {
  @scala.inline
  def apply(callee: Function, length: Double, NumberDictionary: /* index */ NumberDictionary[js.Any] = null): IArguments = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[IArguments]
  }
}

