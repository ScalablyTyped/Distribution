package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[R] = js.Function3[/* error */ js.Any, /* response */ R, /* headers */ js.UndefOr[js.Any], scala.Unit]
  type FollowUpdatesParamsFilterFunction = js.Function2[/* doc */ js.Any, /* req */ js.Any, scala.Boolean]
  type MangoValue = scala.Double | java.lang.String | typings.std.Date | scala.Boolean | scala.Null
  type RequestFunction = js.Function2[
    /* options */ js.UndefOr[typings.nano.mod.RequestOptions | java.lang.String], 
    /* callback */ js.UndefOr[typings.nano.mod.Callback[js.Any]], 
    scala.Unit
  ]
  // http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax
  type SortOrder = java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[typings.nano.nanoStrings.asc | typings.nano.nanoStrings.desc])
}
