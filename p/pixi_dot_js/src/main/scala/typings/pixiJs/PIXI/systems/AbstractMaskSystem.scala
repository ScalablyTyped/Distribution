package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.MaskData
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage masks of certain type
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait AbstractMaskSystem extends System {
  
  /**
    * gets count of masks of certain type
    * @returns {number}
    */
  def getStackLength(): Double = js.native
  
  /**
    * The mask stack
    * @member {PIXI.MaskData[]} PIXI.systems.AbstractMaskSystem#maskStack
    */
  var maskStack: js.Array[MaskData] = js.native
  
  /**
    * Changes the mask stack that is used by this System.
    *
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
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
  
  @scala.inline
  implicit class AbstractMaskSystemOps[Self <: AbstractMaskSystem] (val x: Self) extends AnyVal {
    
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
    def setGetStackLength(value: () => Double): Self = this.set("getStackLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaskStackVarargs(value: MaskData*): Self = this.set("maskStack", js.Array(value :_*))
    
    @scala.inline
    def setMaskStack(value: js.Array[MaskData]): Self = this.set("maskStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMaskStack(value: js.Array[MaskData] => Unit): Self = this.set("setMaskStack", js.Any.fromFunction1(value))
  }
}
