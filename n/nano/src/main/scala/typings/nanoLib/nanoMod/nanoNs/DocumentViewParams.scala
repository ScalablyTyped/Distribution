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

object DocumentViewParams {
  @scala.inline
  def apply(
    att_encoding_info: js.UndefOr[scala.Boolean] = js.undefined,
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    end_key: js.Any = null,
    end_key_doc_id: java.lang.String = null,
    endkey: js.Any = null,
    endkey_docid: java.lang.String = null,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    group_level: scala.Int | scala.Double = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    inclusive_end: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.Any = null,
    keys: js.Array[_] = null,
    limit: scala.Int | scala.Double = null,
    reduce: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    sorted: js.UndefOr[scala.Boolean] = js.undefined,
    stable: js.UndefOr[scala.Boolean] = js.undefined,
    stale: java.lang.String = null,
    start_key: js.Any = null,
    start_key_doc_id: java.lang.String = null,
    startkey: js.Any = null,
    startkey_docid: java.lang.String = null,
    update: java.lang.String = null,
    update_seq: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentViewParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(att_encoding_info)) __obj.updateDynamic("att_encoding_info")(att_encoding_info)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (end_key != null) __obj.updateDynamic("end_key")(end_key)
    if (end_key_doc_id != null) __obj.updateDynamic("end_key_doc_id")(end_key_doc_id)
    if (endkey != null) __obj.updateDynamic("endkey")(endkey)
    if (endkey_docid != null) __obj.updateDynamic("endkey_docid")(endkey_docid)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (group_level != null) __obj.updateDynamic("group_level")(group_level.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce)) __obj.updateDynamic("reduce")(reduce)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (!js.isUndefined(stable)) __obj.updateDynamic("stable")(stable)
    if (stale != null) __obj.updateDynamic("stale")(stale)
    if (start_key != null) __obj.updateDynamic("start_key")(start_key)
    if (start_key_doc_id != null) __obj.updateDynamic("start_key_doc_id")(start_key_doc_id)
    if (startkey != null) __obj.updateDynamic("startkey")(startkey)
    if (startkey_docid != null) __obj.updateDynamic("startkey_docid")(startkey_docid)
    if (update != null) __obj.updateDynamic("update")(update)
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq)
    __obj.asInstanceOf[DocumentViewParams]
  }
}

