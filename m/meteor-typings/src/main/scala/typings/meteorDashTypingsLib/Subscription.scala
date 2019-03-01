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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("added")(added)
    __obj.updateDynamic("changed")(changed)
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("onStop")(onStop)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("removed")(removed)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Subscription]
  }
}

