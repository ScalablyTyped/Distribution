package typings.pixiDotJs.PIXI.interaction

import typings.pixiDotJs.PIXI.DisplayObject
import typings.pixiDotJs.PIXI.Point
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.interaction.InteractionData")
@js.native
class InteractionData () extends js.Object {
  var button: Double = js.native
  var buttons: Double = js.native
  var global: Point = js.native
  var height: Double = js.native
  var identifier: Double = js.native
  var isPrimary: Boolean = js.native
  var originalEvent: MouseEvent | TouchEvent | PointerEvent = js.native
  val pointerID: Double = js.native
  var pointerType: String = js.native
  var pressure: Double = js.native
  var rotationAngle: Double = js.native
  var tangentialPressure: Double = js.native
  var target: DisplayObject = js.native
  var tiltX: Double = js.native
  var tiltY: Double = js.native
  var twist: Double = js.native
  var width: Double = js.native
  def copyEvent(event: MouseEvent): Unit = js.native
  def copyEvent(event: PointerEvent): Unit = js.native
  def copyEvent(event: Touch): Unit = js.native
  def getLocalPosition(displayObject: DisplayObject): Point = js.native
  def getLocalPosition(displayObject: DisplayObject, point: Point): Point = js.native
  def getLocalPosition(displayObject: DisplayObject, point: Point, globalPos: Point): Point = js.native
  def reset(): Unit = js.native
}

