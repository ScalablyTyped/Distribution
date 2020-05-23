package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.DisplayObject
import typings.pixiJs.PIXI.Filter
import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Quad
import typings.pixiJs.PIXI.QuadUv
import typings.pixiJs.PIXI.Rectangle
import typings.pixiJs.PIXI.RenderTexture
import typings.pixiJs.PIXI.Sprite
import typings.pixiJs.PIXI.System
import typings.pixiJs.PIXI.UniformGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage the filters.
  *
  * @class
  * @memberof PIXI.systems
  * @extends PIXI.System
  */
@js.native
trait FilterSystem extends System {
  /**
    * Active state
    * @member {object} PIXI.systems.FilterSystem#activeState
    */
  var activeState: js.Any = js.native
  /**
    * List of filters for the FilterSystem
    * @member {Object[]} PIXI.systems.FilterSystem#defaultFilterStack
    * @readonly
    */
  val defaultFilterStack: js.Array[_] = js.native
  /**
    * Whether to clear output renderTexture in AUTO/BLIT mode. See {@link PIXI.CLEAR_MODES}
    * @member {boolean} PIXI.systems.FilterSystem#forceClear
    */
  var forceClear: Boolean = js.native
  /**
    * This uniform group is attached to filter uniforms when used
    * @member {PIXI.UniformGroup} PIXI.systems.FilterSystem#globalUniforms
    * @property {PIXI.Rectangle} outputFrame
    * @property {Float32Array} inputSize
    * @property {Float32Array} inputPixel
    * @property {Float32Array} inputClamp
    * @property {Number} resolution
    * @property {Float32Array} filterArea
    * @property {Fload32Array} filterClamp
    */
  var globalUniforms: UniformGroup = js.native
  /**
    * A very simple geometry used when drawing a filter effect to the screen
    * @member {PIXI.Quad} PIXI.systems.FilterSystem#quad
    */
  var quad: Quad = js.native
  /**
    * Quad UVs
    * @member {PIXI.QuadUv} PIXI.systems.FilterSystem#quadUv
    */
  var quadUv: QuadUv = js.native
  /**
    * a pool for storing filter states, save us creating new ones each tick
    * @member {Object[]} PIXI.systems.FilterSystem#statePool
    */
  var statePool: js.Array[_] = js.native
  /**
    * Temporary rect for maths
    * @type {PIXI.Rectangle}
    */
  var tempRect: Rectangle = js.native
  /**
    * stores a bunch of PO2 textures used for filtering
    * @member {Object} PIXI.systems.FilterSystem#texturePool
    */
  var texturePool: js.Any = js.native
  /**
    * Old padding behavior is to use the max amount instead of sum padding.
    * Use this flag if you need the old behavior.
    * @member {boolean} PIXI.systems.FilterSystem#useMaxPadding
    * @default false
    */
  var useMaxPadding: Boolean = js.native
  /**
    * Draws a filter.
    *
    * @param {PIXI.Filter} filter - The filter to draw.
    * @param {PIXI.RenderTexture} input - The input render target.
    * @param {PIXI.RenderTexture} output - The target to output to.
    * @param {boolean} clear - Should the output be cleared before rendering to it
    */
  def applyFilter(filter: Filter, input: RenderTexture, output: RenderTexture, clear: Boolean): Unit = js.native
  /**
    * Multiply _input normalized coordinates_ to this matrix to get _sprite texture normalized coordinates_.
    *
    * Use `outputMatrix * vTextureCoord` in the shader.
    *
    * @param {PIXI.Matrix} outputMatrix - The matrix to output to.
    * @param {PIXI.Sprite} sprite - The sprite to map to.
    * @return {PIXI.Matrix} The mapped matrix.
    */
  def calculateSpriteMatrix(outputMatrix: Matrix, sprite: Sprite): Matrix = js.native
  /**
    * Empties the texture pool.
    */
  def emptyPool(): Unit = js.native
  /**
    * Gets extra render texture to use inside current filter
    * To be compliant with older filters, you can use params in any order
    *
    * @param {PIXI.RenderTexture} [input] renderTexture from which size and resolution will be copied
    * @param {number} [resolution] override resolution of the renderTexture
    * @returns {PIXI.RenderTexture}
    */
  def getFilterTexture(): RenderTexture = js.native
  def getFilterTexture(input: RenderTexture): RenderTexture = js.native
  def getFilterTexture(input: RenderTexture, resolution: Double): RenderTexture = js.native
  /**
    * Gets a Power-of-Two render texture or fullScreen texture
    *
    * @protected
    * @param {number} minWidth - The minimum width of the render texture in real pixels.
    * @param {number} minHeight - The minimum height of the render texture in real pixels.
    * @param {number} [resolution=1] - The resolution of the render texture.
    * @return {PIXI.RenderTexture} The new render texture.
    */
  /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double): RenderTexture = js.native
  /* protected */ def getOptimalFilterTexture(minWidth: Double, minHeight: Double, resolution: Double): RenderTexture = js.native
  /**
    * Pops off the filter and applies it.
    *
    */
  def pop(): Unit = js.native
  /**
    * Adds a new filter to the System.
    *
    * @param {PIXI.DisplayObject} target - The target of the filter to render.
    * @param {PIXI.Filter[]} filters - The filters to apply.
    */
  def push(target: DisplayObject, filters: js.Array[Filter]): Unit = js.native
  /**
    * calls `texturePool.resize()`, affects fullScreen renderTextures
    */
  def resize(): Unit = js.native
  /**
    * Frees a render texture back into the pool.
    *
    * @param {PIXI.RenderTexture} renderTexture - The renderTarget to free
    */
  def returnFilterTexture(renderTexture: RenderTexture): Unit = js.native
}

