package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXINs.glCoreNs.GLShader
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shader
/**
  * Wrapper class, webGL Shader for Pixi.
  * Adds precision string if vertexSrc or fragmentSrc have no mention of it.
  */
@JSGlobal("PIXI.Shader")
@js.native
class Shader protected () extends GLShader {
  def this(gl: WebGLRenderingContext, vertexSrc: String, fragmentSrc: String) = this()
  def this(gl: WebGLRenderingContext, vertexSrc: String, fragmentSrc: js.Array[String]) = this()
  def this(gl: WebGLRenderingContext, vertexSrc: js.Array[String], fragmentSrc: String) = this()
  def this(gl: WebGLRenderingContext, vertexSrc: js.Array[String], fragmentSrc: js.Array[String]) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: String,
    fragmentSrc: String,
    attributeLocations: StringDictionary[Double]
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: String,
    fragmentSrc: js.Array[String],
    attributeLocations: StringDictionary[Double]
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: js.Array[String],
    fragmentSrc: String,
    attributeLocations: StringDictionary[Double]
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: js.Array[String],
    fragmentSrc: js.Array[String],
    attributeLocations: StringDictionary[Double]
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: String,
    fragmentSrc: String,
    attributeLocations: StringDictionary[Double],
    precision: String
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: String,
    fragmentSrc: js.Array[String],
    attributeLocations: StringDictionary[Double],
    precision: String
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: js.Array[String],
    fragmentSrc: String,
    attributeLocations: StringDictionary[Double],
    precision: String
  ) = this()
  def this(
    gl: WebGLRenderingContext,
    vertexSrc: js.Array[String],
    fragmentSrc: js.Array[String],
    attributeLocations: StringDictionary[Double],
    precision: String
  ) = this()
}

