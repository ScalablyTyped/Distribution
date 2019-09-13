package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shader
/**
  * Wrapper class, webGL Shader for Pixi.
  * Adds precision string if vertexSrc or fragmentSrc have no mention of it.
  */
@JSImport("pixi.js", "Shader")
@js.native
class Shader protected ()
  extends typings.pixiDotJs.PIXINs.Shader {
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

