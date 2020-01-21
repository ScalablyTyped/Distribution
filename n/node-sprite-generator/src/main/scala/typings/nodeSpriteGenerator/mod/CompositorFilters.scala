package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average
  - typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth
*/
trait CompositorFilters extends js.Object

object CompositorFilters {
  @scala.inline
  def all: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all = this.cast("all")
  @scala.inline
  def average: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none = this.cast("none")
  @scala.inline
  def paeth: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth = this.cast("paeth")
  @scala.inline
  def sub: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub = this.cast("sub")
  @scala.inline
  def up: typings.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up = this.cast("up")
}

