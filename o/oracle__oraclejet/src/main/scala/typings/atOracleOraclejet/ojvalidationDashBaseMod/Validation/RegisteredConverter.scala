package typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RegisteredConverter extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
  var `type`: String
}

object RegisteredConverter {
  @scala.inline
  def apply(`type`: String, options: js.Object = null): RegisteredConverter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[RegisteredConverter]
  }
}

