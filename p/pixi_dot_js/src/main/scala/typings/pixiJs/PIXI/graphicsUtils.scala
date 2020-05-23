package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generalized convenience utilities for Graphics.
  *
  * @namespace PIXI.graphicsUtils
  */
@JSGlobal("PIXI.graphicsUtils")
@js.native
object graphicsUtils extends js.Object {
  /**
    * A structure to hold interim batch objects for Graphics.
    * @class
    * @memberof PIXI.graphicsUtils
    */
  @js.native
  trait BatchPart extends js.Object {
    /**
      * Begin batch part
      *
      * @param {PIXI.FillStyle | PIXI.LineStyle} style
      * @param {number} startIndex
      * @param {number} attribStart
      */
    def begin(style: FillStyle, startIndex: Double, attribStart: Double): Unit = js.native
    def begin(style: LineStyle, startIndex: Double, attribStart: Double): Unit = js.native
    /**
      * End batch part
      *
      * @param {number} endIndex
      * @param {number} endAttrib
      */
    def end(endIndex: Double, endAttrib: Double): Unit = js.native
  }
  
}

