package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPopulateOptions extends QueryPopulateOptions {
  /** optional, if true Mongoose will always set path to an array. Inferred from schema by default */
  var justOne: js.UndefOr[Boolean] = js.undefined
}

object ModelPopulateOptions {
  @scala.inline
  def apply(
    path: String,
    justOne: js.UndefOr[Boolean] = js.undefined,
    `match`: js.Any = null,
    model: String | (Model[_, js.Object]) = null,
    options: js.Any = null,
    populate: QueryPopulateOptions | js.Array[QueryPopulateOptions] = null,
    select: js.Any = null
  ): ModelPopulateOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(justOne)) __obj.updateDynamic("justOne")(justOne)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[ModelPopulateOptions]
  }
}

