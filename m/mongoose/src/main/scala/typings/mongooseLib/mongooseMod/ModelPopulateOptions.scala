package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPopulateOptions extends QueryPopulateOptions {
  /** optional, if true Mongoose will always set path to an array. Inferred from schema by default */
  var justOne: js.UndefOr[scala.Boolean] = js.undefined
}

object ModelPopulateOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    justOne: js.UndefOr[scala.Boolean] = js.undefined,
    `match`: js.Any = null,
    model: java.lang.String = null,
    options: js.Any = null,
    populate: QueryPopulateOptions | js.Array[QueryPopulateOptions] = null,
    select: js.Any = null
  ): ModelPopulateOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(justOne)) __obj.updateDynamic("justOne")(justOne)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (model != null) __obj.updateDynamic("model")(model)
    if (options != null) __obj.updateDynamic("options")(options)
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ModelPopulateOptions]
  }
}

