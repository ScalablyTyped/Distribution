package typings.ol.overlayMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.`change:element`
import typings.ol.olStrings.`change:map`
import typings.ol.olStrings.`change:offset`
import typings.ol.olStrings.`change:position`
import typings.ol.olStrings.`change:positioning`
import typings.ol.overlayPositioningMod.OverlayPositioning
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay
  extends typings.ol.objectMod.default {
  var autoPan: Boolean = js.native
  var autoPanAnimation: PanOptions = js.native
  var autoPanMargin: Double = js.native
  var element: HTMLElement = js.native
  var id: Double | String = js.native
  var insertFirst: Boolean = js.native
  var mapPostrenderListenerKey: EventsKey = js.native
  var options: Options = js.native
  var rendered: js.Any = js.native
  var stopEvent: Boolean = js.native
  def getElement(): HTMLElement = js.native
  def getId(): Double | String = js.native
  def getMap(): typings.ol.pluggableMapMod.default = js.native
  def getOffset(): js.Array[Double] = js.native
  def getOptions(): Options = js.native
  def getPosition(): Coordinate = js.native
  def getPositioning(): OverlayPositioning = js.native
  /* protected */ def getRect(): Extent = js.native
  /* protected */ def getRect(element: js.UndefOr[scala.Nothing], size: Size): Extent = js.native
  /* protected */ def getRect(element: HTMLElement): Extent = js.native
  /* protected */ def getRect(element: HTMLElement, size: Size): Extent = js.native
  /* protected */ def handleElementChanged(): Unit = js.native
  /* protected */ def handleMapChanged(): Unit = js.native
  /* protected */ def handleOffsetChanged(): Unit = js.native
  /* protected */ def handlePositionChanged(): Unit = js.native
  /* protected */ def handlePositioningChanged(): Unit = js.native
  @JSName("on")
  def on_changeelement(`type`: `change:element`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changemap(`type`: `change:map`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeoffset(`type`: `change:offset`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: `change:position`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changepositioning(`type`: `change:positioning`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeelement(`type`: `change:element`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changemap(`type`: `change:map`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeoffset(`type`: `change:offset`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: `change:position`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changepositioning(`type`: `change:positioning`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  /* protected */ def panIntoView(): Unit = js.native
  /* protected */ def render(): Unit = js.native
  def setElement(): Unit = js.native
  def setElement(element: HTMLElement): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  def setOffset(offset: js.Array[Double]): Unit = js.native
  def setPosition(): Unit = js.native
  def setPosition(position: Coordinate): Unit = js.native
  def setPositioning(positioning: OverlayPositioning): Unit = js.native
  /* protected */ def setVisible(visible: Boolean): Unit = js.native
  @JSName("un")
  def un_changeelement(`type`: `change:element`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changemap(`type`: `change:map`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeoffset(`type`: `change:offset`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: `change:position`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changepositioning(`type`: `change:positioning`, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  /* protected */ def updatePixelPosition(): Unit = js.native
  /* protected */ def updateRenderedPosition(pixel: Pixel): Unit = js.native
  /* protected */ def updateRenderedPosition(pixel: Pixel, mapSize: Size): Unit = js.native
}

