package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFindOneAndRemoveOptions extends js.Object {
  /** puts a time limit on the query - requires mongodb >= 2.6.0 */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  /** if true, passes the raw result from the MongoDB driver as the third callback parameter */
  var rawResult: js.UndefOr[scala.Boolean] = js.undefined
  /** if multiple docs are found by the conditions, sets the sort order to choose which doc to update */
  var sort: js.UndefOr[js.Any] = js.undefined
}

