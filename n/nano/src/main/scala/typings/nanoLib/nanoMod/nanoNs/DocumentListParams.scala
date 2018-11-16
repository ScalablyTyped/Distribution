package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs

trait DocumentListParams extends js.Object {
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  // Return the documents in descending by key order. Default is false.
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  // Stop returning records when the specified key is reached. end_key is an alias for endkey
  var end_key: js.UndefOr[java.lang.String] = js.undefined
  // Stop returning records when the specified document ID is reached.
  var end_key_doc_id: js.UndefOr[java.lang.String] = js.undefined
  // Stop returning records when the specified key is reached.
  var endkey: js.UndefOr[java.lang.String] = js.undefined
  // Include the full content of the documents in the return. Default is false.
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  // Specifies whether the specified end key should be included in the result. Default is true.
  var inclusive_end: js.UndefOr[scala.Boolean] = js.undefined
  // Return only documents that match the specified key.
  var key: js.UndefOr[java.lang.String] = js.undefined
  // Return only documents that match the specified keys.
  var keys: js.UndefOr[java.lang.String] = js.undefined
   // This can be string[] too ???
  // Limit the number of the returned documents to the specified number.
  var limit: js.UndefOr[scala.Double] = js.undefined
  // Skip this number of records before starting to return the results. Default is 0.
  var skip: js.UndefOr[scala.Double] = js.undefined
  // Allow the results from a stale view to be used, without triggering a rebuild of all views within the
  // encompassing design doc. Supported values: ok and update_after.
  var stale: js.UndefOr[java.lang.String] = js.undefined
  // Return records starting with the specified key. start_key is an alias for startkey
  var start_key: js.UndefOr[java.lang.String] = js.undefined
  // Return records starting with the specified document ID.
  var start_key_doc_id: js.UndefOr[java.lang.String] = js.undefined
  // Return records starting with the specified key.
  var startkey: js.UndefOr[java.lang.String] = js.undefined
  // Response includes an update_seq value indicating which sequence id of the underlying database the view
  // reflects. Default is false.
  var update_seq: js.UndefOr[scala.Boolean] = js.undefined
}

