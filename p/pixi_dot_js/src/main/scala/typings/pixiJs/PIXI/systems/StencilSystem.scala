package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.DisplayObject
import typings.pixiJs.PIXI.MaskData
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage stencils (used for masks).
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
trait StencilSystem extends System {
  /**
    * Pops stencil mask. MaskData is already removed from stack
    *
    * @param {PIXI.DisplayObject} maskObject - object of popped mask data
    */
  def pop(maskObject: DisplayObject): Unit
  /**
    * Applies the Mask and adds it to the current stencil stack.
    *
    * @param {PIXI.MaskData} maskData - The mask data
    */
  def push(maskData: MaskData): Unit
}

object StencilSystem {
  @scala.inline
  def apply(destroy: () => Unit, pop: DisplayObject => Unit, push: MaskData => Unit, renderer: Renderer): StencilSystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction1(push), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StencilSystem]
  }
}

