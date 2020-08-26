package typings.openseadragon.mod

import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Viewer")
@js.native
class Viewer protected () extends ControlDock {
  def this(options: Options) = this()
  var canvas: HTMLElement = js.native
  var container: HTMLElement = js.native
  var drawer: Drawer = js.native
  var element: HTMLElement = js.native
  var initialPage: Double = js.native
  var navigator: Navigator = js.native
  var referenceStrip: ReferenceStrip = js.native
  var viewport: Viewport = js.native
  var world: World = js.native
  def _cancelPendingImages(): Unit = js.native
  def addHandler(eventName: ViewerEventName, callback: EventHandler[ViewerEvent]): Unit = js.native
  def addHandler(eventName: ViewerEventName, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: ViewerEventName, callback: EventHandler[ViewerEvent]): Unit = js.native
  def addOnceHandler(
    eventName: ViewerEventName,
    callback: EventHandler[ViewerEvent],
    userData: js.UndefOr[scala.Nothing],
    times: Double
  ): Unit = js.native
  def addOnceHandler(eventName: ViewerEventName, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(
    eventName: ViewerEventName,
    callback: EventHandler[ViewerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  def addOverlay(element: String): Viewer = js.native
  def addOverlay(
    element: String,
    location: js.UndefOr[scala.Nothing],
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: js.UndefOr[scala.Nothing], placement: Placement): Viewer = js.native
  def addOverlay(
    element: String,
    location: js.UndefOr[scala.Nothing],
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Point): Viewer = js.native
  def addOverlay(
    element: String,
    location: Point,
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Point, placement: Placement): Viewer = js.native
  def addOverlay(
    element: String,
    location: Point,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Rect): Viewer = js.native
  def addOverlay(
    element: String,
    location: Rect,
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Rect, placement: Placement): Viewer = js.native
  def addOverlay(
    element: String,
    location: Rect,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: js.Object): Viewer = js.native
  def addOverlay(
    element: js.Object,
    location: js.UndefOr[scala.Nothing],
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: js.Object, location: js.UndefOr[scala.Nothing], placement: Placement): Viewer = js.native
  def addOverlay(
    element: js.Object,
    location: js.UndefOr[scala.Nothing],
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: js.Object, location: Point): Viewer = js.native
  def addOverlay(
    element: js.Object,
    location: Point,
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: js.Object, location: Point, placement: Placement): Viewer = js.native
  def addOverlay(
    element: js.Object,
    location: Point,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: js.Object, location: Rect): Viewer = js.native
  def addOverlay(
    element: js.Object,
    location: Rect,
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: js.Object, location: Rect, placement: Placement): Viewer = js.native
  def addOverlay(
    element: js.Object,
    location: Rect,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: js.UndefOr[scala.Nothing],
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: js.UndefOr[scala.Nothing], placement: Placement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: js.UndefOr[scala.Nothing],
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Point): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Point,
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Point, placement: Placement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Point,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Rect): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Rect,
    placement: js.UndefOr[scala.Nothing],
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Rect, placement: Placement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Rect,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addReferenceStrip(): Unit = js.native
  def addSimpleImage(options: SimpleImageOptions): Unit = js.native
  def addTiledImage(options: TiledImageOptions): Unit = js.native
  def bindSequenceControls(): Viewer = js.native
  def bindStandardControls(): Viewer = js.native
  def clearOverlays(): Viewer = js.native
  def close(): Viewer = js.native
  def currentPage(): Double = js.native
  def destroy(): Unit = js.native
  def forceRedraw(): Viewer = js.native
  def gestureSettingsByDeviceType(`type`: String): GestureSettings = js.native
  def getHandler(eventName: String): js.Function1[/* event */ Event, Unit] = js.native
  def getOverlayById(element: String): Overlay = js.native
  def getOverlayById(element: Element): Overlay = js.native
  def goToPage(page: Double): Viewer = js.native
  def isFullPage(): Boolean = js.native
  def isMouseNavEnabled(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def open(tileSources: String): Viewer = js.native
  def open(tileSources: String, initialPage: Double): Viewer = js.native
  def open(tileSources: js.Array[TileSource]): Viewer = js.native
  def open(tileSources: js.Array[TileSource], initialPage: Double): Viewer = js.native
  def open(tileSources: js.Object): Viewer = js.native
  def open(tileSources: js.Object, initialPage: Double): Viewer = js.native
  def raiseEvent(eventName: String): Unit = js.native
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  def removeAllHandlers(eventName: String): Unit = js.native
  def removeHandler(eventName: String, handler: EventHandler[ViewerEvent]): Unit = js.native
  def removeOverlay(overlay: String): Viewer = js.native
  def removeOverlay(overlay: Element): Viewer = js.native
  def removeReferenceStrip(): Unit = js.native
  def setDebugMode(debug: Boolean): Viewer = js.native
  def setFullPage(fullScreen: Boolean): Viewer = js.native
  def setFullScreen(fullScreen: Boolean): Viewer = js.native
  def setMouseNavEnabled(enabled: Boolean): Viewer = js.native
  def setVisible(visible: Boolean): Viewer = js.native
  def updateOverlay(element: String, location: Point): Viewer = js.native
  def updateOverlay(element: String, location: Point, placement: Placement): Viewer = js.native
  def updateOverlay(element: String, location: Rect): Viewer = js.native
  def updateOverlay(element: String, location: Rect, placement: Placement): Viewer = js.native
  def updateOverlay(element: Element, location: Point): Viewer = js.native
  def updateOverlay(element: Element, location: Point, placement: Placement): Viewer = js.native
  def updateOverlay(element: Element, location: Rect): Viewer = js.native
  def updateOverlay(element: Element, location: Rect, placement: Placement): Viewer = js.native
}

