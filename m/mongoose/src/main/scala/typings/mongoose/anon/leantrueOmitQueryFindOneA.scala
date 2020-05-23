package typings.mongoose.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mod.ClientSession
import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  lean  :true} & mongoose.mongoose.Omit<mongoose.mongoose.QueryFindOneAndUpdateOptions, 'lean'> */
trait leantrueOmitQueryFindOneA extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Any | String] = js.undefined
  var lean: `true`
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var multipleCastError: js.UndefOr[Boolean] = js.undefined
  var `new`: js.UndefOr[Boolean] = js.undefined
  var omitUndefined: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[js.Any] = js.undefined
  var rawResult: js.UndefOr[Boolean] = js.undefined
  var runValidators: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Any] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var strict: js.UndefOr[Boolean | String] = js.undefined
  var timestamps: js.UndefOr[Boolean] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object leantrueOmitQueryFindOneA {
  @scala.inline
  def apply(
    lean: `true`,
    arrayFilters: js.Array[StringDictionary[_]] = null,
    context: String = null,
    fields: js.Any | String = null,
    maxTimeMS: js.UndefOr[Double] = js.undefined,
    multipleCastError: js.UndefOr[Boolean] = js.undefined,
    `new`: js.UndefOr[Boolean] = js.undefined,
    omitUndefined: js.UndefOr[Boolean] = js.undefined,
    projection: js.Any = null,
    rawResult: js.UndefOr[Boolean] = js.undefined,
    runValidators: js.UndefOr[Boolean] = js.undefined,
    select: js.Any = null,
    session: ClientSession = null,
    setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined,
    sort: js.Any = null,
    strict: Boolean | String = null,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): leantrueOmitQueryFindOneA = {
    val __obj = js.Dynamic.literal(lean = lean.asInstanceOf[js.Any])
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`new`)) __obj.updateDynamic("new")(`new`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(omitUndefined)) __obj.updateDynamic("omitUndefined")(omitUndefined.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators.get.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[leantrueOmitQueryFindOneA]
  }
}

