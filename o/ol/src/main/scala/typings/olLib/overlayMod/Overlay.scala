package typings
package olLib.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay
  extends olLib.objectMod.default {
  var autoPan: scala.Boolean = js.native
  var autoPanAnimation: PanOptions = js.native
  var autoPanMargin: scala.Double = js.native
  var element: stdLib.HTMLElement = js.native
  var id: scala.Double | java.lang.String = js.native
  var insertFirst: scala.Boolean = js.native
  var mapPostrenderListenerKey: olLib.eventsMod.EventsKey = js.native
  var options: Options = js.native
  var rendered: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var stopEvent: scala.Boolean = js.native
  def getElement(): stdLib.HTMLElement = js.native
  def getId(): scala.Double | java.lang.String = js.native
  def getMap(): olLib.pluggableMapMod.default = js.native
  def getOffset(): js.Array[scala.Double] = js.native
  def getOptions(): Options = js.native
  def getPosition(): olLib.coordinateMod.Coordinate = js.native
  def getPositioning(): olLib.overlayPositioningMod.OverlayPositioning = js.native
  /* protected */ def getRect(element: stdLib.HTMLElement, size: olLib.sizeMod.Size): olLib.extentMod.Extent = js.native
  /* protected */ def handleElementChanged(): scala.Unit = js.native
  /* protected */ def handleMapChanged(): scala.Unit = js.native
  /* protected */ def handleOffsetChanged(): scala.Unit = js.native
  /* protected */ def handlePositionChanged(): scala.Unit = js.native
  /* protected */ def handlePositioningChanged(): scala.Unit = js.native
  @JSName("on")
  def on_changeelement(
    `type`: olLib.olLibStrings.`change:element`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changemap(
    `type`: olLib.olLibStrings.`change:map`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeoffset(
    `type`: olLib.olLibStrings.`change:offset`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changeposition(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changepositioning(
    `type`: olLib.olLibStrings.`change:positioning`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeelement(
    `type`: olLib.olLibStrings.`change:element`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changemap(
    `type`: olLib.olLibStrings.`change:map`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeoffset(
    `type`: olLib.olLibStrings.`change:offset`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changeposition(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changepositioning(
    `type`: olLib.olLibStrings.`change:positioning`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  /* protected */ def panIntoView(): scala.Unit = js.native
  /* protected */ def render(): scala.Unit = js.native
  def setElement(element: stdLib.HTMLElement): scala.Unit = js.native
  def setMap(map: olLib.pluggableMapMod.default): scala.Unit = js.native
  def setOffset(offset: js.Array[scala.Double]): scala.Unit = js.native
  def setPosition(position: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def setPositioning(positioning: olLib.overlayPositioningMod.OverlayPositioning): scala.Unit = js.native
  /* protected */ def setVisible(visible: scala.Boolean): scala.Unit = js.native
  @JSName("un")
  def un_changeelement(
    `type`: olLib.olLibStrings.`change:element`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changemap(
    `type`: olLib.olLibStrings.`change:map`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeoffset(
    `type`: olLib.olLibStrings.`change:offset`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changeposition(
    `type`: olLib.olLibStrings.`change:position`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_changepositioning(
    `type`: olLib.olLibStrings.`change:positioning`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  /* protected */ def updatePixelPosition(): scala.Unit = js.native
  /* protected */ def updateRenderedPosition(pixel: olLib.pixelMod.Pixel, mapSize: olLib.sizeMod.Size): scala.Unit = js.native
}

