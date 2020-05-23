package typings.mongoose.anon

import typings.mongodb.mod.ReadPreferenceMode
import typings.mongoose.mod.ClientSession
import typings.mongoose.mod.CollationOptions
import typings.mongoose.mod.ModelPopulateOptions
import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  lean  :true} & mongoose.mongoose.Omit<mongoose.mongoose.QueryFindOptions, 'lean'> */
trait leantrueOmitQueryFindOpti extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var collation: js.UndefOr[CollationOptions] = js.undefined
  var comment: js.UndefOr[js.Any] = js.undefined
  var explain: js.UndefOr[js.Any] = js.undefined
  var hint: js.UndefOr[js.Any] = js.undefined
  var lean: `true`
  var limit: js.UndefOr[Double] = js.undefined
  var maxscan: js.UndefOr[Double] = js.undefined
  var populate: js.UndefOr[String | ModelPopulateOptions] = js.undefined
  var projection: js.UndefOr[js.Any] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var snapshot: js.UndefOr[js.Any] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var tailable: js.UndefOr[js.Any] = js.undefined
}

object leantrueOmitQueryFindOpti {
  @scala.inline
  def apply(
    lean: `true`,
    batchSize: js.UndefOr[Double] = js.undefined,
    collation: CollationOptions = null,
    comment: js.Any = null,
    explain: js.Any = null,
    hint: js.Any = null,
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
  ): leantrueOmitQueryFindOpti = {
    val __obj = js.Dynamic.literal(lean = lean.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (explain != null) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[leantrueOmitQueryFindOpti]
  }
}

