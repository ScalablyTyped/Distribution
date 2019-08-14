package typings.ol.sourceUrlTileMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.tileloadend
import typings.ol.olStrings.tileloaderror
import typings.ol.olStrings.tileloadstart
import typings.ol.sourceTileMod.TileSourceEvent
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlTile
  extends typings.ol.sourceTileMod.default {
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: LoadFunction = js.native
  @JSName("tileUrlFunction")
  var tileUrlFunction_Original: UrlFunction = js.native
  var urls: js.Array[String] = js.native
  def getTileLoadFunction(): LoadFunction = js.native
  def getTileUrlFunction(): UrlFunction = js.native
  def getUrls(): js.Array[String] | Null = js.native
  /* protected */ def handleTileChange(event: typings.ol.eventsEventMod.default): Unit = js.native
  @JSName("on")
  def on_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
  def setTileLoadFunction(tileLoadFunction: LoadFunction): Unit = js.native
  def setTileUrlFunction(tileUrlFunction: UrlFunction): Unit = js.native
  def setTileUrlFunction(tileUrlFunction: UrlFunction, key: String): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def setUrls(urls: js.Array[String]): Unit = js.native
  /* protected */ def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
  /* protected */ def tileUrlFunction(p0: TileCoord, p1: Double, p2: typings.ol.projProjectionMod.default): js.UndefOr[String] = js.native
  @JSName("un")
  def un_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
}

