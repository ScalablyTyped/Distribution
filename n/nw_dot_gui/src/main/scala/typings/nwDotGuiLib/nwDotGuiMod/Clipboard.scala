package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Clipboard")
@js.native
class Clipboard () extends js.Object {
  def clear(): scala.Unit = js.native
  def get(): java.lang.String = js.native
  def get(`type`: java.lang.String): java.lang.String = js.native
  def set(data: java.lang.String): scala.Unit = js.native
  def set(data: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("nw.gui", "Clipboard")
@js.native
object Clipboard extends js.Object {
  def get(): nwDotGuiLib.nwDotGuiMod.Clipboard = js.native
}

