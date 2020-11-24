package typings.ol.overlayMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olBooleans.`false`
import typings.ol.olStrings.changeColonelement
import typings.ol.olStrings.changeColonmap
import typings.ol.olStrings.changeColonoffset
import typings.ol.olStrings.changeColonposition
import typings.ol.olStrings.changeColonpositioning
import typings.ol.overlayPositioningMod.OverlayPositioning
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay
  extends typings.ol.objectMod.default {
  
  var autoPan: PanIntoViewOptions | `false` = js.native
  
  var element: HTMLElement = js.native
  
  /**
    * Get the DOM element of this overlay.
    */
  def getElement(): js.UndefOr[HTMLElement] = js.native
  
  /**
    * Get the overlay identifier which is set on constructor.
    */
  def getId(): js.UndefOr[Double | String] = js.native
  
  /**
    * Get the map associated with this overlay.
    */
  def getMap(): js.UndefOr[typings.ol.pluggableMapMod.default] = js.native
  
  /**
    * Get the offset of this overlay.
    */
  def getOffset(): js.Array[Double] = js.native
  
  /**
    * returns the options this Overlay has been created with
    */
  def getOptions(): Options = js.native
  
  /**
    * Get the current position of this overlay.
    */
  def getPosition(): js.UndefOr[Coordinate] = js.native
  
  /**
    * Get the current positioning of this overlay.
    */
  def getPositioning(): OverlayPositioning = js.native
  
  /**
    * Get the extent of an element relative to the document
    */
  /* protected */ def getRect(element: HTMLElement, size: Size): Extent = js.native
  
  /* protected */ def handleElementChanged(): Unit = js.native
  
  /* protected */ def handleMapChanged(): Unit = js.native
  
  /* protected */ def handleOffsetChanged(): Unit = js.native
  
  /* protected */ def handlePositionChanged(): Unit = js.native
  
  /* protected */ def handlePositioningChanged(): Unit = js.native
  
  var id: Double | String = js.native
  
  var insertFirst: Boolean = js.native
  
  var mapPostrenderListenerKey: EventsKey = js.native
  
  @JSName("on")
  def on_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  var options: Options = js.native
  
  /**
    * Pan the map so that the overlay is entirely visible in the current viewport
    * (if necessary).
    */
  def panIntoView(): Unit = js.native
  def panIntoView(opt_panIntoViewOptions: PanIntoViewOptions): Unit = js.native
  
  /**
    * Pan the map so that the overlay is entirely visisble in the current viewport
    * (if necessary) using the configured autoPan parameters
    */
  /* protected */ def performAutoPan(): Unit = js.native
  
  /* protected */ def render(): Unit = js.native
  
  var rendered: js.Any = js.native
  
  /**
    * Set the DOM element to be associated with this overlay.
    */
  def setElement(): Unit = js.native
  def setElement(element: HTMLElement): Unit = js.native
  
  /**
    * Set the map to be associated with this overlay.
    */
  def setMap(): Unit = js.native
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  
  /**
    * Set the offset for this overlay.
    */
  def setOffset(offset: js.Array[Double]): Unit = js.native
  
  /**
    * Set the position for this overlay. If the position is undefined the
    * overlay is hidden.
    */
  def setPosition(): Unit = js.native
  def setPosition(position: Coordinate): Unit = js.native
  
  /**
    * Set the positioning for this overlay.
    */
  def setPositioning(positioning: OverlayPositioning): Unit = js.native
  
  /**
    * Modify the visibility of the element.
    */
  /* protected */ def setVisible(visible: Boolean): Unit = js.native
  
  var stopEvent: Boolean = js.native
  
  @JSName("un")
  def un_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  
  /**
    * Update pixel position.
    */
  /* protected */ def updatePixelPosition(): Unit = js.native
  
  /* protected */ def updateRenderedPosition(pixel: Pixel): Unit = js.native
  /* protected */ def updateRenderedPosition(pixel: Pixel, mapSize: Size): Unit = js.native
}
