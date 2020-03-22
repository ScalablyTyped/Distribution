package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAndValidateOptions[K] extends js.Object {
  var cast: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[K]] = js.undefined
  var simulation: js.UndefOr[Boolean] = js.undefined
  var stopOnFirstError: js.UndefOr[Boolean] = js.undefined
}

object SaveAndValidateOptions {
  @scala.inline
  def apply[K](
    cast: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[K] = null,
    simulation: js.UndefOr[Boolean] = js.undefined,
    stopOnFirstError: js.UndefOr[Boolean] = js.undefined
  ): SaveAndValidateOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cast)) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(simulation)) __obj.updateDynamic("simulation")(simulation.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnFirstError)) __obj.updateDynamic("stopOnFirstError")(stopOnFirstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAndValidateOptions[K]]
  }
}

