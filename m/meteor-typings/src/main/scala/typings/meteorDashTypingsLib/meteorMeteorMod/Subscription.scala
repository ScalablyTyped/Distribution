package typings
package meteorDashTypingsLib.meteorMeteorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Subscription extends js.Object {
  var connection: meteorDashTypingsLib.meteorMeteorMod.MeteorNs.Connection
  var userId: java.lang.String
  def added(collection: java.lang.String, id: java.lang.String, fields: js.Object): scala.Unit
  def changed(collection: java.lang.String, id: java.lang.String, fields: js.Object): scala.Unit
  def error(error: stdLib.Error): scala.Unit
  def onStop(func: js.Function): scala.Unit
  def ready(): scala.Unit
  def removed(collection: java.lang.String, id: java.lang.String): scala.Unit
  def stop(): scala.Unit
}

