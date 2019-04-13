package typings
package pixiDotJsLib.pixiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in glNs */
@JSGlobal("pixi.gl")
@js.native
object gl extends js.Object {
  var GLBuffer: pixiDotJsLib.Anon_Create = js.native
  var GLFramebuffer: pixiDotJsLib.Anon_CreateFloat32 = js.native
  var GLShader: org.scalablytyped.runtime.Instantiable5[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* vertexSrc */ java.lang.String | js.Array[java.lang.String], 
    /* fragmentSrc */ java.lang.String | js.Array[java.lang.String], 
    /* precision */ js.UndefOr[/* precision */ java.lang.String], 
    /* attributeLocations */ js.UndefOr[
      /* attributeLocations */ org.scalablytyped.runtime.StringDictionary[scala.Double]
    ], 
    pixiDotJsLib.PIXINs.glCoreNs.GLShader
  ] = js.native
  var GLTexture: pixiDotJsLib.Anon_Data = js.native
  var VertexArrayObject: pixiDotJsLib.Anon_FORCENATIVE = js.native
  def createContext(view: stdLib.HTMLCanvasElement): stdLib.WebGLRenderingContext = js.native
  def createContext(view: stdLib.HTMLCanvasElement, options: pixiDotJsLib.PIXINs.glCoreNs.ContextOptions): stdLib.WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: stdLib.WebGLRenderingContext, attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib]): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  def setVertexAttribArrays(
    gl: stdLib.WebGLRenderingContext,
    attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib],
    state: pixiDotJsLib.PIXINs.WebGLState
  ): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
}

