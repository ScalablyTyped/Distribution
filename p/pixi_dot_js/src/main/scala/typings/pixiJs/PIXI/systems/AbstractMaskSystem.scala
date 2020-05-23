package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.MaskData
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage masks of certain type
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
trait AbstractMaskSystem extends System {
  /**
    * The mask stack
    * @member {PIXI.MaskData[]} PIXI.systems.AbstractMaskSystem#maskStack
    */
  var maskStack: js.Array[MaskData]
  /**
    * gets count of masks of certain type
    * @returns {number}
    */
  def getStackLength(): Double
  /**
    * Changes the mask stack that is used by this System.
    *
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  def setMaskStack(maskStack: js.Array[MaskData]): Unit
}

object AbstractMaskSystem {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getStackLength: () => Double,
    maskStack: js.Array[MaskData],
    renderer: Renderer,
    setMaskStack: js.Array[MaskData] => Unit
  ): AbstractMaskSystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getStackLength = js.Any.fromFunction0(getStackLength), maskStack = maskStack.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setMaskStack = js.Any.fromFunction1(setMaskStack))
    __obj.asInstanceOf[AbstractMaskSystem]
  }
}

