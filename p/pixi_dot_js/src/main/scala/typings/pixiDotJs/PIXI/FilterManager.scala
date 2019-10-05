package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.glCore.GLShader
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.FilterManager")
@js.native
class FilterManager protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  var _screenHeight: Double = js.native
  var _screenWidth: Double = js.native
  var filterData: js.Any = js.native
  var gl: WebGLRenderingContext = js.native
  var quad: Quad = js.native
  var shaderCache: js.Any = js.native
  var stack: js.Array[FilterManagerStackItem] = js.native
  var stackIndex: Double = js.native
  def applyFilter(shader: Filter[_], inputTarget: RenderTarget, outputTarget: RenderTarget): Unit = js.native
  def applyFilter(shader: Filter[_], inputTarget: RenderTarget, outputTarget: RenderTarget, clear: Boolean): Unit = js.native
  def applyFilter(shader: GLShader, inputTarget: RenderTarget, outputTarget: RenderTarget): Unit = js.native
  def applyFilter(shader: GLShader, inputTarget: RenderTarget, outputTarget: RenderTarget, clear: Boolean): Unit = js.native
  def calculateNormalizedScreenSpaceMatrix(outputMatrix: Matrix): Matrix = js.native
  def calculateScreenSpaceMatrix(outputMatrix: Matrix): Matrix = js.native
  def calculateSpriteMatrix(outputMatrix: Matrix, sprite: Sprite): Matrix = js.native
  def destroy(contextLost: Boolean): Unit = js.native
  def emptyPool(): Unit = js.native
  def freePotRenderTarget(renderTarget: RenderTarget): Unit = js.native
  def getPotRenderTarget(gl: WebGLRenderingContext, minWidth: Double, minHeight: Double, resolution: Double): RenderTarget = js.native
  def getRenderTarget(): RenderTarget = js.native
  def getRenderTarget(clear: Boolean): RenderTarget = js.native
  def getRenderTarget(clear: Boolean, resolution: Double): RenderTarget = js.native
  def onPrerender(): Unit = js.native
  def popFilter(): Unit = js.native
  def pushFilter(target: RenderTarget, filters: js.Array[Filter[_]]): Unit = js.native
  def returnRenderTarget(renderTarget: RenderTarget): RenderTarget = js.native
  def syncUniforms(shader: GLShader, filter: Filter[_]): Unit = js.native
}

