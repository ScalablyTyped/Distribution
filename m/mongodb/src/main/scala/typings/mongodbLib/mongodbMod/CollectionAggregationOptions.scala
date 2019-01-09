package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAggregationOptions extends js.Object {
  /**
    * Lets the server know if it can use disk to store
    * temporary results for the aggregation (requires mongodb 2.6 >).
    */
  var allowDiskUse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the query as cursor, on 2.6 > it returns as a real cursor
    * on pre 2.6 it returns as an emulated cursor.
    */
  var cursor: js.UndefOr[mongodbLib.Anon_BatchSizeNumber] = js.undefined
  /**
    * Explain returns the aggregation execution plan (requires mongodb 2.6 >).
    */
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var hint: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
    * specifies a cumulative time limit in milliseconds for processing operations
    * on the cursor. MongoDB interrupts the operation at the earliest following interrupt point.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined
  var promoteLongs: js.UndefOr[scala.Boolean] = js.undefined
  var promoteValues: js.UndefOr[scala.Boolean] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

