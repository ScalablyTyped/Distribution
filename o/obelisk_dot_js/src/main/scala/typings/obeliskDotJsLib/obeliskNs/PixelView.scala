package typings
package obeliskDotJsLib.obeliskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("obelisk.PixelView")
@js.native
class PixelView protected () extends js.Object {
  def this(canvas: stdLib.HTMLCanvasElement) = this()
  def this(canvas: stdLib.HTMLCanvasElement, point: Point) = this()
  var canvas: stdLib.HTMLCanvasElement = js.native
  var context: stdLib.CanvasRenderingContext2D = js.native
  var point: Point = js.native
  def clear(): scala.Unit = js.native
  def renderObject(primitive: AbstractPrimitive): scala.Unit = js.native
  def renderObject(primitive: AbstractPrimitive, point3D: Point3D): scala.Unit = js.native
}

