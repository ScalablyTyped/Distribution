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

