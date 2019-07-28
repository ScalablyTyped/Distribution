package typings.nodeDashValidator.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validatable extends js.Object {
  @JSName("validate")
  var validate_Original: ValidateFn = js.native
  def validate(
    value: js.Any,
    onError: js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit]
  ): Unit = js.native
}

