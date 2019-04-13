package typings
package meteorLib.meteorMeteorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var connection: meteorLib.meteorMeteorMod.MeteorNs.Connection
  var userId: java.lang.String
  def added(collection: java.lang.String, id: java.lang.String, fields: js.Object): scala.Unit
  def changed(collection: java.lang.String, id: java.lang.String, fields: js.Object): scala.Unit
  def error(error: stdLib.Error): scala.Unit
  def onStop(func: js.Function): scala.Unit
  def ready(): scala.Unit
  def removed(collection: java.lang.String, id: java.lang.String): scala.Unit
  def stop(): scala.Unit
}

object Subscription {
  @scala.inline
  def apply(
    added: (java.lang.String, java.lang.String, js.Object) => scala.Unit,
    changed: (java.lang.String, java.lang.String, js.Object) => scala.Unit,
    connection: meteorLib.meteorMeteorMod.MeteorNs.Connection,
    error: stdLib.Error => scala.Unit,
    onStop: js.Function => scala.Unit,
    ready: () => scala.Unit,
    removed: (java.lang.String, java.lang.String) => scala.Unit,
    stop: () => scala.Unit,
    userId: java.lang.String
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction3(added), changed = js.Any.fromFunction3(changed), connection = connection, error = js.Any.fromFunction1(error), onStop = js.Any.fromFunction1(onStop), ready = js.Any.fromFunction0(ready), removed = js.Any.fromFunction2(removed), stop = js.Any.fromFunction0(stop), userId = userId)
  
    __obj.asInstanceOf[Subscription]
  }
}

