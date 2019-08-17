package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nanoMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nano.nanoStrings.asc
  import typings.nano.nanoStrings.desc
  import typings.std.Date

  type Callback[R] = js.Function3[/* error */ js.Any, /* response */ R, /* headers */ js.UndefOr[js.Any], Unit]
  type FollowUpdatesParamsFilterFunction = js.Function2[/* doc */ js.Any, /* req */ js.Any, Boolean]
  type MangoValue = Double | String | Date | Boolean | Null
  type RequestFunction = js.Function2[
    /* options */ js.UndefOr[RequestOptions | String], 
    /* callback */ js.UndefOr[Callback[js.Any]], 
    Unit
  ]
  // http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax
  type SortOrder = String | js.Array[String] | (StringDictionary[asc | desc])
}
