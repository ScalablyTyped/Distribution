package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.interaction.InteractionManager")
@js.native
class InteractionManager protected ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter {
  def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  def this(renderer: pixiDotJsLib.PIXINs.SystemRenderer) = this()
  def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer, options: InteractionManagerOptions) = this()
  def this(renderer: pixiDotJsLib.PIXINs.SystemRenderer, options: InteractionManagerOptions) = this()
  def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer, options: InteractionManagerOptions) = this()
  var _tempPoint: pixiDotJsLib.PIXINs.Point = js.native
  var activeInteractionData: org.scalablytyped.runtime.NumberDictionary[InteractionData] = js.native
  var autoPreventDefault: scala.Boolean = js.native
  var currentCursorMode: java.lang.String = js.native
  var currentCursorStyle: java.lang.String = js.native
  var cursor: java.lang.String = js.native
  var cursorStyles: pixiDotJsLib.Anon_Default = js.native
  // Deprecated
  var defaultCursorStyle: java.lang.String = js.native
  var eventData: InteractionEvent = js.native
  var eventsAdded: scala.Boolean = js.native
  var interactionDOMElement: stdLib.HTMLElement = js.native
  var interactionDataPool: js.Array[InteractionData] = js.native
  var interactionFrequency: scala.Double = js.native
  var mouse: InteractionData = js.native
  var mouseOverRenderer: scala.Boolean = js.native
  var moveWhenInside: scala.Boolean = js.native
  var renderer: pixiDotJsLib.PIXINs.SystemRenderer = js.native
  var resolution: scala.Double = js.native
  val supportsPointerEvents: scala.Boolean = js.native
  val supportsTouchEvents: scala.Boolean = js.native
  /* protected */ def addEvents(): scala.Unit = js.native
  /* protected */ def configureInteractionEventForDOMEvent(
    interactionEvent: InteractionEvent,
    pointerEvent: stdLib.PointerEvent,
    interactionData: InteractionData
  ): InteractionEvent = js.native
  def destroy(): scala.Unit = js.native
  /* protected */ def dispatchEvent(displayObject: pixiDotJsLib.PIXINs.Container, eventString: java.lang.String, eventData: js.Any): scala.Unit = js.native
  /* protected */ def dispatchEvent(displayObject: pixiDotJsLib.PIXINs.Sprite, eventString: java.lang.String, eventData: js.Any): scala.Unit = js.native
  /* protected */ def dispatchEvent(
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    eventString: java.lang.String,
    eventData: js.Any
  ): scala.Unit = js.native
  /* protected */ def getInteractionDataForPointerId(pointerId: scala.Double): InteractionData = js.native
  def hitTest(globalPoint: pixiDotJsLib.PIXINs.Point): pixiDotJsLib.PIXINs.DisplayObject = js.native
  def hitTest(globalPoint: pixiDotJsLib.PIXINs.Point, root: pixiDotJsLib.PIXINs.Container): pixiDotJsLib.PIXINs.DisplayObject = js.native
  def mapPositionToPoint(point: pixiDotJsLib.PIXINs.Point, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /* protected */ def normalizeToPointerData(event: stdLib.MouseEvent): js.Array[stdLib.PointerEvent] = js.native
  /* protected */ def normalizeToPointerData(event: stdLib.PointerEvent): js.Array[stdLib.PointerEvent] = js.native
  /* protected */ def normalizeToPointerData(event: stdLib.TouchEvent): js.Array[stdLib.PointerEvent] = js.native
  /* protected */ def onPointerCancel(event: stdLib.PointerEvent): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def onPointerComplete(originalEvent: stdLib.PointerEvent, cancelled: scala.Boolean, func: js.Function): scala.Unit = js.native
  /* protected */ def onPointerDown(event: stdLib.PointerEvent): scala.Unit = js.native
  /* protected */ def onPointerMove(event: stdLib.PointerEvent): scala.Unit = js.native
  /* protected */ def onPointerOut(event: stdLib.PointerEvent): scala.Unit = js.native
  /* protected */ def onPointerOver(event: stdLib.PointerEvent): scala.Unit = js.native
  /* protected */ def onPointerUp(event: stdLib.PointerEvent): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Container): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    func: js.Function
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    func: js.Function,
    hitTest: scala.Boolean
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    func: js.Function,
    hitTest: scala.Boolean,
    interactive: scala.Boolean
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite, func: js.Function): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Sprite,
    func: js.Function,
    hitTest: scala.Boolean
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Sprite,
    func: js.Function,
    hitTest: scala.Boolean,
    interactive: scala.Boolean
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    func: js.Function
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    func: js.Function,
    hitTest: scala.Boolean
  ): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  /* protected */ def processInteractive(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    func: js.Function,
    hitTest: scala.Boolean,
    interactive: scala.Boolean
  ): scala.Boolean = js.native
  /* protected */ def processPointerCancel(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Container): scala.Unit = js.native
  /* protected */ def processPointerCancel(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite): scala.Unit = js.native
  /* protected */ def processPointerCancel(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite): scala.Unit = js.native
  /* protected */ def processPointerDown(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerDown(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite, hit: scala.Boolean): scala.Unit = js.native
  /* protected */ def processPointerDown(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerMove(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerMove(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite, hit: scala.Boolean): scala.Unit = js.native
  /* protected */ def processPointerMove(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerOverOut(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerOverOut(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite, hit: scala.Boolean): scala.Unit = js.native
  /* protected */ def processPointerOverOut(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerUp(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.Container,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def processPointerUp(interactionEvent: InteractionEvent, displayObject: pixiDotJsLib.PIXINs.Sprite, hit: scala.Boolean): scala.Unit = js.native
  /* protected */ def processPointerUp(
    interactionEvent: InteractionEvent,
    displayObject: pixiDotJsLib.PIXINs.extrasNs.TilingSprite,
    hit: scala.Boolean
  ): scala.Unit = js.native
  /* protected */ def releaseInteractionDataForPointerId(event: stdLib.PointerEvent): scala.Unit = js.native
  /* protected */ def removeEvents(): scala.Unit = js.native
  def setCursorMode(mode: java.lang.String): scala.Unit = js.native
  def setTargetElement(element: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def setTargetElement(element: stdLib.HTMLCanvasElement, resolution: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(deltaTime: scala.Double): scala.Unit = js.native
}

