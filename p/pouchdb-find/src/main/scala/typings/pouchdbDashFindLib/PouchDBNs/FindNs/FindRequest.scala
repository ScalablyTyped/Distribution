package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindRequest[Content /* <: js.Object */] extends js.Object {
  /** Defines a list of fields that you want to receive. If omitted, you get the full documents. */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** Defines a selector to filter the results. Required */
  var selector: Selector
  /** Number of docs to skip before returning. */
  var skip: js.UndefOr[scala.Double] = js.undefined
  /** Defines a list of fields defining how you want to sort. Note that sorted fields also have to be selected in the selector. */
  var sort: js.UndefOr[
    js.Array[
      java.lang.String | (org.scalablytyped.runtime.StringDictionary[
        pouchdbDashFindLib.pouchdbDashFindLibStrings.asc | pouchdbDashFindLib.pouchdbDashFindLibStrings.desc
      ])
    ]
  ] = js.undefined
  /** Set which index to use for the query. It can be “design-doc-name” or “[‘design-doc-name’, ‘name’]”. */
  var use_index: js.UndefOr[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = js.undefined
}

object FindRequest {
  @scala.inline
  def apply[Content /* <: js.Object */](
    selector: Selector,
    fields: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null,
    sort: js.Array[
      java.lang.String | (org.scalablytyped.runtime.StringDictionary[
        pouchdbDashFindLib.pouchdbDashFindLibStrings.asc | pouchdbDashFindLib.pouchdbDashFindLibStrings.desc
      ])
    ] = null,
    use_index: java.lang.String | (js.Tuple2[java.lang.String, java.lang.String]) = null
  ): FindRequest[Content] = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (use_index != null) __obj.updateDynamic("use_index")(use_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindRequest[Content]]
  }
}

