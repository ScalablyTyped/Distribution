package typings.phaser.typesMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyRenderOptionsSprite extends js.Object {
  /**
    * An `String` that defines the path to the image to use as the sprite texture, if any.
    *
    * @property render.sprite.texture
    * @type string
    */
  var texture: String
  /**
    * A `Number` that defines the scaling in the x-axis for the sprite, if any.
    *
    * @property render.sprite.xScale
    * @type number
    * @default 1
    */
  var xScale: Double
  /**
    * A `Number` that defines the scaling in the y-axis for the sprite, if any.
    *
    * @property render.sprite.yScale
    * @type number
    * @default 1
    */
  var yScale: Double
}

object IBodyRenderOptionsSprite {
  @scala.inline
  def apply(texture: String, xScale: Double, yScale: Double): IBodyRenderOptionsSprite = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBodyRenderOptionsSprite]
  }
}

