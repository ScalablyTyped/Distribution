package typings
package mongodbLib.mongodbMod

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
    j: js.UndefOr[scala.Boolean] = js.undefined,
    maxTimeMS: scala.Int | scala.Double = null,
    projection: js.Object = null,
    returnOriginal: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    sort: js.Object = null,
    upsert: js.UndefOr[scala.Boolean] = js.undefined,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): FindOneAndUpdateOption = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters)
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(returnOriginal)) __obj.updateDynamic("returnOriginal")(returnOriginal)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneAndUpdateOption]
  }
}

