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

object Anon_Doc {
  @scala.inline
  def apply[T](
    fetch: js.Array[java.lang.String] = null,
    insert: (/* userId */ java.lang.String, /* doc */ T) => scala.Boolean = null,
    remove: (/* userId */ java.lang.String, /* doc */ T) => scala.Boolean = null,
    transform: js.Function = null,
    update: (/* userId */ java.lang.String, /* doc */ T, /* fieldNames */ js.Array[java.lang.String], /* modifier */ js.Any) => scala.Boolean = null
  ): Anon_Doc[T] = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[Anon_Doc[T]]
  }
}

