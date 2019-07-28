package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryUpdateOptions extends ModelUpdateOptions {
  /**
    * if set to 'query' and runValidators is on, this will refer to the query
    * in customvalidator functions that update validation runs. Does nothing
    * if runValidators is false.
    */
  var context: js.UndefOr[String] = js.undefined
}

object QueryUpdateOptions {
  @scala.inline
  def apply(
    context: String = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    multipleCastError: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    runValidators: js.UndefOr[Boolean] = js.undefined,
    safe: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): QueryUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators)
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[QueryUpdateOptions]
  }
}

