package typings.ol.layerTileMod

import typings.ol.eventsMod.EventsKey
import typings.ol.layerTypeMod.LayerType
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:preload`
import typings.ol.olStrings.`change:useInterimTilesOnError`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayer
  extends typings.ol.layerLayerMod.default {
  var `type`: LayerType = js.native
  def getPreload(): Double = js.native
  @JSName("getSource")
  def getSource_default(): typings.ol.sourceSourceMod.default = js.native
  def getUseInterimTilesOnError(): Boolean = js.native
  @JSName("on")
  def on_changepreload(`type`: `change:preload`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeuseInterimTilesOnError(`type`: `change:useInterimTilesOnError`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changepreload(`type`: `change:preload`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeuseInterimTilesOnError(`type`: `change:useInterimTilesOnError`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setPreload(preload: Double): Unit = js.native
  def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
  @JSName("un")
  def un_changepreload(`type`: `change:preload`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeuseInterimTilesOnError(`type`: `change:useInterimTilesOnError`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

