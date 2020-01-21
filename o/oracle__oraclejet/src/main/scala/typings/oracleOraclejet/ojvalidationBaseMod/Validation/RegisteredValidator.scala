package typings.oracleOraclejet.ojvalidationBaseMod.Validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RegisteredValidator extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
  var `type`: String
}

object RegisteredValidator {
  @scala.inline
  def apply(`type`: String, options: js.Object = null): RegisteredValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredValidator]
  }
}

