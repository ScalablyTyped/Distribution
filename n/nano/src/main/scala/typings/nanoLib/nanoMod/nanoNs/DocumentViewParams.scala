package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
trait DocumentViewParams extends js.Object {
  // Include encoding information in attachment stubs if include_docs is true and the particular attachment is
  // compressed. Ignored if include_docs isn’t true. Default is false.
  var att_encoding_info: js.UndefOr[scala.Boolean] = js.undefined
  // Include the Base64-encoded content of attachments in the documents that are included if include_docs is
  // true. Ignored if include_docs isn’t true. Default is false.
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  // Return the documents in descending by key order. Default is false.
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  // Alias for endkey param.
  var end_key: js.UndefOr[js.Any] = js.undefined
  // Alias for endkey_docid param.
  var end_key_doc_id: js.UndefOr[java.lang.String] = js.undefined
  // Stop returning records when the specified key is reached.
  var endkey: js.UndefOr[js.Any] = js.undefined
  // Stop returning records when the specified document ID is reached. Requires endkey to be specified for this
  // to have any effect.
  var endkey_docid: js.UndefOr[java.lang.String] = js.undefined
  // Group the results using the reduce function to a group or single row. Default is false.
  var group: js.UndefOr[scala.Boolean] = js.undefined
  // Specify the group level to be used.
  var group_level: js.UndefOr[scala.Double] = js.undefined
  // Include the associated document with each row. Default is false.
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  // Specifies whether the specified end key should be included in the result. Default is true.
  var inclusive_end: js.UndefOr[scala.Boolean] = js.undefined
  // Return only documents that match the specified key.
  var key: js.UndefOr[js.Any] = js.undefined
  // Return only documents where the key matches one of the keys specified in the array.
  var keys: js.UndefOr[js.Array[_]] = js.undefined
  // Limit the number of the returned documents to the specified number.
  var limit: js.UndefOr[scala.Double] = js.undefined
  // Use the reduction function. Default is true.
  var reduce: js.UndefOr[scala.Boolean] = js.undefined
  // Skip this number of records before starting to return the results. Default is 0.
  var skip: js.UndefOr[scala.Double] = js.undefined
  // Sort returned rows. Setting this to false offers a performance boost. The total_rows and offset fields are
  // not available when this is set to false. Default is true.
  var sorted: js.UndefOr[scala.Boolean] = js.undefined
  // Whether or not the view results should be returned from a stable set of shards. Default is false.
  var stable: js.UndefOr[scala.Boolean] = js.undefined
  // Allow the results from a stale view to be used. Supported values: ok, update_after and false. ok is
  // equivalent to stable=true&update=false. update_after is equivalent to stable=true&update=lazy. false is
  // equivalent to stable=false&update=true.
  var stale: js.UndefOr[java.lang.String] = js.undefined
  // Alias for startkey param
  var start_key: js.UndefOr[js.Any] = js.undefined
  // Alias for startkey_docid param
  var start_key_doc_id: js.UndefOr[java.lang.String] = js.undefined
  // Return records starting with the specified key.
  var startkey: js.UndefOr[js.Any] = js.undefined
  // Return records starting with the specified document ID. Requires startkey to be specified for this to have
  // any effect.
  var startkey_docid: js.UndefOr[java.lang.String] = js.undefined
  //  Whether or not the view in question should be updated prior to responding to the user. Supported values:
  // true, false, lazy. Default is true.
  var update: js.UndefOr[java.lang.String] = js.undefined
  // Response includes an update_seq value indicating which sequence id of the database the view reflects.
  // Default is false.
  var update_seq: js.UndefOr[scala.Boolean] = js.undefined
}

