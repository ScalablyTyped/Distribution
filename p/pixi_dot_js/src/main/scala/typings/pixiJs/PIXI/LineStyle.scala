package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the line style for Graphics.
  * @memberof PIXI
  * @class
  * @extends PIXI.FillStyle
  */
@JSGlobal("PIXI.LineStyle")
@js.native
class LineStyle () extends FillStyle {
  /**
    * The alignment of any lines drawn (0.5 = middle, 1 = outter, 0 = inner).
    *
    * @member {number} PIXI.LineStyle#alignment
    * @default 0
    */
  var alignment: Double = js.native
  /**
    * If true the lines will be draw using LINES instead of TRIANGLE_STRIP
    *
    * @member {boolean} PIXI.LineStyle#native
    * @default false
    */
  var native: Boolean = js.native
  /**
    * The width (thickness) of any lines drawn.
    *
    * @member {number} PIXI.LineStyle#width
    * @default 0
    */
  var width: Double = js.native
}

