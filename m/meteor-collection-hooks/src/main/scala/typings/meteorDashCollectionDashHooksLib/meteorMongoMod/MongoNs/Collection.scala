package typings
package meteorDashCollectionDashHooksLib.meteorMongoMod.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: meteorDashCollectionDashHooksLib.Anon_CursorDoc[T]
  var before: meteorDashCollectionDashHooksLib.Anon_DocFieldNames[T]
  var direct: meteorDashCollectionDashHooksLib.Anon_CallbackDoc[T]
  var hookOptions: meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.GlobalHookOptions
}

object Collection {
  @scala.inline
  def apply[T](
    after: meteorDashCollectionDashHooksLib.Anon_CursorDoc[T],
    before: meteorDashCollectionDashHooksLib.Anon_DocFieldNames[T],
    direct: meteorDashCollectionDashHooksLib.Anon_CallbackDoc[T],
    hookOptions: meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.GlobalHookOptions
  ): Collection[T] = {
    val __obj = js.Dynamic.literal(after = after, before = before, direct = direct, hookOptions = hookOptions)
  
    __obj.asInstanceOf[Collection[T]]
  }
}

