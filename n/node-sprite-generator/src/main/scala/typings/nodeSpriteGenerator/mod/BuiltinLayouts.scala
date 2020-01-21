package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal
*/
trait BuiltinLayouts extends js.Object

object BuiltinLayouts {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diagonal: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal = this.cast("diagonal")
  @scala.inline
  def horizontal: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def packed: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed = this.cast("packed")
  @scala.inline
  def vertical: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical = this.cast("vertical")
}

