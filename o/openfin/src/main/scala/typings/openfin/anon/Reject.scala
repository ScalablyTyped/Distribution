package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reject extends js.Object {
  var reject: js.Function
  var resolve: js.Function
}

object Reject {
  @scala.inline
  def apply(reject: js.Function, resolve: js.Function): Reject = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
}

