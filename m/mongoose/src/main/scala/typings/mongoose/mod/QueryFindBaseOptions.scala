package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://mongoosejs.com/docs/api.html#query_Query-setOptions
trait QueryFindBaseOptions extends js.Object {
  /** Sets a default collation for every query and aggregation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  var explain: js.UndefOr[js.Any] = js.undefined
  var lean: js.UndefOr[Boolean] = js.undefined
  var populate: js.UndefOr[String | ModelPopulateOptions] = js.undefined
  /** like select, it determines which fields to return */
  var projection: js.UndefOr[js.Any] = js.undefined
  /** use client session for transaction */
  var session: js.UndefOr[ClientSession] = js.undefined
}

object QueryFindBaseOptions {
  @scala.inline
  def apply(
    collation: CollationOptions = null,
    explain: js.Any = null,
    lean: js.UndefOr[Boolean] = js.undefined,
    populate: String | ModelPopulateOptions = null,
    projection: js.Any = null,
    session: ClientSession = null
  ): QueryFindBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (explain != null) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean.get.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFindBaseOptions]
  }
}

