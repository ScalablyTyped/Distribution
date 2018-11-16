package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModelFindOneAndUpdateOptions extends ModelFindByIdAndUpdateOptions {
  /** Field selection. Equivalent to .select(fields).findOneAndUpdate() */
  var fields: js.UndefOr[js.Any | java.lang.String] = js.undefined
  /** puts a time limit on the query - requires mongodb >= 2.6.0 */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
}

