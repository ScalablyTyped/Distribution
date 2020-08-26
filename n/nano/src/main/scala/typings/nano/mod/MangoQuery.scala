package typings.nano.mod

import typings.nano.nanoBooleans.`false`
import typings.nano.nanoStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangoQuery extends js.Object {
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[String] = js.native
  // Include execution statistics in the query response. Optional, default: false.
  var execution_stats: js.UndefOr[Boolean] = js.native
  // JSON array specifying which fields of each object should be returned. If it is omitted,
  // the entire object is returned.
  // http://docs.couchdb.org/en/latest/api/database/find.html#filtering-fields
  var fields: js.UndefOr[js.Array[String]] = js.native
  // Maximum number of results returned. Default is 25.
  var limit: js.UndefOr[Double] = js.native
  // Read quorum needed for the result. This defaults to 1.
  var r: js.UndefOr[Double] = js.native
  // JSON object describing criteria used to select documents.
  var selector: MangoSelector = js.native
  // Skip the first 'n' results, where 'n' is the value specified.
  var skip: js.UndefOr[Double] = js.native
  // JSON array following sort syntax.
  var sort: js.UndefOr[js.Array[SortOrder]] = js.native
  // Whether or not the view results should be returned from a “stable” set of shards.
  var stable: js.UndefOr[Boolean] = js.native
  // Combination of update = false and stable = true options.Possible options: "ok", false (default).
  var stale: js.UndefOr[ok | `false`] = js.native
  // Whether to update the index prior to returning the result. Default is true.
  var update: js.UndefOr[Boolean] = js.native
  // Instruct a query to use a specific index.
  // Specified either as "<design_document>" or ["<design_document>", "<index_name>"].
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
}

object MangoQuery {
  @scala.inline
  def apply(selector: MangoSelector): MangoQuery = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoQuery]
  }
  @scala.inline
  implicit class MangoQueryOps[Self <: MangoQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelector(value: MangoSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmark: Self = this.set("bookmark", js.undefined)
    @scala.inline
    def setExecution_stats(value: Boolean): Self = this.set("execution_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution_stats: Self = this.set("execution_stats", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSortVarargs(value: SortOrder*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[SortOrder]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStable(value: Boolean): Self = this.set("stable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStable: Self = this.set("stable", js.undefined)
    @scala.inline
    def setStale(value: ok | `false`): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUse_index(value: String | (js.Tuple2[String, String])): Self = this.set("use_index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_index: Self = this.set("use_index", js.undefined)
  }
  
}

