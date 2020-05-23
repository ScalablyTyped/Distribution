package typings.mongoose.mod

import typings.mongodb.mod.ReadPreferenceMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFindOptions extends QueryFindBaseOptions {
  var batchSize: js.UndefOr[Double] = js.undefined
  var comment: js.UndefOr[js.Any] = js.undefined
  var hint: js.UndefOr[js.Any] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var maxscan: js.UndefOr[Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceMode] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var snapshot: js.UndefOr[js.Any] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var tailable: js.UndefOr[js.Any] = js.undefined
}

object QueryFindOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[Double] = js.undefined,
    collation: CollationOptions = null,
    comment: js.Any = null,
    explain: js.Any = null,
    hint: js.Any = null,
    lean: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    maxscan: js.UndefOr[Double] = js.undefined,
    populate: String | ModelPopulateOptions = null,
    projection: js.Any = null,
    readPreference: ReadPreferenceMode = null,
    session: ClientSession = null,
    skip: js.UndefOr[Double] = js.undefined,
    snapshot: js.Any = null,
    sort: js.Any = null,
    tailable: js.Any = null
  ): QueryFindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (explain != null) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(lean)) __obj.updateDynamic("lean")(lean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxscan)) __obj.updateDynamic("maxscan")(maxscan.get.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (tailable != null) __obj.updateDynamic("tailable")(tailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFindOptions]
  }
}

