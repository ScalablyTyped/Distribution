package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.FilterManager")
@js.native
class FilterManager protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  var _screenHeight: scala.Double = js.native
  var _screenWidth: scala.Double = js.native
  var filterData: js.Any = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var quad: Quad = js.native
  var shaderCache: js.Any = js.native
  var stack: js.Array[FilterManagerStackItem] = js.native
  var stackIndex: scala.Double = js.native
  def applyFilter(shader: Filter[_], inputTarget: RenderTarget, outputTarget: RenderTarget): scala.Unit = js.native
  def applyFilter(shader: Filter[_], inputTarget: RenderTarget, outputTarget: RenderTarget, clear: scala.Boolean): scala.Unit = js.native
  def applyFilter(
    shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader,
    inputTarget: RenderTarget,
    outputTarget: RenderTarget
  ): scala.Unit = js.native
  def applyFilter(
    shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader,
    inputTarget: RenderTarget,
    outputTarget: RenderTarget,
    clear: scala.Boolean
  ): scala.Unit = js.native
  def calculateNormalizedScreenSpaceMatrix(outputMatrix: Matrix): Matrix = js.native
  def calculateScreenSpaceMatrix(outputMatrix: Matrix): Matrix = js.native
  def calculateSpriteMatrix(outputMatrix: Matrix, sprite: Sprite): Matrix = js.native
  def destroy(contextLost: scala.Boolean): scala.Unit = js.native
  def emptyPool(): scala.Unit = js.native
  def freePotRenderTarget(renderTarget: RenderTarget): scala.Unit = js.native
  def getPotRenderTarget(
    gl: stdLib.WebGLRenderingContext,
    minWidth: scala.Double,
    minHeight: scala.Double,
    resolution: scala.Double
  ): RenderTarget = js.native
  def getRenderTarget(): RenderTarget = js.native
  def getRenderTarget(clear: scala.Boolean): RenderTarget = js.native
  def getRenderTarget(clear: scala.Boolean, resolution: scala.Double): RenderTarget = js.native
  def onPrerender(): scala.Unit = js.native
  def popFilter(): scala.Unit = js.native
  def pushFilter(target: RenderTarget, filters: js.Array[Filter[_]]): scala.Unit = js.native
  def returnRenderTarget(renderTarget: RenderTarget): RenderTarget = js.native
  def syncUniforms(shader: pixiDotJsLib.PIXINs.glCoreNs.GLShader, filter: Filter[_]): scala.Unit = js.native
}

