package typings
package nodeDashValidatorLib.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validatable extends js.Object {
  @JSName("validate")
  var validate_Original: ValidateFn = js.native
  def validate(
    value: js.Any,
    onError: js.Function3[
      /* message */ java.lang.String, 
      /* childName */ java.lang.String, 
      /* childValie */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

