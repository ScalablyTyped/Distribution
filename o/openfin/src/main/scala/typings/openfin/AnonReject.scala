package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReject extends js.Object {
  var reject: js.Function
  var resolve: js.Function
}

object AnonReject {
  @scala.inline
  def apply(reject: js.Function, resolve: js.Function): AnonReject = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReject]
  }
}

