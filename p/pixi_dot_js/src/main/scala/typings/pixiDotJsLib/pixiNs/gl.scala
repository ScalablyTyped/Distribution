package typings
package pixiDotJsLib.pixiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in glNs */
@JSGlobal("pixi.gl")
@js.native
object gl extends js.Object {
  var GLBuffer: pixiDotJsLib.TypeofClassGLBuffer = js.native
  var GLFramebuffer: pixiDotJsLib.TypeofClassGLFramebuffer = js.native
  var GLShader: org.scalablytyped.runtime.Instantiable5[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* vertexSrc */ java.lang.String | js.Array[java.lang.String], 
    /* fragmentSrc */ java.lang.String | js.Array[java.lang.String], 
    js.UndefOr[/* precision */ java.lang.String], 
    js.UndefOr[
      /* attributeLocations */ org.scalablytyped.runtime.StringDictionary[scala.Double]
    ], 
    pixiDotJsLib.PIXINs.glCoreNs.GLShader
  ] = js.native
  var GLTexture: pixiDotJsLib.TypeofClassGLTexture = js.native
  var VertexArrayObject: pixiDotJsLib.TypeofClassVertexArrayObject = js.native
  def createContext(view: stdLib.HTMLCanvasElement): stdLib.WebGLRenderingContext = js.native
  def createContext(view: stdLib.HTMLCanvasElement, options: pixiDotJsLib.PIXINs.glCoreNs.ContextOptions): stdLib.WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: stdLib.WebGLRenderingContext, attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib]): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  def setVertexAttribArrays(
    gl: stdLib.WebGLRenderingContext,
    attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib],
    state: pixiDotJsLib.PIXINs.WebGLState
  ): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
}

