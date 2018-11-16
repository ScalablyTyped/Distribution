package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Filter")
@js.native
class Filter[U /* <: js.Object */] ()
  extends pixiDotJsLib.PIXINs.Filter[U] {
  def this(vertexSrc: java.lang.String) = this()
  def this(vertexSrc: java.lang.String, fragmentSrc: java.lang.String) = this()
  def this(vertexSrc: java.lang.String, fragmentSrc: java.lang.String, uniforms: pixiDotJsLib.PIXINs.UniformDataMap[U]) = this()
}

@JSImport("pixi.js", "Filter")
@js.native
object Filter extends js.Object {
  var defaultFragmentSrc: java.lang.String = js.native
  var defaultVertexSrc: java.lang.String = js.native
}

