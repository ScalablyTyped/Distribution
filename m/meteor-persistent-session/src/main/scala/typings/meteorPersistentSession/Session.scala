package typings.meteorPersistentSession

import typings.meteor.EJSONable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Session")
@js.native
object Session extends js.Object {
  def clear(): Unit = js.native
  def clear(key: String): Unit = js.native
  def clearAuth(): Unit = js.native
  def clearPersistent(): Unit = js.native
  def clearTemp(): Unit = js.native
  def makeAuth(key: String): Unit = js.native
  def makePersistent(key: String): Unit = js.native
  def makeTemp(key: String): Unit = js.native
  def setAuth(key: String, value: String): Boolean = js.native
  def setAuth(key: String, value: js.Any): Boolean = js.native
  def setAuth(key: String, value: Boolean): Boolean = js.native
  def setAuth(key: String, value: Double): Boolean = js.native
  def setDefaultAuth(key: String, value: js.Any): Unit = js.native
  def setDefaultAuth(key: String, value: EJSONable): Unit = js.native
  def setDefaultPersistent(key: String, value: js.Any): Unit = js.native
  def setDefaultPersistent(key: String, value: EJSONable): Unit = js.native
  def setDefaultTemp(key: String, value: js.Any): Unit = js.native
  def setDefaultTemp(key: String, value: EJSONable): Unit = js.native
  def setPersistent(key: String, value: String): Boolean = js.native
  def setPersistent(key: String, value: js.Any): Boolean = js.native
  def setPersistent(key: String, value: Boolean): Boolean = js.native
  def setPersistent(key: String, value: Double): Boolean = js.native
  def setTemp(key: String, value: String): Boolean = js.native
  def setTemp(key: String, value: js.Any): Boolean = js.native
  def setTemp(key: String, value: Boolean): Boolean = js.native
  def setTemp(key: String, value: Double): Boolean = js.native
}

