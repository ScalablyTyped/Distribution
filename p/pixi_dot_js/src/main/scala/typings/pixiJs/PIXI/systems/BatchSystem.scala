package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.BatchTextureArray
import typings.pixiJs.PIXI.ObjectRenderer
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage batching.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait BatchSystem extends System {
  /**
    * The currently active ObjectRenderer.
    *
    * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#currentRenderer
    */
  var currentRenderer: ObjectRenderer = js.native
  /**
    * An empty renderer.
    *
    * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#emptyRenderer
    */
  var emptyRenderer: ObjectRenderer = js.native
  /**
    * Assigns batch locations to textures in array based on boundTextures state.
    * All textures in texArray should have `_batchEnabled = _batchId`,
    * and their count should be less than `maxTextures`.
    *
    * @param {PIXI.BatchTextureArray} texArray - textures to bound
    * @param {PIXI.BaseTexture[]} boundTextures - current state of bound textures
    * @param {number} batchId - marker for _batchEnabled param of textures in texArray
    * @param {number} maxTextures - number of texture locations to manipulate
    */
  def boundArray(
    texArray: BatchTextureArray,
    boundTextures: js.Array[BaseTexture],
    batchId: Double,
    maxTextures: Double
  ): Unit = js.native
  /**
    * Handy function for batch renderers: copies bound textures in first maxTextures locations to array
    * sets actual _batchLocation for them
    *
    * @param {PIXI.BaseTexture[]} - arr copy destination
    * @param {number} maxTextures - number of copied elements
    */
  def copyBoundTextures(arr: js.Array[BaseTexture], maxTextures: Double): Unit = js.native
  /**
    * This should be called if you wish to do some custom rendering
    * It will basically render anything that may be batched up such as sprites
    */
  def flush(): Unit = js.native
  /**
    * Reset the system to an empty renderer
    */
  def reset(): Unit = js.native
  /**
    * Changes the current renderer to the one given in parameter
    *
    * @param {PIXI.ObjectRenderer} objectRenderer - The object renderer to use.
    */
  def setObjectRenderer(objectRenderer: ObjectRenderer): Unit = js.native
}

object BatchSystem {
  @scala.inline
  def apply(
    boundArray: (BatchTextureArray, js.Array[BaseTexture], Double, Double) => Unit,
    copyBoundTextures: (js.Array[BaseTexture], Double) => Unit,
    currentRenderer: ObjectRenderer,
    destroy: () => Unit,
    emptyRenderer: ObjectRenderer,
    flush: () => Unit,
    renderer: Renderer,
    reset: () => Unit,
    setObjectRenderer: ObjectRenderer => Unit
  ): BatchSystem = {
    val __obj = js.Dynamic.literal(boundArray = js.Any.fromFunction4(boundArray), copyBoundTextures = js.Any.fromFunction2(copyBoundTextures), currentRenderer = currentRenderer.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), emptyRenderer = emptyRenderer.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), renderer = renderer.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setObjectRenderer = js.Any.fromFunction1(setObjectRenderer))
    __obj.asInstanceOf[BatchSystem]
  }
  @scala.inline
  implicit class BatchSystemOps[Self <: BatchSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoundArray(value: (BatchTextureArray, js.Array[BaseTexture], Double, Double) => Unit): Self = this.set("boundArray", js.Any.fromFunction4(value))
    @scala.inline
    def setCopyBoundTextures(value: (js.Array[BaseTexture], Double) => Unit): Self = this.set("copyBoundTextures", js.Any.fromFunction2(value))
    @scala.inline
    def setCurrentRenderer(value: ObjectRenderer): Self = this.set("currentRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyRenderer(value: ObjectRenderer): Self = this.set("emptyRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSetObjectRenderer(value: ObjectRenderer => Unit): Self = this.set("setObjectRenderer", js.Any.fromFunction1(value))
  }
  
}

