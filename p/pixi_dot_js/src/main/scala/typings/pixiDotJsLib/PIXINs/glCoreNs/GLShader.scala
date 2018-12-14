package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLShader")
@js.native
class GLShader protected () extends js.Object {
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
  var attributes: js.Any = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var program: js.UndefOr[stdLib.WebGLProgram | scala.Null] = js.native
  var uniformData: js.Any = js.native
  var uniforms: js.Any = js.native
  def bind(): this.type = js.native
  def destroy(): scala.Unit = js.native
}

