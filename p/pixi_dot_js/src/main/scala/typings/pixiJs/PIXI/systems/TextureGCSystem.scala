package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.DisplayObject
import typings.pixiJs.PIXI.GC_MODES
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage texture garbage collection on the GPU,
  * ensuring that it does not get clogged up with textures that are no longer being used.
  *
  * @class
  * @memberof PIXI.systems
  * @extends PIXI.System
  */
@js.native
trait TextureGCSystem extends System {
  /**
    * Check count
    * @member {number} PIXI.systems.TextureGCSystem#checkCount
    * @readonly
    */
  val checkCount: Double = js.native
  /**
    * Maximum number of item to check
    * @member {number} PIXI.systems.TextureGCSystem#checkCountMax
    * @see PIXI.settings.GC_MAX_CHECK_COUNT
    */
  var checkCountMax: Double = js.native
  /**
    * Count
    * @member {number} PIXI.systems.TextureGCSystem#count
    * @readonly
    */
  val count: Double = js.native
  /**
    * Maximum idle time, in seconds
    * @member {number} PIXI.systems.TextureGCSystem#maxIdle
    * @see PIXI.settings.GC_MAX_IDLE
    */
  var maxIdle: Double = js.native
  /**
    * Current garabage collection mode
    * @member {PIXI.GC_MODES} PIXI.systems.TextureGCSystem#mode
    * @see PIXI.settings.GC_MODE
    */
  var mode: GC_MODES = js.native
  /**
    * Checks to see when the last time a texture was used
    * if the texture has not been used for a specified amount of time it will be removed from the GPU
    */
  def postrender(): Unit = js.native
  /**
    * Checks to see when the last time a texture was used
    * if the texture has not been used for a specified amount of time it will be removed from the GPU
    */
  def run(): Unit = js.native
  /**
    * Removes all the textures within the specified displayObject and its children from the GPU
    *
    * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
    */
  def unload(displayObject: DisplayObject): Unit = js.native
}

object TextureGCSystem {
  @scala.inline
  def apply(
    checkCount: Double,
    checkCountMax: Double,
    count: Double,
    destroy: () => Unit,
    maxIdle: Double,
    mode: GC_MODES,
    postrender: () => Unit,
    renderer: Renderer,
    run: () => Unit,
    unload: DisplayObject => Unit
  ): TextureGCSystem = {
    val __obj = js.Dynamic.literal(checkCount = checkCount.asInstanceOf[js.Any], checkCountMax = checkCountMax.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), maxIdle = maxIdle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], postrender = js.Any.fromFunction0(postrender), renderer = renderer.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), unload = js.Any.fromFunction1(unload))
    __obj.asInstanceOf[TextureGCSystem]
  }
  @scala.inline
  implicit class TextureGCSystemOps[Self <: TextureGCSystem] (val x: Self) extends AnyVal {
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
    def setCheckCount(value: Double): Self = this.set("checkCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckCountMax(value: Double): Self = this.set("checkCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxIdle(value: Double): Self = this.set("maxIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: GC_MODES): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostrender(value: () => Unit): Self = this.set("postrender", js.Any.fromFunction0(value))
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def setUnload(value: DisplayObject => Unit): Self = this.set("unload", js.Any.fromFunction1(value))
  }
  
}

