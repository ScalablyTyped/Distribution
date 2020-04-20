package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessObj extends js.Object {
  var httpResponseCode: Double
}

object SuccessObj {
  @scala.inline
  def apply(httpResponseCode: Double): SuccessObj = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessObj]
  }
}

