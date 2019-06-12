package typings
package olLib.layerHeatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heatmap
  extends olLib.layerVectorMod.default {
  def getBlur(): scala.Double = js.native
  def getGradient(): js.Array[java.lang.String] = js.native
  def getRadius(): scala.Double = js.native
  @JSName("on")
  def on_changeblur(
    `type`: olLib.olLibStrings.`change:blur`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changegradient(
    `type`: olLib.olLibStrings.`change:gradient`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeradius(
    `type`: olLib.olLibStrings.`change:radius`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeblur(
    `type`: olLib.olLibStrings.`change:blur`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changegradient(
    `type`: olLib.olLibStrings.`change:gradient`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeradius(
    `type`: olLib.olLibStrings.`change:radius`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setBlur(blur: scala.Double): scala.Unit = js.native
  def setGradient(colors: js.Array[java.lang.String]): scala.Unit = js.native
  def setRadius(radius: scala.Double): scala.Unit = js.native
  @JSName("un")
  def un_changeblur(
    `type`: olLib.olLibStrings.`change:blur`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changegradient(
    `type`: olLib.olLibStrings.`change:gradient`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeradius(
    `type`: olLib.olLibStrings.`change:radius`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

