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
    maxTimeMS: js.UndefOr[scala.Double] = js.undefined,
    projection: js.Object = null,
    returnOriginal: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    sort: js.Object = null,
    upsert: js.UndefOr[Boolean] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): FindOneAndUpdateOption = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(returnOriginal)) __obj.updateDynamic("returnOriginal")(returnOriginal.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneAndUpdateOption]
  }
}

