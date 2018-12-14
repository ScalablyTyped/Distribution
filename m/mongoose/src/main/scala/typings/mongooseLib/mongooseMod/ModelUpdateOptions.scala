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

