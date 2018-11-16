package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.interaction.InteractionData")
@js.native
class InteractionData () extends js.Object {
  var button: scala.Double = js.native
  var buttons: scala.Double = js.native
  var global: pixiDotJsLib.PIXINs.Point = js.native
  var height: scala.Double = js.native
  var identifier: scala.Double = js.native
  var isPrimary: scala.Boolean = js.native
  var originalEvent: stdLib.MouseEvent | stdLib.TouchEvent | stdLib.PointerEvent = js.native
  val pointerID: scala.Double = js.native
  var pointerType: java.lang.String = js.native
  var pressure: scala.Double = js.native
  var rotationAngle: scala.Double = js.native
  var tangentialPressure: scala.Double = js.native
  var target: pixiDotJsLib.PIXINs.DisplayObject = js.native
  var tiltX: scala.Double = js.native
  var tiltY: scala.Double = js.native
  var twist: scala.Double = js.native
  var width: scala.Double = js.native
  def copyEvent(event: stdLib.MouseEvent): scala.Unit = js.native
  def copyEvent(event: stdLib.PointerEvent): scala.Unit = js.native
  def copyEvent(event: stdLib.Touch): scala.Unit = js.native
  def getLocalPosition(displayObject: pixiDotJsLib.PIXINs.DisplayObject): pixiDotJsLib.PIXINs.Point = js.native
  def getLocalPosition(displayObject: pixiDotJsLib.PIXINs.DisplayObject, point: pixiDotJsLib.PIXINs.Point): pixiDotJsLib.PIXINs.Point = js.native
  def getLocalPosition(
    displayObject: pixiDotJsLib.PIXINs.DisplayObject,
    point: pixiDotJsLib.PIXINs.Point,
    globalPos: pixiDotJsLib.PIXINs.Point
  ): pixiDotJsLib.PIXINs.Point = js.native
  def reset(): scala.Unit = js.native
}

