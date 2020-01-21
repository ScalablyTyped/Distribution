package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFetchParams extends js.Object {
  var conflicts: js.UndefOr[Boolean] = js.undefined
  var descending: js.UndefOr[Boolean] = js.undefined
  var end_key: js.UndefOr[String] = js.undefined
  var end_key_doc_id: js.UndefOr[String] = js.undefined
  var inclusive_end: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[String] = js.undefined
   // This can be string[] too ???
  var limit: js.UndefOr[Double] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var stale: js.UndefOr[String] = js.undefined
  var start_key: js.UndefOr[String] = js.undefined
  var start_key_doc_id: js.UndefOr[String] = js.undefined
  var update_seq: js.UndefOr[Boolean] = js.undefined
}

object DocumentFetchParams {
  @scala.inline
  def apply(
    conflicts: js.UndefOr[Boolean] = js.undefined,
    descending: js.UndefOr[Boolean] = js.undefined,
    end_key: String = null,
    end_key_doc_id: String = null,
    inclusive_end: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keys: String = null,
    limit: Int | Double = null,
    skip: Int | Double = null,
    stale: String = null,
    start_key: String = null,
    start_key_doc_id: String = null,
    update_seq: js.UndefOr[Boolean] = js.undefined
  ): DocumentFetchParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    if (end_key != null) __obj.updateDynamic("end_key")(end_key.asInstanceOf[js.Any])
    if (end_key_doc_id != null) __obj.updateDynamic("end_key_doc_id")(end_key_doc_id.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (start_key != null) __obj.updateDynamic("start_key")(start_key.asInstanceOf[js.Any])
    if (start_key_doc_id != null) __obj.updateDynamic("start_key_doc_id")(start_key_doc_id.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchParams]
  }
}

