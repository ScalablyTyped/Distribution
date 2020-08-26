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
@js.native
trait FillStyle extends js.Object {
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  var alpha: Double = js.native
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 0xFFFFFF
    */
  var color: Double = js.native
  /**
    * The transform aplpied to the texture.
    *
    * @member {PIXI.Matrix} PIXI.FillStyle#matrix
    * @default null
    */
  var matrix: Matrix = js.native
  /**
    * The texture to be used for the fill.
    *
    * @member {PIXI.Texture} PIXI.FillStyle#texture
    * @default 0
    */
  var texture: Texture = js.native
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  var visible: Boolean = js.native
  /**
    * Destroy and don't use after this
    */
  def destroy(): Unit = js.native
  /**
    * Reset
    */
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class FillStyleOps[Self <: FillStyle] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setMatrix(value: Matrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setTexture(value: Texture): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

