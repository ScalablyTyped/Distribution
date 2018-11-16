package typings
package meteorDashPersistentDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Session")
@js.native
object SessionNs extends js.Object {
  def clear(): scala.Unit = js.native
  def clear(key: java.lang.String): scala.Unit = js.native
  def clearAuth(): scala.Unit = js.native
  def clearPersistent(): scala.Unit = js.native
  def clearTemp(): scala.Unit = js.native
  def makeAuth(key: java.lang.String): scala.Unit = js.native
  def makePersistent(key: java.lang.String): scala.Unit = js.native
  def makeTemp(key: java.lang.String): scala.Unit = js.native
  def setAuth(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def setAuth(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  def setAuth(key: java.lang.String, value: scala.Boolean): scala.Boolean = js.native
  def setAuth(key: java.lang.String, value: scala.Double): scala.Boolean = js.native
  def setDefaultAuth(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setDefaultAuth(key: java.lang.String, value: meteorLib.EJSONable): scala.Unit = js.native
  def setDefaultPersistent(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setDefaultPersistent(key: java.lang.String, value: meteorLib.EJSONable): scala.Unit = js.native
  def setDefaultTemp(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setDefaultTemp(key: java.lang.String, value: meteorLib.EJSONable): scala.Unit = js.native
  def setPersistent(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def setPersistent(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  def setPersistent(key: java.lang.String, value: scala.Boolean): scala.Boolean = js.native
  def setPersistent(key: java.lang.String, value: scala.Double): scala.Boolean = js.native
  def setTemp(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def setTemp(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  def setTemp(key: java.lang.String, value: scala.Boolean): scala.Boolean = js.native
  def setTemp(key: java.lang.String, value: scala.Double): scala.Boolean = js.native
}

