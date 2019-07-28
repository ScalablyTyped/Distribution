package typings.ol.layerHeatmapMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:blur`
import typings.ol.olStrings.`change:gradient`
import typings.ol.olStrings.`change:radius`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heatmap
  extends typings.ol.layerVectorMod.default {
  def getBlur(): Double = js.native
  def getGradient(): js.Array[String] = js.native
  def getRadius(): Double = js.native
  @JSName("on")
  def on_changeblur(`type`: `change:blur`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changegradient(`type`: `change:gradient`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeradius(`type`: `change:radius`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeblur(`type`: `change:blur`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changegradient(`type`: `change:gradient`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeradius(`type`: `change:radius`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setBlur(blur: Double): Unit = js.native
  def setGradient(colors: js.Array[String]): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  @JSName("un")
  def un_changeblur(`type`: `change:blur`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changegradient(`type`: `change:gradient`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeradius(`type`: `change:radius`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

