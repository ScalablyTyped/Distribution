package typings.obeliskJs.mod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "PixelView")
@js.native
class PixelView protected () extends StObject {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, point: Point) = this()
  
  var canvas: HTMLCanvasElement = js.native
  
  def clear(): Unit = js.native
  
  var context: CanvasRenderingContext2D = js.native
  
  var point: Point = js.native
  
  def renderObject(primitive: AbstractPrimitive): Unit = js.native
  def renderObject(primitive: AbstractPrimitive, point3D: Point3D): Unit = js.native
}
