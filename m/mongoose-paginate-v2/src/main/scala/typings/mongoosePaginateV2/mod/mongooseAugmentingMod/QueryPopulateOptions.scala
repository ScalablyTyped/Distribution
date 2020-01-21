package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import typings.mongoose.mod.Model_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPopulateOptions extends js.Object {
  /** optional query conditions to match */
  var `match`: js.UndefOr[js.Any] = js.undefined
  /** optional model to use for population */
  var model: js.UndefOr[String | (Model_[_, js.Object])] = js.undefined
  /** optional query options like sort, limit, etc */
  var options: js.UndefOr[js.Any] = js.undefined
  /** space delimited path(s) to populate */
  var path: String
  /** deep populate */
  var populate: js.UndefOr[QueryPopulateOptions | js.Array[QueryPopulateOptions]] = js.undefined
  /** optional fields to select */
  var select: js.UndefOr[js.Any] = js.undefined
}

object QueryPopulateOptions {
  @scala.inline
  def apply(
    path: String,
    `match`: js.Any = null,
    model: String | (Model_[_, js.Object]) = null,
    options: js.Any = null,
    populate: QueryPopulateOptions | js.Array[QueryPopulateOptions] = null,
    select: js.Any = null
  ): QueryPopulateOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPopulateOptions]
  }
}

