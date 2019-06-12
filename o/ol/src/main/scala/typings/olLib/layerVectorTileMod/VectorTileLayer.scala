package typings
package olLib.layerVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayer
  extends olLib.layerVectorMod.default {
  def getPreload(): scala.Double = js.native
  def getUseInterimTilesOnError(): scala.Boolean = js.native
  @JSName("on")
  def on_changepreload(
    `type`: olLib.olLibStrings.`change:preload`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeuseInterimTilesOnError(
    `type`: olLib.olLibStrings.`change:useInterimTilesOnError`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changepreload(
    `type`: olLib.olLibStrings.`change:preload`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeuseInterimTilesOnError(
    `type`: olLib.olLibStrings.`change:useInterimTilesOnError`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setPreload(preload: scala.Double): scala.Unit = js.native
  def setUseInterimTilesOnError(useInterimTilesOnError: scala.Boolean): scala.Unit = js.native
  @JSName("un")
  def un_changepreload(
    `type`: olLib.olLibStrings.`change:preload`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeuseInterimTilesOnError(
    `type`: olLib.olLibStrings.`change:useInterimTilesOnError`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
}

