package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_VertexArrayObject extends js.Object {
  var GLBuffer: ScalablyTyped.runtime.Instantiable4[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* type */ scala.Double, 
    /* data */ stdLib.ArrayBuffer | stdLib.ArrayBufferView | js.Any, 
    /* drawType */ scala.Double, 
    pixiDotJsLib.PIXINs.glCoreNs.GLBuffer
  ] = js.native
  var GLFramebuffer: ScalablyTyped.runtime.Instantiable3[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer
  ] = js.native
  var GLShader: ScalablyTyped.runtime.Instantiable5[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* vertexSrc */ java.lang.String | js.Array[java.lang.String], 
    /* fragmentSrc */ java.lang.String | js.Array[java.lang.String], 
    /* precision */ js.UndefOr[/* precision */ java.lang.String], 
    /* attributeLocations */ js.UndefOr[/* attributeLocations */ ScalablyTyped.runtime.StringDictionary[scala.Double]], 
    pixiDotJsLib.PIXINs.glCoreNs.GLShader
  ] = js.native
  var GLTexture: ScalablyTyped.runtime.Instantiable5[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* width */ js.UndefOr[/* width */ scala.Double], 
    /* height */ js.UndefOr[/* height */ scala.Double], 
    /* format */ js.UndefOr[/* format */ scala.Double], 
    /* type */ js.UndefOr[/* type */ scala.Double], 
    pixiDotJsLib.PIXINs.glCoreNs.GLTexture
  ] = js.native
  var VertexArrayObject: ScalablyTyped.runtime.Instantiable2[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* state */ js.UndefOr[/* state */ pixiDotJsLib.PIXINs.WebGLState], 
    pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject
  ] = js.native
  def createContext(view: stdLib.HTMLCanvasElement): stdLib.WebGLRenderingContext = js.native
  def createContext(view: stdLib.HTMLCanvasElement, options: pixiDotJsLib.PIXINs.glCoreNs.ContextOptions): stdLib.WebGLRenderingContext = js.native
  def setVertexAttribArrays(gl: stdLib.WebGLRenderingContext, attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib]): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  def setVertexAttribArrays(
    gl: stdLib.WebGLRenderingContext,
    attribs: js.Array[pixiDotJsLib.PIXINs.glCoreNs.Attrib],
    state: pixiDotJsLib.PIXINs.WebGLState
  ): js.UndefOr[stdLib.WebGLRenderingContext] = js.native
}

