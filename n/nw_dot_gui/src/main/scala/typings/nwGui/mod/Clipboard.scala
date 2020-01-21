package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Clipboard")
@js.native
class Clipboard () extends js.Object {
  def clear(): Unit = js.native
  def get(): String = js.native
  def get(`type`: String): String = js.native
  def set(data: String): Unit = js.native
  def set(data: String, `type`: String): Unit = js.native
}

/* static members */
@JSImport("nw.gui", "Clipboard")
@js.native
object Clipboard extends js.Object {
  def get(): Clipboard = js.native
}

