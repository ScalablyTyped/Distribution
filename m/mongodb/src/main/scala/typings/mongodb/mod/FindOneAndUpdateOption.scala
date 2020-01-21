package typings.mongodb.mod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneAndUpdateOption extends FindOneAndReplaceOption {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object FindOneAndUpdateOption {
  @scala.inline
  def apply(
    arrayFilters: js.Array[js.Object] = null,
    collation: CollationDocument = null,
    j: js.UndefOr[Boolean] = js.undefined,
    maxTimeMS: Int | scala.Double = null,
    projection: js.Object = null,
    returnOriginal: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    sort: js.Object = null,
    upsert: js.UndefOr[Boolean] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): FindOneAndUpdateOption = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(returnOriginal)) __obj.updateDynamic("returnOriginal")(returnOriginal.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneAndUpdateOption]
  }
}

