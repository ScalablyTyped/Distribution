package typings.meteorDashCollectionDashHooks.Mongo

import typings.meteorDashCollectionDashHooks.Anon_Callback
import typings.meteorDashCollectionDashHooks.Anon_Cursor
import typings.meteorDashCollectionDashHooks.Anon_Doc
import typings.meteorDashCollectionDashHooks.CollectionHooks.GlobalHookOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: Anon_Cursor[T]
  var before: Anon_Doc[T]
  var direct: Anon_Callback[T]
  var hookOptions: GlobalHookOptions
}

object Collection {
  @scala.inline
  def apply[T](
    after: Anon_Cursor[T],
    before: Anon_Doc[T],
    direct: Anon_Callback[T],
    hookOptions: GlobalHookOptions
  ): Collection[T] = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], direct = direct.asInstanceOf[js.Any], hookOptions = hookOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Collection[T]]
  }
}

