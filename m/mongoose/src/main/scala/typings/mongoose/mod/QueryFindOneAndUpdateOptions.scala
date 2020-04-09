package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFindOneAndUpdateOptions extends QueryFindOneAndRemoveOptions {
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
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[Boolean] = js.undefined
  /** if true, return the modified document rather than the original. defaults to false (changed in 4.0) */
  var `new`: js.UndefOr[Boolean] = js.undefined
  /** If true, delete any properties whose value is undefined when casting an update. In other words,
    if this is set, Mongoose will delete baz from the update in Model.updateOne({}, { foo: 'bar', baz: undefined })
    before sending the update to the server.**/
  var omitUndefined: js.UndefOr[Boolean] = js.undefined
  /** if true, runs update validators on this command. Update validators validate the update operation against the model's schema. */
  var runValidators: js.UndefOr[Boolean] = js.undefined
  /**
    * if this and upsert are true, mongoose will apply the defaults specified in the model's schema if a new document
    * is created. This option only works on MongoDB >= 2.4 because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined
  /** creates the object if it doesn't exist. defaults to false. */
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object QueryFindOneAndUpdateOptions {
  @scala.inline
  def apply(
    arrayFilters: js.Array[StringDictionary[_]] = null,
    context: String = null,
    fields: js.Any | String = null,
    maxTimeMS: Int | Double = null,
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
    upsert: js.UndefOr[Boolean] = js.undefined
  ): QueryFindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError.asInstanceOf[js.Any])
    if (!js.isUndefined(`new`)) __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    if (!js.isUndefined(omitUndefined)) __obj.updateDynamic("omitUndefined")(omitUndefined.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult.asInstanceOf[js.Any])
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFindOneAndUpdateOptions]
  }
}

