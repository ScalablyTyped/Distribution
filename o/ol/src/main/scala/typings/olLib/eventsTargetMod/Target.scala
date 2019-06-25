package typings
package olLib.eventsTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target
  extends olLib.disposableMod.default {
  def addEventListener(`type`: java.lang.String, listener: olLib.eventsMod.ListenerFunction): scala.Unit = js.native
  def dispatchEvent(event: java.lang.String): scala.Boolean = js.native
  def dispatchEvent(event: js.Object): scala.Boolean = js.native
  def dispatchEvent(event: olLib.eventsEventMod.default): scala.Boolean = js.native
  def getListeners(`type`: java.lang.String): js.Array[olLib.eventsMod.ListenerFunction] = js.native
  def hasListener(): scala.Boolean = js.native
  def hasListener(opt_type: java.lang.String): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: olLib.eventsMod.ListenerFunction): scala.Unit = js.native
}

