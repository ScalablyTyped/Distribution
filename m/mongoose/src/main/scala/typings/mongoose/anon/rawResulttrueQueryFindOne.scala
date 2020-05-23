package typings.mongoose.anon

import typings.mongoose.mod.ClientSession
import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  rawResult  :true} & mongoose.mongoose.QueryFindOneAndRemoveOptions */
trait rawResulttrueQueryFindOne extends js.Object {
  /** puts a time limit on the query - requires mongodb >= 2.6.0 */
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  /** like select, it determines which fields to return */
  var projection: js.UndefOr[js.Any] = js.undefined
  /** if true, returns the raw result from the MongoDB driver */
  var rawResult: js.UndefOr[`true` with Boolean] = js.undefined
  /** sets the document fields to return */
  var select: js.UndefOr[js.Any] = js.undefined
  /** use client session for transaction */
  var session: js.UndefOr[ClientSession] = js.undefined
  /**
    * if multiple docs are found by the conditions, sets the sort order to choose
    * which doc to update
    */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** overwrites the schema's strict mode option for this update */
  var strict: js.UndefOr[Boolean | String] = js.undefined
}

object rawResulttrueQueryFindOne {
  @scala.inline
  def apply(
    maxTimeMS: js.UndefOr[Double] = js.undefined,
    projection: js.Any = null,
    rawResult: js.UndefOr[`true` with Boolean] = js.undefined,
    select: js.Any = null,
    session: ClientSession = null,
    sort: js.Any = null,
    strict: Boolean | String = null
  ): rawResulttrueQueryFindOne = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult.get.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[rawResulttrueQueryFindOne]
  }
}

