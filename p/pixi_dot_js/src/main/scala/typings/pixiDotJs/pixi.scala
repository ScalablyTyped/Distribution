package typings.pixiDotJs

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXI.WebGLState
import typings.pixiDotJs.PIXI.glCore.Attrib
import typings.pixiDotJs.PIXI.glCore.ContextOptions
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pixi")
@js.native
object pixi extends js.Object {
  @js.native
  object gl extends js.Object {
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
    
    var GLBuffer: TypeofClassGLBuffer = js.native
    var GLFramebuffer: TypeofClassGLFramebuffer = js.native
    var GLShader: Instantiable5[
        /* gl */ WebGLRenderingContext, 
        /* vertexSrc */ String | js.Array[String], 
        /* fragmentSrc */ String | js.Array[String], 
        js.UndefOr[/* precision */ String], 
        js.UndefOr[/* attributeLocations */ StringDictionary[Double]], 
        typings.pixiDotJs.PIXI.glCore.GLShader
      ] = js.native
    var GLTexture: TypeofClassGLTexture = js.native
    var VertexArrayObject: TypeofClassVertexArrayObject = js.native
    def createContext(view: HTMLCanvasElement): WebGLRenderingContext = js.native
    def createContext(view: HTMLCanvasElement, options: ContextOptions): WebGLRenderingContext = js.native
    def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib]): js.UndefOr[WebGLRenderingContext] = js.native
    def setVertexAttribArrays(gl: WebGLRenderingContext, attribs: js.Array[Attrib], state: WebGLState): js.UndefOr[WebGLRenderingContext] = js.native
  }
  
}

