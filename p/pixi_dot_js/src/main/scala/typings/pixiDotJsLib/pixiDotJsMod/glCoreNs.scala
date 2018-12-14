package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////pixi-gl-core/////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
// pixi-gl-core 1.1.4 https://github.com/pixijs/pixi-gl-core
// sharedArrayBuffer as a type is not available yet.
// need to fully define what an `Attrib` is.
@JSImport("pixi.js", "glCore")
@js.native
object glCoreNs extends js.Object {
  @js.native
  class GLBuffer protected ()
    extends pixiDotJsLib.PIXINs.glCoreNs.GLBuffer {
    def this(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: js.Any, drawType: scala.Double) = this()
    def this(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: stdLib.ArrayBufferView, drawType: scala.Double) = this()
    def this(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: stdLib.ArrayBuffer, drawType: scala.Double) = this()
  }
  
  @js.native
  class GLFramebuffer protected ()
    extends pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer {
    def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double) = this()
  }
  
  @js.native
  class GLShader protected ()
    extends pixiDotJsLib.PIXINs.glCoreNs.GLShader {
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: java.lang.String, fragmentSrc: java.lang.String) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: java.lang.String, fragmentSrc: js.Array[java.lang.String]) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: js.Array[java.lang.String], fragmentSrc: java.lang.String) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: js.Array[java.lang.String], fragmentSrc: js.Array[java.lang.String]) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: java.lang.String, fragmentSrc: java.lang.String, precision: java.lang.String) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: java.lang.String, fragmentSrc: js.Array[java.lang.String], precision: java.lang.String) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: js.Array[java.lang.String], fragmentSrc: java.lang.String, precision: java.lang.String) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: js.Array[java.lang.String], fragmentSrc: js.Array[java.lang.String], precision: java.lang.String) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: java.lang.String, fragmentSrc: java.lang.String, precision: java.lang.String, attributeLocations: org.scalablytyped.runtime.StringDictionary[scala.Double]) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: java.lang.String, fragmentSrc: js.Array[java.lang.String], precision: java.lang.String, attributeLocations: org.scalablytyped.runtime.StringDictionary[scala.Double]) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: js.Array[java.lang.String], fragmentSrc: java.lang.String, precision: java.lang.String, attributeLocations: org.scalablytyped.runtime.StringDictionary[scala.Double]) = this()
    def this(gl: stdLib.WebGLRenderingContext, vertexSrc: js.Array[java.lang.String], fragmentSrc: js.Array[java.lang.String], precision: java.lang.String, attributeLocations: org.scalablytyped.runtime.StringDictionary[scala.Double]) = this()
  }
  
  @js.native
  class GLTexture protected ()
    extends pixiDotJsLib.PIXINs.glCoreNs.GLTexture {
    def this(gl: stdLib.WebGLRenderingContext) = this()
    def this(gl: stdLib.WebGLRenderingContext, width: scala.Double) = this()
    def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double) = this()
    def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, format: scala.Double) = this()
    def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, format: scala.Double, `type`: scala.Double) = this()
  }
  
  @js.native
  class VertexArrayObject protected ()
    extends pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject {
    def this(gl: stdLib.WebGLRenderingContext) = this()
    def this(gl: stdLib.WebGLRenderingContext, state: pixiDotJsLib.PIXINs.WebGLState) = this()
  }
  
  def createContext(view: stdLib.HTMLCanvasElement): stdLib.WebGLRenderingContext = js.native
  def createContext(view: stdLib.HTMLCanvasElement, options: pixiDotJsLib.PIXINs.glCoreNs.ContextOptions): stdLib.WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: stdLib.WebGLRenderingContext, attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib]): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  def setVertexAttribArrays(
    gl: stdLib.WebGLRenderingContext,
    attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib],
    state: pixiDotJsLib.PIXINs.WebGLState
  ): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  @js.native
  object GLBuffer extends js.Object {
    def create(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: js.Any, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def create(
      gl: stdLib.WebGLRenderingContext,
      `type`: scala.Double,
      data: stdLib.ArrayBufferView,
      drawType: scala.Double
    ): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def create(
      gl: stdLib.WebGLRenderingContext,
      `type`: scala.Double,
      data: stdLib.ArrayBuffer,
      drawType: scala.Double
    ): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def createIndexBuffer(gl: stdLib.WebGLRenderingContext, data: js.Any, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def createIndexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBufferView, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def createIndexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBuffer, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def createVertexBuffer(gl: stdLib.WebGLRenderingContext, data: js.Any, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def createVertexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBufferView, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
    def createVertexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBuffer, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  }
  
  @js.native
  object GLFramebuffer extends js.Object {
    def createFloat32(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, data: js.Any): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
    def createFloat32(
      gl: stdLib.WebGLRenderingContext,
      width: scala.Double,
      height: scala.Double,
      data: stdLib.ArrayBuffer
    ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
    def createFloat32(
      gl: stdLib.WebGLRenderingContext,
      width: scala.Double,
      height: scala.Double,
      data: stdLib.ArrayBufferView
    ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
    def createRGBA(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, data: js.Any): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
    def createRGBA(
      gl: stdLib.WebGLRenderingContext,
      width: scala.Double,
      height: scala.Double,
      data: stdLib.ArrayBuffer
    ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
    def createRGBA(
      gl: stdLib.WebGLRenderingContext,
      width: scala.Double,
      height: scala.Double,
      data: stdLib.ArrayBufferView
    ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  }
  
  @js.native
  object GLTexture extends js.Object {
    def fromData(
      gl: stdLib.WebGLRenderingContext,
      data: js.Array[scala.Double],
      width: scala.Double,
      height: scala.Double
    ): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(
      gl: stdLib.WebGLRenderingContext,
      source: stdLib.HTMLCanvasElement,
      premultipleAlpha: scala.Boolean
    ): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLImageElement, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLVideoElement, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.ImageData): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
    def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.ImageData, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  }
  
  @js.native
  object VertexArrayObject extends js.Object {
    var FORCE_NATIVE: scala.Boolean = js.native
  }
  
}

