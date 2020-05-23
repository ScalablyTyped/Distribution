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
    * @default 1
    */
  var color: Double
  /**
    * The transform aplpied to the texture.
    *
    * @member {string} PIXI.FillStyle#matrix
    * @default 0
    */
  var matrix: String
  /**
    * The texture to be used for the fill.
    *
    * @member {string} PIXI.FillStyle#texture
    * @default 0
    */
  var texture: String
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
    matrix: String,
    reset: () => Unit,
    texture: String,
    visible: Boolean
  ): FillStyle = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
}

