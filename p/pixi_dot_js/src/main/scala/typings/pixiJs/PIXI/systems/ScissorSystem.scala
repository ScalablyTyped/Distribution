package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.MaskData
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage scissor rects (used for masks).
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait ScissorSystem extends System {
  /**
    * Pops scissor mask. MaskData is already removed from stack
    */
  def pop(): Unit = js.native
  /**
    * Applies the Mask and adds it to the current stencil stack. @alvin
    *
    * @param {PIXI.MaskData} maskData - The mask data
    */
  def push(maskData: MaskData): Unit = js.native
}

object ScissorSystem {
  @scala.inline
  def apply(destroy: () => Unit, pop: () => Unit, push: MaskData => Unit, renderer: Renderer): ScissorSystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScissorSystem]
  }
  @scala.inline
  implicit class ScissorSystemOps[Self <: ScissorSystem] (val x: Self) extends AnyVal {
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
    def setPop(value: () => Unit): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: MaskData => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
  
}

