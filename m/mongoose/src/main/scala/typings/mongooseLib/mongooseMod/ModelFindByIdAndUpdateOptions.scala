package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFindByIdAndUpdateOptions extends ModelOptions {
  /** The context option lets you set the value of this in update validators to the underlying query. */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** true to return the modified document rather than the original. defaults to false */
  var `new`: js.UndefOr[scala.Boolean] = js.undefined
  /** if true, passes the raw result from the MongoDB driver as the third callback parameter */
  var rawResult: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * if true, runs update validators on this command. Update validators validate the
    * update operation against the model's schema.
    */
  var runValidators: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the document fields to return */
  var select: js.UndefOr[js.Any] = js.undefined
  /**
    * if this and upsert are true, mongoose will apply the defaults specified in the model's
    * schema if a new document is created. This option only works on MongoDB >= 2.4 because
    * it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[scala.Boolean] = js.undefined
  /** if multiple docs are found by the conditions, sets the sort order to choose which doc to update */
  var sort: js.UndefOr[js.Any] = js.undefined
  /** overwrites the schema's strict mode option for this update */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /** creates the object if it doesn't exist. defaults to false. */
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

