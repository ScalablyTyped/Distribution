package typings.ol.layerGroupMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:layers`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerGroup
  extends typings.ol.layerBaseMod.default {
  def getLayers(): typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] = js.native
  @JSName("on")
  def on_changelayers(`type`: `change:layers`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changelayers(`type`: `change:layers`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setLayers(layers: typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]): Unit = js.native
  @JSName("un")
  def un_changelayers(`type`: `change:layers`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

