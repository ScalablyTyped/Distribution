package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nanoNs {
  type Callback[R] = js.Function3[/* error */ js.Any, /* response */ R, /* headers */ js.UndefOr[js.Any], scala.Unit]
  type FollowUpdatesParamsFilterFunction = js.Function2[/* doc */ js.Any, /* req */ js.Any, scala.Boolean]
  type MangoValue = scala.Double | java.lang.String | stdLib.Date | scala.Boolean
  type RequestFunction = js.Function2[
    /* options */ js.UndefOr[RequestOptions | java.lang.String], 
    /* callback */ js.UndefOr[Callback[js.Any]], 
    scala.Unit
  ]
  // http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax
  type SortOrder = java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[nanoLib.nanoLibStrings.asc | nanoLib.nanoLibStrings.desc])
}
