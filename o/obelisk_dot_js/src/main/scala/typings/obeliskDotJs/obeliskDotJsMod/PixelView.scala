package typings.obeliskDotJs.obeliskDotJsMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "PixelView")
@js.native
class PixelView protected () extends js.Object {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, point: Point) = this()
  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var point: Point = js.native
  def clear(): Unit = js.native
  def renderObject(primitive: AbstractPrimitive): Unit = js.native
  def renderObject(primitive: AbstractPrimitive, point3D: Point3D): Unit = js.native
}

