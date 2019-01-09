package typings
package meteorDashCollectionDashHooksLib.mongoMod.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[T] extends js.Object {
  var after: meteorDashCollectionDashHooksLib.Anon_CursorDoc[T]
  var before: meteorDashCollectionDashHooksLib.Anon_DocFieldNames[T]
  var direct: meteorDashCollectionDashHooksLib.Anon_CallbackDoc[T]
  var hookOptions: meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.GlobalHookOptions
}

