package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowDenyOptions extends js.Object {
  var fetch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var insert: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
  var remove: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
  var transform: js.UndefOr[js.Function | scala.Null] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* userId */ java.lang.String, 
      /* doc */ js.Any, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
}

object AllowDenyOptions {
  @scala.inline
  def apply(
    fetch: js.Array[java.lang.String] = null,
    insert: js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean] = null,
    remove: js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean] = null,
    transform: js.Function = null,
    update: js.Function4[
      /* userId */ java.lang.String, 
      /* doc */ js.Any, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ js.Any, 
      scala.Boolean
    ] = null
  ): AllowDenyOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AllowDenyOptions]
  }
}

