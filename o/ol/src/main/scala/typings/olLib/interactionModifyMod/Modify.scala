package typings
package olLib.interactionModifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modify
  extends olLib.interactionPointerMod.default {
  def getOverlay(): olLib.layerVectorMod.default = js.native
  @JSName("on")
  def on_modifyend(`type`: olLib.olLibStrings.modifyend, listener: js.Function1[/* evt */ ModifyEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_modifystart(`type`: olLib.olLibStrings.modifystart, listener: js.Function1[/* evt */ ModifyEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_modifyend(`type`: olLib.olLibStrings.modifyend, listener: js.Function1[/* evt */ ModifyEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_modifystart(`type`: olLib.olLibStrings.modifystart, listener: js.Function1[/* evt */ ModifyEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  def removePoint(): scala.Boolean = js.native
  @JSName("un")
  def un_modifyend(`type`: olLib.olLibStrings.modifyend, listener: js.Function1[/* evt */ ModifyEvent, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_modifystart(`type`: olLib.olLibStrings.modifystart, listener: js.Function1[/* evt */ ModifyEvent, scala.Unit]): scala.Unit = js.native
}

