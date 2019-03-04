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
    val __obj = js.Dynamic.literal(after = after, before = before, direct = direct, hookOptions = hookOptions)
  
    __obj.asInstanceOf[Collection[T]]
  }
}

