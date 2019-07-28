package typings.pixiDotJs.PIXINs.glCoreNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLShader")
@js.native
class GLShader protected () extends js.Object {
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
  var attributes: js.Any = js.native
  var gl: WebGLRenderingContext = js.native
  var program: js.UndefOr[WebGLProgram | Null] = js.native
  var uniformData: js.Any = js.native
  var uniforms: js.Any = js.native
  def bind(): this.type = js.native
  def destroy(): Unit = js.native
}

