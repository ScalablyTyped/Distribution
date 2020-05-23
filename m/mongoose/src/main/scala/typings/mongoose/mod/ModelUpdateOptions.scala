package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelUpdateOptions
  extends ModelOptions
     with /** other options */
/* other */ StringDictionary[js.Any] {
  /**
    * Only update elements that match the arrayFilters conditions in the document or documents that match the query conditions.
    */
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.undefined
  /** whether multiple documents should be updated (false) */
  var multi: js.UndefOr[Boolean] = js.undefined
  /**
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[Boolean] = js.undefined
  /** disables update-only mode, allowing you to overwrite the doc (false) */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, runs update validators on this command. Update validators validate
    * the update operation against the model's schema.
    */
  var runValidators: js.UndefOr[Boolean] = js.undefined
  /** safe mode (defaults to value set in schema (true)) */
  var safe: js.UndefOr[Boolean] = js.undefined
  /**
    * If this and upsert are true, mongoose will apply the defaults specified in the
    * model's schema if a new document is created. This option only works on MongoDB >= 2.4
    * because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined
  /** overrides the strict option for this update */
  var strict: js.UndefOr[Boolean] = js.undefined
  /** whether to create the doc if it doesn't match (false) */
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object ModelUpdateOptions {
  @scala.inline
  def apply(
    StringDictionary: /** other options */
  /* other */ StringDictionary[js.Any] = null,
    arrayFilters: js.Array[StringDictionary[_]] = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    multipleCastError: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    runValidators: js.UndefOr[Boolean] = js.undefined,
    safe: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Null | ClientSession] = js.undefined,
    setDefaultsOnInsert: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): ModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelUpdateOptions]
  }
}

