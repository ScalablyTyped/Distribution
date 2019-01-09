package typings
package nodeDashMysqlDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[T] extends js.Object {
  var fetch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var insert: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Boolean]] = js.undefined
  var remove: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Boolean]] = js.undefined
  var transform: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
}

