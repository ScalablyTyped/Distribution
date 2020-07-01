package typings.mongoose.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mod.ClientSession
import typings.mongoose.mongooseBooleans.`true`
import typings.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  upsert  :true,   new  :true} & mongoose.mongoose.QueryFindOneAndUpdateOptions */
trait upserttruenewtrueQueryFin extends js.Object {
  /**
    * Only update elements that match the arrayFilters conditions in the document or documents that match the query conditions.
    */
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.undefined
  /**
    * if set to 'query' and runValidators is on, this will refer to the query in custom validator
    * functions that update validation runs. Does nothing if runValidators is false.
    */
  var context: js.UndefOr[String] = js.undefined
  /** Field selection. Equivalent to .select(fields).findOneAndUpdate() */
  var fields: js.UndefOr[js.Any | String] = js.undefined
  /**
    * if truthy, mongoose will return the document as a plain JavaScript object rather than a mongoose document. See Query.lean() and the Mongoose lean tutorial.
    */
  var lean: js.UndefOr[js.Any] = js.undefined
  /** puts a time limit on the query - requires mongodb >= 2.6.0 */
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  /**
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[Boolean] = js.undefined
  /** if true, return the modified document rather than the original. defaults to false (changed in 4.0) */
  var `new`: js.UndefOr[`true` with Boolean] = js.undefined
  /** If true, delete any properties whose value is undefined when casting an update. In other words,
    if this is set, Mongoose will delete baz from the update in Model.updateOne({}, { foo: 'bar', baz: undefined })
    before sending the update to the server.**/
  var omitUndefined: js.UndefOr[Boolean] = js.undefined
  /** like select, it determines which fields to return */
  var projection: js.UndefOr[js.Any] = js.undefined
  /** if true, returns the raw result from the MongoDB driver */
  var rawResult: js.UndefOr[Boolean] = js.undefined
  /** if true, runs update validators on this command. Update validators validate the update operation against the model's schema. */
  var runValidators: js.UndefOr[Boolean] = js.undefined
  /** sets the document fields to return */
  var select: js.UndefOr[js.Any] = js.undefined
  /** use client session for transaction */
  var session: js.UndefOr[ClientSession] = js.undefined
  /**
    * if this and upsert are true, mongoose will apply the defaults specified in the model's schema if a new document
    * is created. This option only works on MongoDB >= 2.4 because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined
  /**
    * if multiple docs are found by the conditions, sets the sort order to choose
    * which doc to update
    */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** overwrites the schema's strict mode option for this update */
  var strict: js.UndefOr[Boolean | `throw`] = js.undefined
  /**
    * If set to false and schema-level timestamps are enabled, skip timestamps for this update. Note that this allows you to overwrite timestamps.
    * Does nothing if schema-level timestamps are not set.
    */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  /** creates the object if it doesn't exist. defaults to false. */
  var upsert: js.UndefOr[`true` with Boolean] = js.undefined
}

object upserttruenewtrueQueryFin {
  @scala.inline
  def apply(
    arrayFilters: js.Array[StringDictionary[_]] = null,
    context: String = null,
    fields: js.Any | String = null,
    lean: js.Any = null,
    maxTimeMS: js.UndefOr[Double] = js.undefined,
    multipleCastError: js.UndefOr[Boolean] = js.undefined,
    `new`: js.UndefOr[`true` with Boolean] = js.undefined,
    omitUndefined: js.UndefOr[Boolean] = js.undefined,
    projection: js.Any = null,
    rawResult: js.UndefOr[Boolean] = js.undefined,
    runValidators: js.UndefOr[Boolean] = js.undefined,
    select: js.Any = null,
    session: ClientSession = null,
    setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined,
    sort: js.Any = null,
    strict: Boolean | `throw` = null,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[`true` with Boolean] = js.undefined
  ): upserttruenewtrueQueryFin = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (lean != null) __obj.updateDynamic("lean")(lean.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[upserttruenewtrueQueryFin]
  }
}

