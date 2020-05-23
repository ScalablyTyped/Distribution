package typings.pouchdbFind.PouchDB.Find

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.pouchdbFindStrings.asc
import typings.pouchdbFind.pouchdbFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindRequest[Content /* <: js.Object */] extends js.Object {
  /** Defines a list of fields that you want to receive. If omitted, you get the full documents. */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double] = js.undefined
  /** Defines a selector to filter the results. Required */
  var selector: Selector
  /** Number of docs to skip before returning. */
  var skip: js.UndefOr[Double] = js.undefined
  /** Defines a list of fields defining how you want to sort. Note that sorted fields also have to be selected in the selector. */
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.undefined
  /** Set which index to use for the query. It can be “design-doc-name” or “[‘design-doc-name’, ‘name’]”. */
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
}

object FindRequest {
  @scala.inline
  def apply[Content](
    selector: Selector,
    fields: js.Array[String] = null,
    limit: js.UndefOr[Double] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: js.Array[String | (StringDictionary[asc | desc])] = null,
    use_index: String | (js.Tuple2[String, String]) = null
  ): FindRequest[Content] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (use_index != null) __obj.updateDynamic("use_index")(use_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindRequest[Content]]
  }
}

