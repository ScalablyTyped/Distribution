package typings.ol.eventsTargetMod

import typings.ol.eventsMod.ListenerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target
  extends typings.ol.disposableMod.default {
  def addEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
  def dispatchEvent(event: String): js.UndefOr[Boolean] = js.native
  def dispatchEvent(event: js.Object): js.UndefOr[Boolean] = js.native
  def dispatchEvent(event: typings.ol.eventsEventMod.default): js.UndefOr[Boolean] = js.native
  def getListeners(`type`: String): js.Array[ListenerFunction] = js.native
  def hasListener(): Boolean = js.native
  def hasListener(opt_type: String): Boolean = js.native
  def removeEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
}

