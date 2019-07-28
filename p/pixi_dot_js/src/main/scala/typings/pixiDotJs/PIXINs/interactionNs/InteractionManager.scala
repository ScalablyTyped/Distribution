package typings.pixiDotJs.PIXINs.interactionNs

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDotJs.Anon_Default
import typings.pixiDotJs.PIXINs.CanvasRenderer
import typings.pixiDotJs.PIXINs.Container
import typings.pixiDotJs.PIXINs.DisplayObject
import typings.pixiDotJs.PIXINs.Point
import typings.pixiDotJs.PIXINs.Sprite
import typings.pixiDotJs.PIXINs.SystemRenderer
import typings.pixiDotJs.PIXINs.WebGLRenderer
import typings.pixiDotJs.PIXINs.extrasNs.TilingSprite
import typings.pixiDotJs.PIXINs.utilsNs.EventEmitter
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.interaction.InteractionManager")
@js.native
class InteractionManager protected () extends EventEmitter {
  def this(renderer: CanvasRenderer) = this()
  def this(renderer: SystemRenderer) = this()
  def this(renderer: WebGLRenderer) = this()
  def this(renderer: CanvasRenderer, options: InteractionManagerOptions) = this()
  def this(renderer: SystemRenderer, options: InteractionManagerOptions) = this()
  def this(renderer: WebGLRenderer, options: InteractionManagerOptions) = this()
  var _tempPoint: Point = js.native
  var activeInteractionData: NumberDictionary[InteractionData] = js.native
  var autoPreventDefault: Boolean = js.native
  var currentCursorMode: String = js.native
  var currentCursorStyle: String = js.native
  var cursor: String = js.native
  var cursorStyles: Anon_Default = js.native
  // Deprecated
  var defaultCursorStyle: String = js.native
  var eventData: InteractionEvent = js.native
  var eventsAdded: Boolean = js.native
  var interactionDOMElement: HTMLElement = js.native
  var interactionDataPool: js.Array[InteractionData] = js.native
  var interactionFrequency: Double = js.native
  var mouse: InteractionData = js.native
  var mouseOverRenderer: Boolean = js.native
  var moveWhenInside: Boolean = js.native
  var renderer: SystemRenderer = js.native
  var resolution: Double = js.native
  val supportsPointerEvents: Boolean = js.native
  val supportsTouchEvents: Boolean = js.native
  /* protected */ def addEvents(): Unit = js.native
  /* protected */ def configureInteractionEventForDOMEvent(interactionEvent: InteractionEvent, pointerEvent: PointerEvent, interactionData: InteractionData): InteractionEvent = js.native
  def destroy(): Unit = js.native
  /* protected */ def dispatchEvent(displayObject: Container, eventString: String, eventData: js.Any): Unit = js.native
  /* protected */ def dispatchEvent(displayObject: Sprite, eventString: String, eventData: js.Any): Unit = js.native
  /* protected */ def dispatchEvent(displayObject: TilingSprite, eventString: String, eventData: js.Any): Unit = js.native
  /* protected */ def getInteractionDataForPointerId(pointerId: Double): InteractionData = js.native
  def hitTest(globalPoint: Point): DisplayObject = js.native
  def hitTest(globalPoint: Point, root: Container): DisplayObject = js.native
  def mapPositionToPoint(point: Point, x: Double, y: Double): Unit = js.native
  /* protected */ def normalizeToPointerData(event: MouseEvent): js.Array[PointerEvent] = js.native
  /* protected */ def normalizeToPointerData(event: PointerEvent): js.Array[PointerEvent] = js.native
  /* protected */ def normalizeToPointerData(event: TouchEvent): js.Array[PointerEvent] = js.native
  /* protected */ def onPointerCancel(event: PointerEvent): Unit = js.native
  /* protected */ def onPointerComplete(originalEvent: PointerEvent, cancelled: Boolean, func: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /* protected */ def onPointerDown(event: PointerEvent): Unit = js.native
  /* protected */ def onPointerMove(event: PointerEvent): Unit = js.native
  /* protected */ def onPointerOut(event: PointerEvent): Unit = js.native
  /* protected */ def onPointerOver(event: PointerEvent): Unit = js.native
  /* protected */ def onPointerUp(event: PointerEvent): Unit = js.native
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: Container): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Container,
    func: js.Function1[/* repeated */ js.Any, _]
  ): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Container,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean
  ): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Container,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean,
    interactive: Boolean
  ): Boolean = js.native
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: Sprite): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Sprite,
    func: js.Function1[/* repeated */ js.Any, _]
  ): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Sprite,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean
  ): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: Sprite,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean,
    interactive: Boolean
  ): Boolean = js.native
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: TilingSprite): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: TilingSprite,
    func: js.Function1[/* repeated */ js.Any, _]
  ): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: TilingSprite,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean
  ): Boolean = js.native
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: TilingSprite,
    func: js.Function1[/* repeated */ js.Any, _],
    hitTest: Boolean,
    interactive: Boolean
  ): Boolean = js.native
  /* protected */ def processPointerCancel(interactionEvent: InteractionEvent, displayObject: Container): Unit = js.native
  /* protected */ def processPointerCancel(interactionEvent: InteractionEvent, displayObject: Sprite): Unit = js.native
  /* protected */ def processPointerCancel(interactionEvent: InteractionEvent, displayObject: TilingSprite): Unit = js.native
  /* protected */ def processPointerDown(interactionEvent: InteractionEvent, displayObject: Container, hit: Boolean): Unit = js.native
  /* protected */ def processPointerDown(interactionEvent: InteractionEvent, displayObject: Sprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerDown(interactionEvent: InteractionEvent, displayObject: TilingSprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerMove(interactionEvent: InteractionEvent, displayObject: Container, hit: Boolean): Unit = js.native
  /* protected */ def processPointerMove(interactionEvent: InteractionEvent, displayObject: Sprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerMove(interactionEvent: InteractionEvent, displayObject: TilingSprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerOverOut(interactionEvent: InteractionEvent, displayObject: Container, hit: Boolean): Unit = js.native
  /* protected */ def processPointerOverOut(interactionEvent: InteractionEvent, displayObject: Sprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerOverOut(interactionEvent: InteractionEvent, displayObject: TilingSprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerUp(interactionEvent: InteractionEvent, displayObject: Container, hit: Boolean): Unit = js.native
  /* protected */ def processPointerUp(interactionEvent: InteractionEvent, displayObject: Sprite, hit: Boolean): Unit = js.native
  /* protected */ def processPointerUp(interactionEvent: InteractionEvent, displayObject: TilingSprite, hit: Boolean): Unit = js.native
  /* protected */ def releaseInteractionDataForPointerId(event: PointerEvent): Unit = js.native
  /* protected */ def removeEvents(): Unit = js.native
  def setCursorMode(mode: String): Unit = js.native
  def setTargetElement(element: HTMLCanvasElement): Unit = js.native
  def setTargetElement(element: HTMLCanvasElement, resolution: Double): Unit = js.native
  def update(): Unit = js.native
  def update(deltaTime: Double): Unit = js.native
}

