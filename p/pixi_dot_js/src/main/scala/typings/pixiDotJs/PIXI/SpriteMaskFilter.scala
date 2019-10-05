package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SpriteMaskFilter class
  */
@JSGlobal("PIXI.SpriteMaskFilter")
@js.native
class SpriteMaskFilter protected () extends Filter[SpriteMaskFilterUniforms] {
  def this(sprite: Sprite) = this()
  var maskMatrix: Matrix = js.native
  var maskSprite: Sprite = js.native
}

