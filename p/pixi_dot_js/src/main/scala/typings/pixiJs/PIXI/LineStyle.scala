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
trait LineStyle extends FillStyle {
  /**
    * The alignment of any lines drawn (0.5 = middle, 1 = outer, 0 = inner).
    *
    * @member {number} PIXI.LineStyle#alignment
    * @default 0.5
    */
  var alignment: Double
  /**
    * If true the lines will be draw using LINES instead of TRIANGLE_STRIP
    *
    * @member {boolean} PIXI.LineStyle#native
    * @default false
    */
  var native: Boolean
  /**
    * The width (thickness) of any lines drawn.
    *
    * @member {number} PIXI.LineStyle#width
    * @default 0
    */
  var width: Double
}

object LineStyle {
  @scala.inline
  def apply(
    alignment: Double,
    alpha: Double,
    color: Double,
    destroy: () => Unit,
    matrix: String,
    native: Boolean,
    reset: () => Unit,
    texture: String,
    visible: Boolean,
    width: Double
  ): LineStyle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), matrix = matrix.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

