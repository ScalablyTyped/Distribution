package typings
package olLib.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw
  extends olLib.interactionPointerMod.default {
  def extend(feature: olLib.featureMod.default): scala.Unit = js.native
  def finishDrawing(): scala.Unit = js.native
  def getOverlay(): olLib.layerVectorMod.default = js.native
  @JSName("on")
  def on_drawend(`type`: olLib.olLibStrings.drawend, listener: js.Function1[/* evt */ DrawEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_drawstart(`type`: olLib.olLibStrings.drawstart, listener: js.Function1[/* evt */ DrawEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_drawend(`type`: olLib.olLibStrings.drawend, listener: js.Function1[/* evt */ DrawEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_drawstart(`type`: olLib.olLibStrings.drawstart, listener: js.Function1[/* evt */ DrawEvent, scala.Unit]): olLib.eventsMod.EventsKey = js.native
  def removeLastPoint(): scala.Unit = js.native
  @JSName("un")
  def un_drawend(`type`: olLib.olLibStrings.drawend, listener: js.Function1[/* evt */ DrawEvent, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_drawstart(`type`: olLib.olLibStrings.drawstart, listener: js.Function1[/* evt */ DrawEvent, scala.Unit]): scala.Unit = js.native
}

