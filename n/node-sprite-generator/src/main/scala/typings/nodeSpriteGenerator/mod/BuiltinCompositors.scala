package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp
*/
trait BuiltinCompositors extends js.Object

object BuiltinCompositors {
  @scala.inline
  def canvas: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gm: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm = this.cast("gm")
  @scala.inline
  def jimp: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp = this.cast("jimp")
}

