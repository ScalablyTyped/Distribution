package typings.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowDenyOptions extends js.Object {
  var fetch: js.UndefOr[js.Array[String]] = js.undefined
  var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.undefined
  var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.undefined
  var transform: js.UndefOr[js.Function | Null] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* userId */ String, 
      /* doc */ js.Any, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ js.Any, 
      Boolean
    ]
  ] = js.undefined
}

object AllowDenyOptions {
  @scala.inline
  def apply(
    fetch: js.Array[String] = null,
    insert: (/* userId */ String, /* doc */ js.Any) => Boolean = null,
    remove: (/* userId */ String, /* doc */ js.Any) => Boolean = null,
    transform: js.Function = null,
    update: (/* userId */ String, /* doc */ js.Any, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean = null
  ): AllowDenyOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[AllowDenyOptions]
  }
}

