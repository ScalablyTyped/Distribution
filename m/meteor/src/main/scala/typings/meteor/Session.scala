package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Session")
@js.native
object Session extends js.Object {
  def equals(key: String, value: String): Boolean = js.native
  def equals(key: String, value: js.Any): Boolean = js.native
  def equals(key: String, value: Boolean): Boolean = js.native
  def equals(key: String, value: Double): Boolean = js.native
  def get(key: String): js.Any = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: EJSONable): Unit = js.native
  def setDefault(key: String, value: js.Any): Unit = js.native
  def setDefault(key: String, value: EJSONable): Unit = js.native
}

