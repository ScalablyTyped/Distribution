package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This handles a Sprite acting as a mask, as opposed to a Graphic.
  *
  * WebGL only.
  *
  * @class
  * @extends PIXI.Filter
  * @memberof PIXI
  */
@JSGlobal("PIXI.SpriteMaskFilter")
@js.native
class SpriteMaskFilter protected () extends Filter {
  def this(sprite: Sprite) = this()
  /**
    * Mask matrix
    * @member {PIXI.Matrix} PIXI.SpriteMaskFilter#maskMatrix
    */
  var maskMatrix: Matrix = js.native
  /**
    * Sprite mask
    * @member {PIXI.Sprite} PIXI.SpriteMaskFilter#maskSprite
    */
  var maskSprite: Sprite = js.native
}

