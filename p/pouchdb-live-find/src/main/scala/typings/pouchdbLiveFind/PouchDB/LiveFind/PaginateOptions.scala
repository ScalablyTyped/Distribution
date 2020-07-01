package typings.pouchdbLiveFind.PouchDB.LiveFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, 'sort' | 'skip' | 'limit'> */
trait PaginateOptions[Content /* <: js.Object */] extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.undefined
}

object PaginateOptions {
  @scala.inline
  def apply[/* <: js.Object */ Content](
    limit: js.UndefOr[Double] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: js.Array[String | (StringDictionary[asc | desc])] = null
  ): PaginateOptions[Content] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateOptions[Content]]
  }
}

