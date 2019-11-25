package typings.mongodb.mongodbMod

import typings.mongodb.Anon_BatchSizeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAggregationOptions extends js.Object {
  /**
    * Lets the server know if it can use disk to store
    * temporary results for the aggregation (requires mongodb 2.6 >).
    */
  var allowDiskUse: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
    */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Return the query as cursor, on 2.6 > it returns as a real cursor
    * on pre 2.6 it returns as an emulated cursor.
    */
  var cursor: js.UndefOr[Anon_BatchSizeNumber] = js.undefined
  /**
    * Explain returns the aggregation execution plan (requires mongodb 2.6 >).
    */
  var explain: js.UndefOr[Boolean] = js.undefined
  var hint: js.UndefOr[String | js.Object] = js.undefined
  /**
    * specifies a cumulative time limit in milliseconds for processing operations
    * on the cursor. MongoDB interrupts the operation at the earliest following interrupt point.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object CollectionAggregationOptions {
  @scala.inline
  def apply(
    allowDiskUse: js.UndefOr[Boolean] = js.undefined,
    bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined,
    collation: CollationDocument = null,
    comment: String = null,
    cursor: Anon_BatchSizeNumber = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    hint: String | js.Object = null,
    maxTimeMS: Int | scala.Double = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    session: ClientSession = null
  ): CollectionAggregationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDiskUse)) __obj.updateDynamic("allowDiskUse")(allowDiskUse.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassDocumentValidation)) __obj.updateDynamic("bypassDocumentValidation")(bypassDocumentValidation.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAggregationOptions]
  }
}

