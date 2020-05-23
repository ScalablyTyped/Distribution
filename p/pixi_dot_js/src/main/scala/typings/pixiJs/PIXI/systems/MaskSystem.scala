package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.DisplayObject
import typings.pixiJs.PIXI.Graphics
import typings.pixiJs.PIXI.MaskData
import typings.pixiJs.PIXI.Sprite
import typings.pixiJs.PIXI.SpriteMaskFilter
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage masks.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait MaskSystem extends System {
  /**
    * Current index of alpha mask pool
    * @member {number} PIXI.systems.MaskSystem#alphaMaskIndex
    * @default 0
    * @readonly
    */
  val alphaMaskIndex: Double = js.native
  /**
    * Pool of used sprite mask filters
    * @member {PIXI.SpriteMaskFilter[]} PIXI.systems.MaskSystem#alphaMaskPool
    * @readonly
    */
  val alphaMaskPool: js.Array[SpriteMaskFilter] = js.native
  /**
    * Enable scissor
    * @member {boolean} PIXI.systems.MaskSystem#enableScissor
    * @readonly
    */
  val enableScissor: Boolean = js.native
  /**
    * Pool of mask data
    * @member {PIXI.MaskData[]} PIXI.systems.MaskSystem#maskDataPool
    * @readonly
    */
  val maskDataPool: js.Array[MaskData] = js.native
  /**
    * Target to mask
    * @member {PIXI.DisplayObject} PIXI.systems.MaskSystem#scissorRenderTarget
    * @readonly
    */
  val scissorRenderTarget: DisplayObject = js.native
  /**
    * Sets type of MaskData based on its maskObject
    * @param {PIXI.MaskData} maskData
    */
  def detect(maskData: MaskData): Unit = js.native
  /**
    * Removes the last mask from the mask stack and doesn't return it.
    * Renderer batch must be flushed beforehand.
    *
    * @param {PIXI.DisplayObject} target - Display Object to pop the mask from
    */
  def pop(target: DisplayObject): Unit = js.native
  /**
    * Removes the last filter from the filter stack and doesn't return it.
    */
  def popSpriteMask(): Unit = js.native
  def push(target: DisplayObject, maskData: DisplayObject): Unit = js.native
  def push(target: DisplayObject, maskData: Graphics): Unit = js.native
  /**
    * Applies the Mask and adds it to the current filter stack.
    * Renderer batch must be flushed beforehand.
    *
    * @param {PIXI.DisplayObject} target - Display Object to push the mask to
    * @param {PIXI.MaskData|PIXI.Sprite|PIXI.Graphics|PIXI.DisplayObject} maskData - The masking data.
    */
  def push(target: DisplayObject, maskData: MaskData): Unit = js.native
  def push(target: DisplayObject, maskData: Sprite): Unit = js.native
  /**
    * Applies the Mask and adds it to the current filter stack.
    *
    * @param {PIXI.MaskData} maskData - Sprite to be used as the mask
    */
  def pushSpriteMask(maskData: MaskData): Unit = js.native
  /**
    * Changes the mask stack that is used by this System.
    *
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
}

