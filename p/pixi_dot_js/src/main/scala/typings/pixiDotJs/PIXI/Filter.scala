package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Filter")
@js.native
class Filter[U /* <: js.Object */] () extends js.Object {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, uniformData: UniformDataMap[U]) = this()
  var _blendMode: Double = js.native
  var autoFit: Boolean = js.native
  var blendMode: Double = js.native
  var enabled: Boolean = js.native
  var fragmentSrc: String = js.native
  var glShaderKey: js.UndefOr[Double] = js.native
  var glShaders: js.Any = js.native
  var padding: Double = js.native
  var resolution: Double = js.native
  var uniformData: UniformDataMap[U] = js.native
  var uniforms: U = js.native
  var vertexSrc: js.UndefOr[String] = js.native
  @JSName("apply")
  def apply(filterManager: FilterManager, input: RenderTarget, output: RenderTarget): Unit = js.native
  @JSName("apply")
  def apply(filterManager: FilterManager, input: RenderTarget, output: RenderTarget, clear: Boolean): Unit = js.native
  @JSName("apply")
  def apply(
    filterManager: FilterManager,
    input: RenderTarget,
    output: RenderTarget,
    clear: Boolean,
    currentState: js.Any
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Filter")
@js.native
object Filter extends js.Object {
  var defaultFragmentSrc: String = js.native
  var defaultVertexSrc: String = js.native
}

