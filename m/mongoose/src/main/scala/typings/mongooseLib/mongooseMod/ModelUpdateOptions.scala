package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelUpdateOptions
  extends ModelOptions
     with /** other options */
/* other */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** whether multiple documents should be updated (false) */
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[scala.Boolean] = js.undefined
  /** disables update-only mode, allowing you to overwrite the doc (false) */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, runs update validators on this command. Update validators validate
    * the update operation against the model's schema.
    */
  var runValidators: js.UndefOr[scala.Boolean] = js.undefined
  /** safe mode (defaults to value set in schema (true)) */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this and upsert are true, mongoose will apply the defaults specified in the
    * model's schema if a new document is created. This option only works on MongoDB >= 2.4
    * because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[scala.Boolean] = js.undefined
  /** overrides the strict option for this update */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /** whether to create the doc if it doesn't match (false) */
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object ModelUpdateOptions {
  @scala.inline
  def apply(
    StringDictionary: /** other options */
  /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    multipleCastError: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    runValidators: js.UndefOr[scala.Boolean] = js.undefined,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    setDefaultsOnInsert: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    upsert: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(multipleCastError)) __obj.updateDynamic("multipleCastError")(multipleCastError)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(runValidators)) __obj.updateDynamic("runValidators")(runValidators)
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(setDefaultsOnInsert)) __obj.updateDynamic("setDefaultsOnInsert")(setDefaultsOnInsert)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[ModelUpdateOptions]
  }
}

