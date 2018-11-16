package typings
package meteorDashCollectionDashHooksLib.mongoMod.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Collection[T] extends js.Object {
  var after: meteorDashCollectionDashHooksLib.Anon_Find[T]
  var before: meteorDashCollectionDashHooksLib.Anon_FindHook[T]
  var direct: meteorDashCollectionDashHooksLib.Anon_FindSelector[T]
  var hookOptions: meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.GlobalHookOptions
}

