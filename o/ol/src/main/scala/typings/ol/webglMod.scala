package typings.ol

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/webgl", JSImport.Namespace)
@js.native
object webglMod extends js.Object {
  
  val ARRAY_BUFFER: Double = js.native
  
  val DYNAMIC_DRAW: Double = js.native
  
  val ELEMENT_ARRAY_BUFFER: Double = js.native
  
  val FLOAT: Double = js.native
  
  val STATIC_DRAW: Double = js.native
  
  val STREAM_DRAW: Double = js.native
  
  val UNSIGNED_BYTE: Double = js.native
  
  val UNSIGNED_INT: Double = js.native
  
  val UNSIGNED_SHORT: Double = js.native
  
  def getContext(canvas: HTMLCanvasElement): WebGLRenderingContext = js.native
  def getContext(canvas: HTMLCanvasElement, opt_attributes: js.Any): WebGLRenderingContext = js.native
  
  def getSupportedExtensions(): js.Array[String] = js.native
}
