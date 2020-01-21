package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyRenderOptionsSprite extends js.Object {
  /**
    * A `Number` that defines the scaling in the x-axis for the sprite, if any.
    *
    * @property xOffset
    * @type number
    * @default 0
    */
  var xOffset: Double
  /**
    * A `Number` that defines the scaling in the y-axis for the sprite, if any.
    *
    * @property yOffset
    * @type number
    * @default 0
    */
  var yOffset: Double
}

object IBodyRenderOptionsSprite {
  @scala.inline
  def apply(xOffset: Double, yOffset: Double): IBodyRenderOptionsSprite = {
    val __obj = js.Dynamic.literal(xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBodyRenderOptionsSprite]
  }
}

