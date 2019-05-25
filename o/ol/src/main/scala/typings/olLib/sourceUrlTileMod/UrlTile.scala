package typings
package olLib.sourceUrlTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlTile
  extends olLib.sourceTileMod.default {
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: olLib.tileMod.LoadFunction = js.native
  @JSName("tileUrlFunction")
  var tileUrlFunction_Original: olLib.tileMod.UrlFunction = js.native
  var urls: js.Array[java.lang.String] = js.native
  def getTileLoadFunction(): olLib.tileMod.LoadFunction = js.native
  def getTileUrlFunction(): olLib.tileMod.UrlFunction = js.native
  def getUrls(): js.Array[java.lang.String] = js.native
  /* protected */ def handleTileChange(event: olLib.eventsEventMod.default): scala.Unit = js.native
  @JSName("on")
  def on_tileloadend(
    `type`: olLib.olLibStrings.tileloadend,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_tileloaderror(
    `type`: olLib.olLibStrings.tileloaderror,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_tileloadstart(
    `type`: olLib.olLibStrings.tileloadstart,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_tileloadend(
    `type`: olLib.olLibStrings.tileloadend,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_tileloaderror(
    `type`: olLib.olLibStrings.tileloaderror,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_tileloadstart(
    `type`: olLib.olLibStrings.tileloadstart,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setTileLoadFunction(tileLoadFunction: olLib.tileMod.LoadFunction): scala.Unit = js.native
  def setTileUrlFunction(tileUrlFunction: olLib.tileMod.UrlFunction): scala.Unit = js.native
  def setTileUrlFunction(tileUrlFunction: olLib.tileMod.UrlFunction, key: java.lang.String): scala.Unit = js.native
  def setUrl(url: java.lang.String): scala.Unit = js.native
  def setUrls(urls: js.Array[java.lang.String]): scala.Unit = js.native
  /* protected */ def tileLoadFunction(param0: olLib.tileMod.Tile, param1: java.lang.String): scala.Unit = js.native
  /* protected */ def tileUrlFunction(
    param0: olLib.tilecoordMod.TileCoord,
    param1: scala.Double,
    param2: olLib.projProjectionMod.default
  ): java.lang.String = js.native
  @JSName("un")
  def un_tileloadend(
    `type`: olLib.olLibStrings.tileloadend,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_tileloaderror(
    `type`: olLib.olLibStrings.tileloaderror,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_tileloadstart(
    `type`: olLib.olLibStrings.tileloadstart,
    listener: js.Function1[/* evt */ olLib.sourceTileMod.TileSourceEvent, scala.Unit]
  ): scala.Unit = js.native
}

