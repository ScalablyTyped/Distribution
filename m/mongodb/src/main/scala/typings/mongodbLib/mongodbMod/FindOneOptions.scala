package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated Use options.projection instead
    */
  var fields: js.UndefOr[js.Object] = js.undefined
  var hint: js.UndefOr[js.Object] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxScan: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMs: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined
  var promoteLongs: js.UndefOr[scala.Boolean] = js.undefined
  var promoteValues: js.UndefOr[scala.Boolean] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var returnKey: js.UndefOr[scala.Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var showDiskLoc: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var snapshot: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  var tailable: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Boolean] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    collation: CollationDocument = null,
    comment: java.lang.String = null,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Object = null,
    hint: js.Object = null,
    limit: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    maxScan: scala.Int | scala.Double = null,
    maxTimeMs: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    partial: js.UndefOr[scala.Boolean] = js.undefined,
    projection: js.Object = null,
    promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined,
    promoteLongs: js.UndefOr[scala.Boolean] = js.undefined,
    promoteValues: js.UndefOr[scala.Boolean] = js.undefined,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    readPreference: ReadPreference | java.lang.String = null,
    returnKey: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    showDiskLoc: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    snapshot: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Array[_] | js.Object = null,
    tailable: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: js.UndefOr[scala.Boolean] = js.undefined
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
    if (maxTimeMs != null) __obj.updateDynamic("maxTimeMs")(maxTimeMs.asInstanceOf[js.Any])
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

