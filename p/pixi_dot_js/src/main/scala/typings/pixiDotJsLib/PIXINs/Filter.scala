package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Filter")
@js.native
class Filter[U /* <: js.Object */] () extends js.Object {
  def this(vertexSrc: java.lang.String) = this()
  def this(vertexSrc: java.lang.String, fragmentSrc: java.lang.String) = this()
  def this(vertexSrc: java.lang.String, fragmentSrc: java.lang.String, uniforms: UniformDataMap[U]) = this()
  var _blendMode: scala.Double = js.native
  var autoFit: scala.Boolean = js.native
  var blendMode: scala.Double = js.native
  var enabled: scala.Boolean = js.native
  var fragmentSrc: java.lang.String = js.native
  var glShaderKey: js.UndefOr[scala.Double] = js.native
  var glShaders: js.Any = js.native
  var padding: scala.Double = js.native
  var resolution: scala.Double = js.native
  var uniformData: UniformDataMap[U] = js.native
  var uniforms: U = js.native
  var vertexSrc: js.UndefOr[java.lang.String] = js.native
  @JSName("apply")
  def apply(filterManager: FilterManager, input: RenderTarget, output: RenderTarget): scala.Unit = js.native
  @JSName("apply")
  def apply(filterManager: FilterManager, input: RenderTarget, output: RenderTarget, clear: scala.Boolean): scala.Unit = js.native
  @JSName("apply")
  def apply(
    filterManager: FilterManager,
    input: RenderTarget,
    output: RenderTarget,
    clear: scala.Boolean,
    currentState: js.Any
  ): scala.Unit = js.native
}

@JSGlobal("PIXI.Filter")
@js.native
object Filter extends js.Object {
  var defaultFragmentSrc: java.lang.String = js.native
  var defaultVertexSrc: java.lang.String = js.native
}

