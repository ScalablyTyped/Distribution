package typings.pouchdbFind.PouchDB.Find

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.pouchdbFindStrings.asc
import typings.pouchdbFind.pouchdbFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindRequest[Content /* <: js.Object */] extends js.Object {
  /** Defines a list of fields that you want to receive. If omitted, you get the full documents. */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Defines a selector to filter the results. Required */
  var selector: Selector = js.native
  /** Number of docs to skip before returning. */
  var skip: js.UndefOr[Double] = js.native
  /** Defines a list of fields defining how you want to sort. Note that sorted fields also have to be selected in the selector. */
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
  /** Set which index to use for the query. It can be “design-doc-name” or “[‘design-doc-name’, ‘name’]”. */
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
}

object FindRequest {
  @scala.inline
  def apply[/* <: js.Object */ Content](selector: Selector): FindRequest[Content] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindRequest[Content]]
  }
  @scala.inline
  implicit class FindRequestOps[Self <: FindRequest[_], /* <: js.Object */ Content] (val x: Self with FindRequest[Content]) extends AnyVal {
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
    def setSelector(value: Selector): Self = this.set("selector", value.asInstanceOf[js.Any])
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
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSortVarargs(value: (String | (StringDictionary[asc | desc]))*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setUse_index(value: String | (js.Tuple2[String, String])): Self = this.set("use_index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_index: Self = this.set("use_index", js.undefined)
  }
  
}

