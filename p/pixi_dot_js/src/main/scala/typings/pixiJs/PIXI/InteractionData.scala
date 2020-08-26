package typings.pixiJs.PIXI

import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds all information related to an Interaction event
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait InteractionData extends js.Object {
  /**
    * Indicates which button was pressed on the mouse or pointer device to trigger the event.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/button
    * @type {number}
    */
  var button: Double = js.native
  /**
    * Indicates which buttons are pressed on the mouse or pointer device when the event is triggered.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/buttons
    * @type {number}
    */
  var buttons: Double = js.native
  /**
    * This point stores the global coords of where the touch/mouse event happened
    *
    * @member {PIXI.Point} PIXI.InteractionData#global
    */
  var global: Point = js.native
  /**
    * The height of the pointer's contact along the y-axis, measured in CSS pixels.
    * radiusY of TouchEvents will be represented by this value.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/height
    * @type {number}
    */
  var height: Double = js.native
  /**
    * Unique identifier for this interaction
    *
    * @member {number} PIXI.InteractionData#identifier
    */
  var identifier: Double = js.native
  /**
    * Indicates whether or not the pointer device that created the event is the primary pointer.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/isPrimary
    * @type {Boolean}
    */
  var isPrimary: Boolean = js.native
  /**
    * When passed to an event handler, this will be the original DOM Event that was captured
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent
    * @see https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent
    * @member {MouseEvent|TouchEvent|PointerEvent} PIXI.InteractionData#originalEvent
    */
  var originalEvent: MouseEvent | TouchEvent | PointerEvent = js.native
  /**
    * The unique identifier of the pointer. It will be the same as `identifier`.
    * @readonly
    * @member {number}
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pointerId
    */
  val pointerId: Double = js.native
  /**
    * The type of pointer that triggered the event.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pointerType
    * @type {string}
    */
  var pointerType: String = js.native
  /**
    * Pressure applied by the pointing device during the event. A Touch's force property
    * will be represented by this value.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pressure
    * @type {number}
    */
  var pressure: Double = js.native
  /**
    * From TouchEvents (not PointerEvents triggered by touches), the rotationAngle of the Touch.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/Touch/rotationAngle
    * @type {number}
    */
  var rotationAngle: Double = js.native
  /**
    * Barrel pressure on a stylus pointer.
    * @see https://w3c.github.io/pointerevents/#pointerevent-interface
    * @type {number}
    */
  var tangentialPressure: Double = js.native
  /**
    * The target Sprite that was interacted with
    *
    * @member {PIXI.Sprite} PIXI.InteractionData#target
    */
  var target: Sprite = js.native
  /**
    * The angle, in degrees, between the pointer device and the screen.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/tiltX
    * @type {number}
    */
  var tiltX: Double = js.native
  /**
    * The angle, in degrees, between the pointer device and the screen.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/tiltY
    * @type {number}
    */
  var tiltY: Double = js.native
  /**
    * Twist of a stylus pointer.
    * @see https://w3c.github.io/pointerevents/#pointerevent-interface
    * @type {number}
    */
  var twist: Double = js.native
  /**
    * The width of the pointer's contact along the x-axis, measured in CSS pixels.
    * radiusX of TouchEvents will be represented by this value.
    * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/width
    * @type {number}
    */
  var width: Double = js.native
  def copyEvent(event: MouseEvent): Unit = js.native
  def copyEvent(event: PointerEvent): Unit = js.native
  /**
    * Copies properties from normalized event data.
    *
    * @param {Touch|MouseEvent|PointerEvent} event - The normalized event data
    */
  def copyEvent(event: Touch): Unit = js.native
  /**
    * This will return the local coordinates of the specified displayObject for this InteractionData
    *
    * @param {PIXI.DisplayObject} displayObject - The DisplayObject that you would like the local
    *  coords off
    * @param {PIXI.Point} [point] - A Point object in which to store the value, optional (otherwise
    *  will create a new point)
    * @param {PIXI.Point} [globalPos] - A Point object containing your custom global coords, optional
    *  (otherwise will use the current global coords)
    * @return {PIXI.Point} A point containing the coordinates of the InteractionData position relative
    *  to the DisplayObject
    */
  def getLocalPosition(displayObject: DisplayObject): Point = js.native
  def getLocalPosition(displayObject: DisplayObject, point: js.UndefOr[scala.Nothing], globalPos: Point): Point = js.native
  def getLocalPosition(displayObject: DisplayObject, point: Point): Point = js.native
  def getLocalPosition(displayObject: DisplayObject, point: Point, globalPos: Point): Point = js.native
  /**
    * Resets the data for pooling.
    */
  def reset(): Unit = js.native
}

