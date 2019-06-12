package typings
package olLib.layerGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerGroup
  extends olLib.layerBaseMod.default {
  def getLayers(): olLib.collectionMod.default[olLib.layerBaseMod.default] = js.native
  @JSName("on")
  def on_changelayers(
    `type`: olLib.olLibStrings.`change:layers`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changelayers(
    `type`: olLib.olLibStrings.`change:layers`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setLayers(layers: olLib.collectionMod.default[olLib.layerBaseMod.default]): scala.Unit = js.native
  @JSName("un")
  def un_changelayers(
    `type`: olLib.olLibStrings.`change:layers`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

