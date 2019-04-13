package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFetchParams extends js.Object {
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  var end_key: js.UndefOr[java.lang.String] = js.undefined
  var end_key_doc_id: js.UndefOr[java.lang.String] = js.undefined
  var inclusive_end: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keys: js.UndefOr[java.lang.String] = js.undefined
   // This can be string[] too ???
  var limit: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var stale: js.UndefOr[java.lang.String] = js.undefined
  var start_key: js.UndefOr[java.lang.String] = js.undefined
  var start_key_doc_id: js.UndefOr[java.lang.String] = js.undefined
  var update_seq: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentFetchParams {
  @scala.inline
  def apply(
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    end_key: java.lang.String = null,
    end_key_doc_id: java.lang.String = null,
    inclusive_end: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    keys: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null,
    stale: java.lang.String = null,
    start_key: java.lang.String = null,
    start_key_doc_id: java.lang.String = null,
    update_seq: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentFetchParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (end_key != null) __obj.updateDynamic("end_key")(end_key)
    if (end_key_doc_id != null) __obj.updateDynamic("end_key_doc_id")(end_key_doc_id)
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale)
    if (start_key != null) __obj.updateDynamic("start_key")(start_key)
    if (start_key_doc_id != null) __obj.updateDynamic("start_key_doc_id")(start_key_doc_id)
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq)
    __obj.asInstanceOf[DocumentFetchParams]
  }
}

