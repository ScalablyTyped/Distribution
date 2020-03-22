package typings.pouchdbLiveFind.PouchDB.LiveFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.PouchDB.Find.Selector
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, std.Exclude<keyof pouchdb-find.PouchDB.Find.FindRequest<Content>, 'use_index'>> */
trait RequestDef[Content /* <: js.Object */] extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var selector: Selector
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.undefined
}

object RequestDef {
  @scala.inline
  def apply[Content /* <: js.Object */](
    selector: Selector,
    aggregate: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    limit: Int | Double = null,
    skip: Int | Double = null,
    sort: js.Array[String | (StringDictionary[asc | desc])] = null
  ): RequestDef[Content] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (!js.isUndefined(aggregate)) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDef[Content]]
  }
}

