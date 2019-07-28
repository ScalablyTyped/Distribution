package typings.mongodb.mongodbMod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneAndReplaceOption extends CommonOptions {
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var returnOriginal: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Object] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object FindOneAndReplaceOption {
  @scala.inline
  def apply(
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
  ): FindOneAndReplaceOption = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[FindOneAndReplaceOption]
  }
}

