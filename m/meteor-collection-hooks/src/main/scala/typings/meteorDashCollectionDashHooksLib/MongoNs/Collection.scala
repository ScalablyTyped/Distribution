package typings
package meteorDashCollectionDashHooksLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: meteorDashCollectionDashHooksLib.Anon_Cursor[T]
  var before: meteorDashCollectionDashHooksLib.Anon_Doc[T]
  var direct: meteorDashCollectionDashHooksLib.Anon_Callback[T]
  var hookOptions: meteorDashCollectionDashHooksLib.CollectionHooksNs.GlobalHookOptions
}

object Collection {
  @scala.inline
  def apply[T](
    after: meteorDashCollectionDashHooksLib.Anon_Cursor[T],
    before: meteorDashCollectionDashHooksLib.Anon_Doc[T],
    direct: meteorDashCollectionDashHooksLib.Anon_Callback[T],
    hookOptions: meteorDashCollectionDashHooksLib.CollectionHooksNs.GlobalHookOptions
  ): Collection[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("direct")(direct)
    __obj.updateDynamic("hookOptions")(hookOptions)
    __obj.asInstanceOf[Collection[T]]
  }
}

