package typings.meteorDashCollectionDashHooks.meteorMongoMod.Mongo

import typings.meteorDashCollectionDashHooks.Anon_CallbackDoc
import typings.meteorDashCollectionDashHooks.Anon_CursorDoc
import typings.meteorDashCollectionDashHooks.Anon_DocFieldNames
import typings.meteorDashCollectionDashHooks.meteorMongoMod.CollectionHooks.GlobalHookOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: Anon_CursorDoc[T]
  var before: Anon_DocFieldNames[T]
  var direct: Anon_CallbackDoc[T]
  var hookOptions: GlobalHookOptions
}

object Collection {
  @scala.inline
  def apply[T](
    after: Anon_CursorDoc[T],
    before: Anon_DocFieldNames[T],
    direct: Anon_CallbackDoc[T],
    hookOptions: GlobalHookOptions
  ): Collection[T] = {
    val __obj = js.Dynamic.literal(after = after, before = before, direct = direct, hookOptions = hookOptions)
  
    __obj.asInstanceOf[Collection[T]]
  }
}

