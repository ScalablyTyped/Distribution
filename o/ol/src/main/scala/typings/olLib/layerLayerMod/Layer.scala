package typings
package olLib.layerLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer
  extends olLib.layerBaseMod.default {
  def getSource(): olLib.sourceSourceMod.default = js.native
  @JSName("on")
  def on_changesource(
    `type`: olLib.olLibStrings.`change:source`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_postcompose(
    `type`: olLib.olLibStrings.postcompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_precompose(
    `type`: olLib.olLibStrings.precompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_render(
    `type`: olLib.olLibStrings.render,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_rendercomplete(
    `type`: olLib.olLibStrings.rendercomplete,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changesource(
    `type`: olLib.olLibStrings.`change:source`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_postcompose(
    `type`: olLib.olLibStrings.postcompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_precompose(
    `type`: olLib.olLibStrings.precompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_render(
    `type`: olLib.olLibStrings.render,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_rendercomplete(
    `type`: olLib.olLibStrings.rendercomplete,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setMap(map: olLib.pluggableMapMod.default): scala.Unit = js.native
  def setSource(source: olLib.sourceSourceMod.default): scala.Unit = js.native
  @JSName("un")
  def un_changesource(
    `type`: olLib.olLibStrings.`change:source`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_postcompose(
    `type`: olLib.olLibStrings.postcompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_precompose(
    `type`: olLib.olLibStrings.precompose,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_render(
    `type`: olLib.olLibStrings.render,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_rendercomplete(
    `type`: olLib.olLibStrings.rendercomplete,
    listener: js.Function1[/* evt */ olLib.renderEventMod.default, scala.Unit]
  ): scala.Unit = js.native
}

