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
trait ScissorSystem extends System {
  /**
    * Pops scissor mask. MaskData is already removed from stack
    */
  def pop(): Unit
  /**
    * Applies the Mask and adds it to the current stencil stack. @alvin
    *
    * @param {PIXI.MaskData} maskData - The mask data
    */
  def push(maskData: MaskData): Unit
}

object ScissorSystem {
  @scala.inline
  def apply(destroy: () => Unit, pop: () => Unit, push: MaskData => Unit, renderer: Renderer): ScissorSystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScissorSystem]
  }
}

