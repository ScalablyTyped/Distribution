package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPopulateOptions extends js.Object {
  /** optional query conditions to match */
  var `match`: js.UndefOr[js.Any] = js.undefined
  /** optional name of the model to use for population */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** optional query options like sort, limit, etc */
  var options: js.UndefOr[js.Any] = js.undefined
  /** space delimited path(s) to populate */
  var path: java.lang.String
  /** deep populate */
  var populate: js.UndefOr[ModelPopulateOptions | js.Array[ModelPopulateOptions]] = js.undefined
  /** optional fields to select */
  var select: js.UndefOr[js.Any] = js.undefined
}

object ModelPopulateOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    `match`: js.Any = null,
    model: java.lang.String = null,
    options: js.Any = null,
    populate: ModelPopulateOptions | js.Array[ModelPopulateOptions] = null,
    select: js.Any = null
  ): ModelPopulateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (model != null) __obj.updateDynamic("model")(model)
    if (options != null) __obj.updateDynamic("options")(options)
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ModelPopulateOptions]
  }
}

