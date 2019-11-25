package typings.pDashReflect.pDashReflectMod

import typings.pDashReflect.pDashReflectNumbers.`false`
import typings.pDashReflect.pDashReflectNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseRejectedResult
  extends PromiseResult[js.Any] {
  var isFulfilled: `false`
  var isRejected: `true`
  var reason: js.Any
}

object PromiseRejectedResult {
  @scala.inline
  def apply(isFulfilled: `false`, isRejected: `true`, reason: js.Any): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseRejectedResult]
  }
}

