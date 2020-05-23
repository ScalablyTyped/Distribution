package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
trait DocumentListParams extends js.Object {
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.undefined
  // Return the documents in descending by key order. Default is false.
  var descending: js.UndefOr[Boolean] = js.undefined
  // Stop returning records when the specified key is reached. end_key is an alias for endkey
  var end_key: js.UndefOr[String] = js.undefined
  // Stop returning records when the specified document ID is reached.
  var end_key_doc_id: js.UndefOr[String] = js.undefined
  // Stop returning records when the specified key is reached.
  var endkey: js.UndefOr[String] = js.undefined
  // Include the full content of the documents in the return. Default is false.
  var include_docs: js.UndefOr[Boolean] = js.undefined
  // Specifies whether the specified end key should be included in the result. Default is true.
  var inclusive_end: js.UndefOr[Boolean] = js.undefined
  // Return only documents that match the specified key.
  var key: js.UndefOr[String] = js.undefined
  // Return only documents that match the specified keys.
  var keys: js.UndefOr[String | js.Array[String]] = js.undefined
  // Limit the number of the returned documents to the specified number.
  var limit: js.UndefOr[Double] = js.undefined
  // Skip this number of records before starting to return the results. Default is 0.
  var skip: js.UndefOr[Double] = js.undefined
  // Allow the results from a stale view to be used, without triggering a rebuild of all views within the
  // encompassing design doc. Supported values: ok and update_after.
  var stale: js.UndefOr[String] = js.undefined
  // Return records starting with the specified key. start_key is an alias for startkey
  var start_key: js.UndefOr[String] = js.undefined
  // Return records starting with the specified document ID.
  var start_key_doc_id: js.UndefOr[String] = js.undefined
  // Return records starting with the specified key.
  var startkey: js.UndefOr[String] = js.undefined
  // Response includes an update_seq value indicating which sequence id of the underlying database the view
  // reflects. Default is false.
  var update_seq: js.UndefOr[Boolean] = js.undefined
}

object DocumentListParams {
  @scala.inline
  def apply(
    conflicts: js.UndefOr[Boolean] = js.undefined,
    descending: js.UndefOr[Boolean] = js.undefined,
    end_key: String = null,
    end_key_doc_id: String = null,
    endkey: String = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    inclusive_end: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keys: String | js.Array[String] = null,
    limit: js.UndefOr[Double] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    stale: String = null,
    start_key: String = null,
    start_key_doc_id: String = null,
    startkey: String = null,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): DocumentListParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.get.asInstanceOf[js.Any])
    if (end_key != null) __obj.updateDynamic("end_key")(end_key.asInstanceOf[js.Any])
    if (end_key_doc_id != null) __obj.updateDynamic("end_key_doc_id")(end_key_doc_id.asInstanceOf[js.Any])
    if (endkey != null) __obj.updateDynamic("endkey")(endkey.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (start_key != null) __obj.updateDynamic("start_key")(start_key.asInstanceOf[js.Any])
    if (start_key_doc_id != null) __obj.updateDynamic("start_key_doc_id")(start_key_doc_id.asInstanceOf[js.Any])
    if (startkey != null) __obj.updateDynamic("startkey")(startkey.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentListParams]
  }
}

