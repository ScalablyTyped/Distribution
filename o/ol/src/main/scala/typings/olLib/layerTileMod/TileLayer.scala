package typings
package olLib.layerTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayer
  extends olLib.layerLayerMod.default {
  var `type`: olLib.layerTypeMod.LayerType = js.native
  def getPreload(): scala.Double = js.native
  @JSName("getSource")
  def getSource_default(): olLib.sourceTileMod.default = js.native
  def getUseInterimTilesOnError(): scala.Boolean = js.native
  @JSName("on")
  def `on_change:preload`(
    `type`: olLib.olLibStrings.`change:preload`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def `on_change:useInterimTilesOnError`(
    `type`: olLib.olLibStrings.`change:useInterimTilesOnError`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:preload`(
    `type`: olLib.olLibStrings.`change:preload`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def `once_change:useInterimTilesOnError`(
    `type`: olLib.olLibStrings.`change:useInterimTilesOnError`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setPreload(preload: scala.Double): scala.Unit = js.native
  def setUseInterimTilesOnError(useInterimTilesOnError: scala.Boolean): scala.Unit = js.native
  @JSName("un")
  def `un_change:preload`(
    `type`: olLib.olLibStrings.`change:preload`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def `un_change:useInterimTilesOnError`(
    `type`: olLib.olLibStrings.`change:useInterimTilesOnError`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

