package typings.ol

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglMod {
  
  @JSImport("ol/webgl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/webgl", "ARRAY_BUFFER")
  @js.native
  val ARRAY_BUFFER: Double = js.native
  
  @JSImport("ol/webgl", "DYNAMIC_DRAW")
  @js.native
  val DYNAMIC_DRAW: Double = js.native
  
  @JSImport("ol/webgl", "ELEMENT_ARRAY_BUFFER")
  @js.native
  val ELEMENT_ARRAY_BUFFER: Double = js.native
  
  @JSImport("ol/webgl", "FLOAT")
  @js.native
  val FLOAT: Double = js.native
  
  @JSImport("ol/webgl", "STATIC_DRAW")
  @js.native
  val STATIC_DRAW: Double = js.native
  
  @JSImport("ol/webgl", "STREAM_DRAW")
  @js.native
  val STREAM_DRAW: Double = js.native
  
  @JSImport("ol/webgl", "UNSIGNED_BYTE")
  @js.native
  val UNSIGNED_BYTE: Double = js.native
  
  @JSImport("ol/webgl", "UNSIGNED_INT")
  @js.native
  val UNSIGNED_INT: Double = js.native
  
  @JSImport("ol/webgl", "UNSIGNED_SHORT")
  @js.native
  val UNSIGNED_SHORT: Double = js.native
  
  inline def getContext(canvas: HTMLCanvasElement): WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(canvas.asInstanceOf[js.Any]).asInstanceOf[WebGLRenderingContext]
  inline def getContext(canvas: HTMLCanvasElement, attributes: Any): WebGLRenderingContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(canvas.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[WebGLRenderingContext]
  
  inline def getSupportedExtensions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedExtensions")().asInstanceOf[js.Array[String]]
}
