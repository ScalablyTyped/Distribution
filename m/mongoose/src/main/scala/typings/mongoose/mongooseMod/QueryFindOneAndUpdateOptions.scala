package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFindOneAndUpdateOptions extends QueryFindOneAndRemoveOptions {
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
    context: String = null,
    fields: js.Any | String = null,
    maxTimeMS: Int | Double = null,
    multipleCastError: js.UndefOr[Boolean] = js.undefined,
    `new`: js.UndefOr[Boolean] = js.undefined,
    projection: js.Any = null,
    rawResult: js.UndefOr[Boolean] = js.undefined,
    runValidators: js.UndefOr[Boolean] = js.undefined,
    select: js.Any = null,
    setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined,
    sort: js.Any = null,
    strict: Boolean | String = null,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): QueryFindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError)
    if (!js.isUndefined(`new`)) __obj.updateDynamic("new")(`new`)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult)
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators)
    if (select != null) __obj.updateDynamic("select")(select)
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[QueryFindOneAndUpdateOptions]
  }
}

