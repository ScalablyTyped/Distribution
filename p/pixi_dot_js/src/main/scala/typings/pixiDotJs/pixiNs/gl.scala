package typings.pixiDotJs.pixiNs

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXINs.WebGLState
import typings.pixiDotJs.PIXINs.glCoreNs.Attrib
import typings.pixiDotJs.PIXINs.glCoreNs.ContextOptions
import typings.pixiDotJs.TypeofClassGLBuffer
import typings.pixiDotJs.TypeofClassGLFramebuffer
import typings.pixiDotJs.TypeofClassGLTexture
import typings.pixiDotJs.TypeofClassVertexArrayObject
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in glNs */
@JSGlobal("pixi.gl")
@js.native
object gl extends js.Object {
  var GLBuffer: TypeofClassGLBuffer = js.native
  var GLFramebuffer: TypeofClassGLFramebuffer = js.native
  var GLShader: Instantiable5[
    /* gl */ WebGLRenderingContext, 
    /* vertexSrc */ String | js.Array[String], 
    /* fragmentSrc */ String | js.Array[String], 
    js.UndefOr[/* precision */ String], 
    js.UndefOr[/* attributeLocations */ StringDictionary[Double]], 
    typings.pixiDotJs.PIXINs.glCoreNs.GLShader
  ] = js.native
  var GLTexture: TypeofClassGLTexture = js.native
  var VertexArrayObject: TypeofClassVertexArrayObject = js.native
  def createContext(view: HTMLCanvasElement): WebGLRenderingContext = js.native
  def createContext(view: HTMLCanvasElement, options: ContextOptions): WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib]): js.UndefOr[WebGLRenderingContext] = js.native
  def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib], state: WebGLState): js.UndefOr[WebGLRenderingContext] = js.native
}

