package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fill style object for Graphics.
  *
  * @class
  * @memberof PIXI
  */
trait FillStyle extends js.Object {
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  var alpha: Double
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 0xFFFFFF
    */
  var color: Double
  /**
    * The transform aplpied to the texture.
    *
    * @member {PIXI.Matrix} PIXI.FillStyle#matrix
    * @default null
    */
  var matrix: Matrix
  /**
    * The texture to be used for the fill.
    *
    * @member {PIXI.Texture} PIXI.FillStyle#texture
    * @default 0
    */
  var texture: Texture
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  var visible: Boolean
  /**
    * Destroy and don't use after this
    */
  def destroy(): Unit
  /**
    * Reset
    */
  def reset(): Unit
}

object FillStyle {
  @scala.inline
  def apply(
    alpha: Double,
    color: Double,
    destroy: () => Unit,
    matrix: Matrix,
    reset: () => Unit,
    texture: Texture,
    visible: Boolean
  ): FillStyle = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
}

