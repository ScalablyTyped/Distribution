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
    * Line cap style.
    *
    * @member {PIXI.LINE_CAP} PIXI.LineStyle#cap
    * @default PIXI.LINE_CAP.BUTT
    */
  var cap: LINE_CAP
  /**
    * Line join style.
    *
    * @member {PIXI.LINE_JOIN} PIXI.LineStyle#join
    * @default PIXI.LINE_JOIN.MITER
    */
  var join: LINE_JOIN
  /**
    * Miter limit.
    *
    * @member {number} PIXI.LineStyle#miterLimit
    * @default 10
    */
  var miterLimit: Double
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
    cap: LINE_CAP,
    color: Double,
    destroy: () => Unit,
    join: LINE_JOIN,
    matrix: Matrix,
    miterLimit: Double,
    native: Boolean,
    reset: () => Unit,
    texture: Texture,
    visible: Boolean,
    width: Double
  ): LineStyle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), join = join.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

