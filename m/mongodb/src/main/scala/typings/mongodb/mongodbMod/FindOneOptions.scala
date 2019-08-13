package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use options.projection instead
    */
  var fields: js.UndefOr[js.Object] = js.undefined
  var hint: js.UndefOr[js.Object] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxScan: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  var returnKey: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var showDiskLoc: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var snapshot: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  var tailable: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Boolean] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(
    batchSize: Int | scala.Double = null,
    collation: CollationDocument = null,
    comment: String = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    fields: js.Object = null,
    hint: js.Object = null,
    limit: Int | scala.Double = null,
    max: Int | scala.Double = null,
    maxScan: Int | scala.Double = null,
    maxTimeMS: Int | scala.Double = null,
    min: Int | scala.Double = null,
    partial: js.UndefOr[Boolean] = js.undefined,
    projection: js.Object = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreference | String = null,
    returnKey: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    showDiskLoc: js.UndefOr[Boolean] = js.undefined,
    skip: Int | scala.Double = null,
    snapshot: js.UndefOr[Boolean] = js.undefined,
    sort: js.Array[_] | js.Object = null,
    tailable: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Boolean] = js.undefined
  ): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxScan != null) __obj.updateDynamic("maxScan")(maxScan.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(returnKey)) __obj.updateDynamic("returnKey")(returnKey)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(showDiskLoc)) __obj.updateDynamic("showDiskLoc")(showDiskLoc)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(tailable)) __obj.updateDynamic("tailable")(tailable)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[FindOneOptions]
  }
}

