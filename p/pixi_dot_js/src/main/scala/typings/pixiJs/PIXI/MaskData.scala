package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component for masked elements
  *
  * Holds mask mode and temporary data about current mask
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait MaskData extends StObject {
  
  /**
    * Scissor operation above the mask in stack.
    * Null if _scissorCounter is zero, rectangle instance if positive.
    * @member {PIXI.Rectangle} PIXI.MaskData#_scissorRect
    */
  var _scissorRect: Rectangle = js.native
  
  /**
    * Whether we know the mask type beforehand
    * @member {boolean} PIXI.MaskData#autoDetect
    * @default true
    */
  var autoDetect: Boolean = js.native
  
  /**
    * copies counters from maskData above, called from pushMask()
    * @param {PIXI.MaskData|null} maskAbove
    */
  def copyCountersOrReset(): Unit = js.native
  def copyCountersOrReset(maskAbove: MaskData): Unit = js.native
  
  /**
    * Indicator of the type
    * @member {boolean} PIXI.MaskData#isMaskData
    */
  var isMaskData: Boolean = js.native
  
  /**
    * Which element we use to mask
    * @member {PIXI.DisplayObject} PIXI.MaskData#maskObject
    */
  var maskObject: DisplayObject = js.native
  
  /**
    * Whether it belongs to MaskSystem pool
    * @member {boolean} PIXI.MaskData#pooled
    */
  var pooled: Boolean = js.native
  
  /**
    * resets the mask data after popMask()
    */
  def reset(): Unit = js.native
  
  /**
    * Mask type
    * @member {PIXI.MASK_TYPES} PIXI.MaskData#type
    */
  var `type`: MASK_TYPES = js.native
}
