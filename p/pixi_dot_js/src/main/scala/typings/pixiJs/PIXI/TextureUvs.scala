package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores a texture's frame in UV coordinates, in
  * which everything lies in the rectangle `[(0,0), (1,0),
  * (1,1), (0,1)]`.
  *
  * | Corner       | Coordinates |
  * |--------------|-------------|
  * | Top-Left     | `(x0,y0)`   |
  * | Top-Right    | `(x1,y1)`   |
  * | Bottom-Right | `(x2,y2)`   |
  * | Bottom-Left  | `(x3,y3)`   |
  *
  * @class
  * @protected
  * @memberof PIXI
  */
@js.native
trait TextureUvs extends js.Object {
  /**
    * X-component of top-left corner `(x0,y0)`.
    *
    * @member {number} PIXI.TextureUvs#x0
    */
  var x0: Double = js.native
  /**
    * X-component of top-right corner `(x1,y1)`.
    *
    * @member {number} PIXI.TextureUvs#x1
    */
  var x1: Double = js.native
  /**
    * X-component of bottom-right corner `(x2,y2)`.
    *
    * @member {number} PIXI.TextureUvs#x2
    */
  var x2: Double = js.native
  /**
    * X-component of bottom-left corner `(x3,y3)`.
    *
    * @member {number} PIXI.TextureUvs#x3
    */
  var x3: Double = js.native
  /**
    * Y-component of top-left corner `(x0,y0)`.
    *
    * @member {number} PIXI.TextureUvs#y0
    */
  var y0: Double = js.native
  /**
    * Y-component of top-right corner `(x1,y1)`.
    *
    * @member {number} PIXI.TextureUvs#y1
    */
  var y1: Double = js.native
  /**
    * Y-component of bottom-right corner `(x2,y2)`.
    *
    * @member {number} PIXI.TextureUvs#y2
    */
  var y2: Double = js.native
  /**
    * Y-component of bottom-right corner `(x3,y3)`.
    *
    * @member {number} PIXI.TextureUvs#y3
    */
  var y3: Double = js.native
  /**
    * Sets the texture Uvs based on the given frame information.
    *
    * @protected
    * @param {PIXI.Rectangle} frame - The frame of the texture
    * @param {PIXI.Rectangle} baseFrame - The base frame of the texture
    * @param {number} rotate - Rotation of frame, see {@link PIXI.groupD8}
    */
  /* protected */ def set(frame: Rectangle, baseFrame: Rectangle, rotate: Double): Unit = js.native
}

object TextureUvs {
  @scala.inline
  def apply(
    set: (Rectangle, Rectangle, Double) => Unit,
    x0: Double,
    x1: Double,
    x2: Double,
    x3: Double,
    y0: Double,
    y1: Double,
    y2: Double,
    y3: Double
  ): TextureUvs = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction3(set), x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], y3 = y3.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureUvs]
  }
  @scala.inline
  implicit class TextureUvsOps[Self <: TextureUvs] (val x: Self) extends AnyVal {
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
    def setSet(value: (Rectangle, Rectangle, Double) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setX3(value: Double): Self = this.set("x3", value.asInstanceOf[js.Any])
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY3(value: Double): Self = this.set("y3", value.asInstanceOf[js.Any])
  }
  
}

