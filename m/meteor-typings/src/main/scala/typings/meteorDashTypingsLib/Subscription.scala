package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var connection: meteorDashTypingsLib.MeteorNs.Connection
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
    added: js.Function3[java.lang.String, java.lang.String, js.Object, scala.Unit],
    changed: js.Function3[java.lang.String, java.lang.String, js.Object, scala.Unit],
    connection: meteorDashTypingsLib.MeteorNs.Connection,
    error: js.Function1[stdLib.Error, scala.Unit],
    onStop: js.Function1[js.Function, scala.Unit],
    ready: js.Function0[scala.Unit],
    removed: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    stop: js.Function0[scala.Unit],
    userId: java.lang.String
  ): Subscription = {
    val __obj = js.Dynamic.literal(added = added, changed = changed, connection = connection, error = error, onStop = onStop, ready = ready, removed = removed, stop = stop, userId = userId)
  
    __obj.asInstanceOf[Subscription]
  }
}

