package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXI.glCore.Attrib
import typings.pixiDotJs.PIXI.glCore.ContextOptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.WebGLRenderingContext
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
object glCore extends js.Object {
  @js.native
  class GLBuffer protected ()
    extends typings.pixiDotJs.PIXI.glCore.GLBuffer {
    def this(gl: WebGLRenderingContext, `type`: Double, data: js.Any, drawType: Double) = this()
    def this(gl: WebGLRenderingContext, `type`: Double, data: ArrayBufferView, drawType: Double) = this()
    def this(gl: WebGLRenderingContext, `type`: Double, data: ArrayBuffer, drawType: Double) = this()
  }
  
  @js.native
  class GLFramebuffer protected ()
    extends typings.pixiDotJs.PIXI.glCore.GLFramebuffer {
    def this(gl: WebGLRenderingContext, width: Double, height: Double) = this()
  }
  
  @js.native
  class GLShader protected ()
    extends typings.pixiDotJs.PIXI.glCore.GLShader {
    def this(gl: WebGLRenderingContext, vertexSrc: String, fragmentSrc: String) = this()
    def this(gl: WebGLRenderingContext, vertexSrc: String, fragmentSrc: js.Array[String]) = this()
    def this(gl: WebGLRenderingContext, vertexSrc: js.Array[String], fragmentSrc: String) = this()
    def this(gl: WebGLRenderingContext, vertexSrc: js.Array[String], fragmentSrc: js.Array[String]) = this()
    def this(gl: WebGLRenderingContext, vertexSrc: String, fragmentSrc: String, precision: String) = this()
    def this(gl: WebGLRenderingContext, vertexSrc: String, fragmentSrc: js.Array[String], precision: String) = this()
    def this(gl: WebGLRenderingContext, vertexSrc: js.Array[String], fragmentSrc: String, precision: String) = this()
    def this(
      gl: WebGLRenderingContext,
      vertexSrc: js.Array[String],
      fragmentSrc: js.Array[String],
      precision: String
    ) = this()
    def this(
      gl: WebGLRenderingContext,
      vertexSrc: String,
      fragmentSrc: String,
      precision: String,
      attributeLocations: StringDictionary[Double]
    ) = this()
    def this(
      gl: WebGLRenderingContext,
      vertexSrc: String,
      fragmentSrc: js.Array[String],
      precision: String,
      attributeLocations: StringDictionary[Double]
    ) = this()
    def this(
      gl: WebGLRenderingContext,
      vertexSrc: js.Array[String],
      fragmentSrc: String,
      precision: String,
      attributeLocations: StringDictionary[Double]
    ) = this()
    def this(
      gl: WebGLRenderingContext,
      vertexSrc: js.Array[String],
      fragmentSrc: js.Array[String],
      precision: String,
      attributeLocations: StringDictionary[Double]
    ) = this()
  }
  
  @js.native
  class GLTexture protected ()
    extends typings.pixiDotJs.PIXI.glCore.GLTexture {
    def this(gl: WebGLRenderingContext) = this()
    def this(gl: WebGLRenderingContext, width: Double) = this()
    def this(gl: WebGLRenderingContext, width: Double, height: Double) = this()
    def this(gl: WebGLRenderingContext, width: Double, height: Double, format: Double) = this()
    def this(gl: WebGLRenderingContext, width: Double, height: Double, format: Double, `type`: Double) = this()
  }
  
  @js.native
  class VertexArrayObject protected ()
    extends typings.pixiDotJs.PIXI.glCore.VertexArrayObject {
    def this(gl: WebGLRenderingContext) = this()
    def this(gl: WebGLRenderingContext, state: typings.pixiDotJs.PIXI.WebGLState) = this()
  }
  
  def createContext(view: HTMLCanvasElement): WebGLRenderingContext = js.native
  def createContext(view: HTMLCanvasElement, options: ContextOptions): WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib]): js.UndefOr[WebGLRenderingContext] = js.native
  def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib], state: typings.pixiDotJs.PIXI.WebGLState): js.UndefOr[WebGLRenderingContext] = js.native
  /* static members */
  @js.native
  object GLBuffer extends js.Object {
    def create(gl: WebGLRenderingContext, `type`: Double, data: js.Any, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def create(gl: WebGLRenderingContext, `type`: Double, data: ArrayBufferView, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def create(gl: WebGLRenderingContext, `type`: Double, data: ArrayBuffer, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def createIndexBuffer(gl: WebGLRenderingContext, data: js.Any, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def createIndexBuffer(gl: WebGLRenderingContext, data: ArrayBufferView, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def createIndexBuffer(gl: WebGLRenderingContext, data: ArrayBuffer, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def createVertexBuffer(gl: WebGLRenderingContext, data: js.Any, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def createVertexBuffer(gl: WebGLRenderingContext, data: ArrayBufferView, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
    def createVertexBuffer(gl: WebGLRenderingContext, data: ArrayBuffer, drawType: Double): typings.pixiDotJs.PIXI.glCore.GLBuffer = js.native
  }
  
  /* static members */
  @js.native
  object GLFramebuffer extends js.Object {
    def createFloat32(gl: WebGLRenderingContext, width: Double, height: Double, data: js.Any): typings.pixiDotJs.PIXI.glCore.GLFramebuffer = js.native
    def createFloat32(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBuffer): typings.pixiDotJs.PIXI.glCore.GLFramebuffer = js.native
    def createFloat32(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBufferView): typings.pixiDotJs.PIXI.glCore.GLFramebuffer = js.native
    def createRGBA(gl: WebGLRenderingContext, width: Double, height: Double, data: js.Any): typings.pixiDotJs.PIXI.glCore.GLFramebuffer = js.native
    def createRGBA(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBuffer): typings.pixiDotJs.PIXI.glCore.GLFramebuffer = js.native
    def createRGBA(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBufferView): typings.pixiDotJs.PIXI.glCore.GLFramebuffer = js.native
  }
  
  /* static members */
  @js.native
  object GLTexture extends js.Object {
    def fromData(gl: WebGLRenderingContext, data: js.Array[Double], width: Double, height: Double): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: HTMLCanvasElement): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: HTMLCanvasElement, premultipleAlpha: Boolean): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: HTMLImageElement): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: HTMLImageElement, premultipleAlpha: Boolean): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: HTMLVideoElement): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: HTMLVideoElement, premultipleAlpha: Boolean): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: ImageData): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
    def fromSource(gl: WebGLRenderingContext, source: ImageData, premultipleAlpha: Boolean): typings.pixiDotJs.PIXI.glCore.GLTexture = js.native
  }
  
  /* static members */
  @js.native
  object VertexArrayObject extends js.Object {
    var FORCE_NATIVE: Boolean = js.native
  }
  
}

